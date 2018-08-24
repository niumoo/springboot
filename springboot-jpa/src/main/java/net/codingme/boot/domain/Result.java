package net.codingme.boot.domain;

/**
 * Http请求的最外层对象
 *
 * @Author DarcyNiu
 * @date 2018/4/7 22:09
 */
public class Result<T> {

    /**
     * 错误码
     **/
    private Integer code;

    /**
     * 提示信息
     **/
    private String message;

    /**
     * 具体的内容
     **/
    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
