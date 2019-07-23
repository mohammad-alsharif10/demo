package project.demo.response;


import lombok.Getter;
import lombok.Setter;
import project.demo.models.BaseEntity;

@Getter
@Setter
public class SingleResult extends BaseResponse {

    private BaseEntity baseEntity;

    public SingleResult(boolean errorStatus, String responseMessage, String errorCode, BaseEntity baseEntity) {
        super(errorStatus, responseMessage, errorCode);
        this.baseEntity = baseEntity;
    }

    public SingleResult(boolean errorStatus, String errorCode, BaseEntity baseEntity) {
        super(errorStatus, errorCode);
        this.baseEntity = baseEntity;
    }

    public SingleResult(BaseEntity baseEntity) {
        this.baseEntity = baseEntity;
    }
}
