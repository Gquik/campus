package com.js.campus.entity.response;

import java.io.Serializable;

public class Response<T> implements Serializable {
    private static final long serialVersionUID = -6793153888875639581L;

    private String code = "200";
    private String message;
    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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
