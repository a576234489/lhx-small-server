package com.lhx.mall.common.api;

public class CommonResult<T> {
    private long code;
    private String message;
    private T data;

    public CommonResult() {
    }

    public CommonResult(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     */
    public static <T>CommonResult<T> success(T data) {
        return  new CommonResult<T>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage(),data);
    }
    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     * @param  message 提示信息
     */
    public static <T>CommonResult<T> success(T data,String msg){
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(),msg,data);
    }
    /**
     * 失败返回结果
     * @param errorCode 错误码
     */
    public static <T>CommonResult<T> failed(IErrorCode iErrorCode){
        return new CommonResult<T>(iErrorCode.getCode(),iErrorCode.getMessage(),null);
    }
    /**
     * 失败返回结果
     * @param message 提示信息
     */
    public static <T>CommonResult<T> failed(String message){
        return new CommonResult<T>(ResultCode.FAILED.getCode(),message,null);
    }
    /**
     * 失败返回结果
     */
    public static <T>CommonResult<T> failed(){
        return failed(ResultCode.FAILED);
    }
    /**
     * 参数验证失败返回结果
     */
    public static <T>CommonResult<T> validateFailed(){
        return failed(ResultCode.VALIDATE_FAILED);
    }
    /**
     * 参数验证失败返回结果
     * @param message 提示信息
     */
    public static <T>CommonResult<T> validateFailed(String message){
        return new CommonResult<T>(ResultCode.VALIDATE_FAILED.getCode(),message,null);
    }
    /**
     * 未登录返回结果
     */
    public static <T>CommonResult<T> unauthorized(T data){
        return new <T>CommonResult<T>(ResultCode.UNAUTHORIZED.getCode(),ResultCode.UNAUTHORIZED.getMessage(),data);
    }
    /**
     * 未授权返回结果
     */
    public static <T>CommonResult<T> forbidden(T data){
        return new <T>CommonResult<T>(ResultCode.FORBIDDEN.getCode(),ResultCode.FORBIDDEN.getMessage(),data);
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
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
