package exam.react.io.domain.request;

import exam.react.io.global.support.ChronoSupport;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class CreationRequest {

    private final String signature = UUID.randomUUID().toString();
    private String title;
    private String priority;
    private String dueDate;
    private final String generatedBy = "Some User";
    private final long generatedAt = ChronoSupport.epoch();
}
