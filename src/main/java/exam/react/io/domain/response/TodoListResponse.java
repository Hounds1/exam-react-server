package exam.react.io.domain.response;

import exam.react.io.domain.entity.Todo;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class TodoListResponse {

    private int size;
    private final List<TodoResponse> data;

    private TodoListResponse() {
        this.size = 0;
        this.data = new ArrayList<>();
    }

    public void add(Todo e) {
        this.data.add(TodoResponse.exchange(e));
        this.size++;
    }

    public static TodoListResponse createEmpty() {
        return new TodoListResponse();
    }
}
