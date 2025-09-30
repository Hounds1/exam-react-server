package exam.react.io.service;

import exam.react.io.domain.entity.Todo;
import exam.react.io.domain.request.CreationRequest;
import exam.react.io.domain.request.ModificationRequest;
import exam.react.io.domain.request.TodoSearchRequest;
import exam.react.io.domain.response.TodoListResponse;
import exam.react.io.domain.response.TodoResponse;
import exam.react.io.repository.TodoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Stream;

@Service
@Slf4j
public class TodoService {

    public TodoListResponse list(TodoSearchRequest req) {
        List<Todo> elements = TodoRepository.selectAll();
        TodoListResponse response = TodoListResponse.createEmpty();

        Stream<Todo> stream = elements.stream();
        stream = stream.filter(e -> !e.isRemoved());
        if (StringUtils.hasText(req.getKeyword())) stream = stream.filter(e-> e.getTitle().contains(req.getKeyword()));

        stream.toList().forEach(response::add);

        return response;
    }

    public TodoResponse details(String signature) {
        Todo element = TodoRepository.select(signature);
        return TodoResponse.exchange(element);
    }

    public TodoResponse complete(final String signature) {
        Todo element = TodoRepository.select(signature);

        if (!element.isCompleted()) element.switchCompleted();
        return TodoResponse.exchange(element);
    }

    public TodoResponse incomplete(final String signature) {
        Todo element = TodoRepository.select(signature);

        if (element.isCompleted()) element.switchCompleted();
        return TodoResponse.exchange(element);
    }

    public TodoResponse insert(CreationRequest req) {
        Todo inserted = TodoRepository.insert(Todo.exchange(req));
        if (inserted == null) throw new IllegalStateException("insert failed");

        return TodoResponse.exchange(inserted);
    }

    public TodoResponse modify(ModificationRequest req) {
        Todo modified = TodoRepository.modify(req);

        return TodoResponse.exchange(modified);
    }

    public boolean remove(String signature) {
        boolean removed = TodoRepository.remove(signature, "remover");

        if (!removed) throw new IllegalStateException("remove failed");

        return true;
    }
}
