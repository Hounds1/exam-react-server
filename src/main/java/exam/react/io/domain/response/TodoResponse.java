package exam.react.io.domain.response;

import exam.react.io.domain.entity.Todo;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class TodoResponse {

    private String signature;
    private String title;
    private String dueDate;
    private String priority;
    private boolean completed;
    private long generatedAt;
    private String generatedBy;
    private long modifiedAt;
    private String modifiedBy;
    private long removedAt;
    private String removedBy;

    public static TodoResponse exchange(Todo origin) {
        return new TodoResponse(origin.getSignature(), origin.getTitle(), origin.getDueDate(), origin.getPriority(), origin.isCompleted(), origin.getGeneratedAt(),
                origin.getGeneratedBy(), origin.getModifiedAt(), origin.getModifiedBy(), origin.getRemovedAt(), origin.getRemovedBy());
    }
}
