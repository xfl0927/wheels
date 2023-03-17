package org.wheels.core.original;

/**
 * 响应结果
 * @author huangwl
 * @since 2023-03-09 11:56
 */
public class RespResult<T> {
    protected static final Integer successCode = 200;
    protected static final String successMessage = "成功";
    protected static final Integer errorCode = 500;
    protected static final String errorMessage = "失败";
    /**
     * 响应编码
     */
    protected Integer code;
    /**
     * 响应信息
     */
    protected String message;
    /**
     * 响应数据
     */
    protected T data;

    public RespResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 响应成功
     * @param data 响应数据
     * @return 响应成功
     */
    public static <T> RespResult<T> success(T data){
        return new RespResult<>(successCode, successMessage, data);
    }

    /**
     * 响应失败
     * @return 响应失败
     */
    public static <T> RespResult<T> fail(){
        return new RespResult<>(errorCode, errorMessage, null);
    }

    /**
     * 是否成功 服务间调用使用，单服务中禁止使用！
     * @return true/false
     */
    public Boolean isSuccess(){
        return this.getCode().equals(successCode);
    }

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
}
