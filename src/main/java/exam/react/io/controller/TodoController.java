package exam.react.io.controller;

import exam.react.io.domain.request.CreationRequest;
import exam.react.io.domain.request.ModificationRequest;
import exam.react.io.domain.response.TodoListResponse;
import exam.react.io.domain.response.TodoResponse;
import exam.react.io.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/react-exam/todos")
public class TodoController {

    private final TodoService todoService;

    @GetMapping("/list")
    public ResponseEntity<TodoListResponse> list() {
        TodoListResponse res = todoService.list();

        return ResponseEntity.status(HttpStatus.OK).body(res);
    }

    @GetMapping("/{signature}")
    public ResponseEntity<TodoResponse> details(@PathVariable String signature) {
        TodoResponse res = todoService.details(signature);
        return ResponseEntity.status(HttpStatus.OK).body(res);
    }

    @PostMapping
    public ResponseEntity<TodoResponse> creation(CreationRequest insReq) {
        TodoResponse response = todoService.insert(insReq);

        if (response != null) return ResponseEntity.status(HttpStatus.CREATED).body(response);
        else return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @PatchMapping
    public ResponseEntity<TodoResponse> modification(ModificationRequest modReq) {
        TodoResponse response = todoService.modify(modReq);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @DeleteMapping("/{signature}")
    public ResponseEntity<Void> remove(@PathVariable String signature) {
        boolean removed = todoService.remove(signature);

        if (removed) return ResponseEntity.status(HttpStatus.OK).build();
        else return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}
