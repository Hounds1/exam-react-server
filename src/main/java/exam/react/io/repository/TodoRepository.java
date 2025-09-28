package exam.react.io.repository;

import exam.react.io.domain.entity.Todo;
import exam.react.io.domain.request.ModificationRequest;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
public class TodoRepository {

    private static final Map<String, Todo> CONTAINER = new ConcurrentHashMap<>(100, 0.85f);

    public static Todo select(String signature) {
        log.info("Signature inbound : {}", signature);
        Todo todo = CONTAINER.get(signature);
        if (todo == null) throw new RuntimeException("Not exists signature.");
        return todo;
    }

    public static List<Todo> selectAll() {
        log.info("Select command inbound.");
        log.info("Containing {} elements.", CONTAINER.size());
        return List.copyOf(CONTAINER.values());
    }

    public static Todo insert(Todo e) {
        log.info("Inserting : {}", e.getSignature());
        return CONTAINER.computeIfAbsent(e.getSignature(), val -> e);
    }

    public static Todo modify(ModificationRequest req) {
        log.info("Modification request inbound. Signature : {}", req.getSignature());
        Todo origin = CONTAINER.get(req.getSignature());
        origin.transition(req);

        log.info("Todo modified. Signature : {}", req.getSignature());

        return origin;
    }

    public static boolean remove(String signature, String removedBy) {
        Todo origin = CONTAINER.get(signature);
        origin.remove(removedBy);
        log.info("Signature removed: {}", signature);
        return CONTAINER.remove(signature) != null;
    }
}
