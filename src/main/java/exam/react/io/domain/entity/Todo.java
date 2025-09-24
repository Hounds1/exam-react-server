package exam.react.io.domain.entity;

import exam.react.io.domain.request.CreationRequest;
import exam.react.io.domain.request.ModificationRequest;
import exam.react.io.global.constants.GlobalPolicyProvider;
import exam.react.io.global.support.ChronoSupport;
import lombok.Getter;

@Getter
public class Todo {

    private final String signature;
    private String title;
    private String body;
    private final long generatedAt;
    private final String generatedBy;
    private long modifiedAt;
    private String modifiedBy;
    private boolean removed;
    private long removedAt;
    private String removedBy;

    private Todo(CreationRequest req) {
        this.signature = req.getSignature();
        this.title = req.getTitle();
        this.body = req.getBody();
        this.generatedAt = req.getGeneratedAt();
        this.generatedBy = req.getGeneratedBy();
        this.modifiedAt = GlobalPolicyProvider.TIME_SENTINEL;
        this.removed = false;
        this.removedAt = GlobalPolicyProvider.TIME_SENTINEL;
    }

    public static Todo exchange(CreationRequest req) {
        return new Todo(req);
    }

    public void transition(ModificationRequest feature) {
        this.title = feature.getTitle();
        this.body = feature.getBody();
        this.modifiedAt = ChronoSupport.epoch();
        this.modifiedBy = feature.getModifiedBy();
    }

    public void remove(String removedBy) {
        this.removed = true;
        this.removedAt = ChronoSupport.epoch();
        this.removedBy = removedBy;
    }
}
