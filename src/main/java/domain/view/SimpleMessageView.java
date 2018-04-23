package domain.view;

/**
 * 接收其他服务返回的数据
 * Created by dxm on 2017/12/13.
 */
public class SimpleMessageView {
    private Integer code;
    private String message;
    private Object data;
    private String id;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
