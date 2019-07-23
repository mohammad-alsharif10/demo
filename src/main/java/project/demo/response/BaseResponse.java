package project.demo.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BaseResponse {

    private boolean errorStatus;
    private String responseMessage;
    private String errorCode;

    BaseResponse(boolean errorStatus, String responseMessage, String errorCode) {
        this.errorStatus = errorStatus;
        this.responseMessage = responseMessage;
        this.errorCode = errorCode;
    }


    BaseResponse(boolean errorStatus, String errorCode) {
        this.errorStatus = errorStatus;
        this.responseMessage = errorCode;
    }


    BaseResponse() {
    }


}
