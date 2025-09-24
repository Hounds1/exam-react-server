package exam.react.io.repository;

import exam.react.io.domain.entity.Todo;
import exam.react.io.domain.request.ModificationRequest;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TodoRepository {

    private static final Map<String, Todo> CONTAINER = new ConcurrentHashMap<>(100, 0.85f);

    public static Todo select(String signature) {
        Todo todo = CONTAINER.get(signature);
        if (todo == null) throw new RuntimeException("Not exists signature.");
        return todo;
    }

    public static List<Todo> selectAll() {
        return List.copyOf(CONTAINER.values());
    }

    public static Todo insert(Todo e) {
        return CONTAINER.computeIfAbsent(e.getSignature(), val -> e);
    }

    public static Todo modify(ModificationRequest req) {
        Todo origin = CONTAINER.get(req.getSignature());
        origin.transition(req);

        return origin;
    }

    public static boolean remove(String signature, String removedBy) {
        Todo origin = CONTAINER.get(signature);
        origin.remove(removedBy);
        return CONTAINER.remove(signature) != null;
    }
}
