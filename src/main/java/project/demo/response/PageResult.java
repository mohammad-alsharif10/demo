package project.demo.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class PageResult extends BaseResponse {

    private List data;
    private Long totalElements;
    private int numberOfPages;

    public PageResult(boolean errorStatus, String responseMessage, String errorCode, List data, Long totalElements, int numberOfPages) {
        super(errorStatus, responseMessage, errorCode);
        this.data = data;
        this.totalElements = totalElements;
        this.numberOfPages = numberOfPages;
    }

    public PageResult(boolean errorStatus, String errorCode, List data, Long totalElements, int numberOfPages) {
        super(errorStatus, errorCode);
        this.data = data;
        this.totalElements = totalElements;
        this.numberOfPages = numberOfPages;
    }

    public PageResult(List data, Long totalElements, int numberOfPages) {
        this.data = data;
        this.totalElements = totalElements;
        this.numberOfPages = numberOfPages;
    }
}
