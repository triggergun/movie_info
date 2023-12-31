package top.wutunan.moviecore.Result;

import java.util.HashMap;
import java.util.Map;

public class ApiResult {

    private int code;
    private String msg;
    private Object data;

    public static ApiResult ok() {
        return new ApiResult();
    }

    public static ApiResult ok(Object data) {
        return new ApiResult(data);
    }

    public static ApiResult ok(String msg) {
        return new ApiResult(0, msg);
    }

    public static ApiResult error(String msg) {
        return new ApiResult(-1, msg);
    }

    public static ApiResult error(int code, String msg) {
        return new ApiResult(code, msg);
    }

    public static ApiResult error(int code, String msg, Object data) {
        return new ApiResult(code, msg, data);
    }

    public static ApiResult init(int code, String msg, Object data) {
        return new ApiResult(code, msg, data);
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    /**
     * 初始化这个对象
     */
    public ApiResult() {
        this.code = 0;
        this.msg = "请求成功";
    }


    /**
     *
     * @param data 这个对象是 Object对象
     */
    public ApiResult(Object data) {
        this.code = 0;
        this.msg = "请求成功";
        this.data = data;
    }

    public ApiResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ApiResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ApiResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }



}
