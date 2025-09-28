package exam.react.io.domain.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ModificationRequest {

    private String signature;
    private String title;
    private String dueDate;
    private String priority;
    private String modifiedBy;
}
