package com.base.message;

import com.base.exception.BaseRuntimeException;
import com.base.exception.DefaultRuntimeException;
import com.base.json.JsonMessage;

/**
 * Created by Administrator on 2017/7/26.
 */
public class DefaultErrorMessage extends BaseErrorMessage{
    private String code;
    private String msg;

    public DefaultErrorMessage() {
    }

    public DefaultErrorMessage(String msg) {
        this.msg = msg;
    }


    public DefaultErrorMessage(String msg,String code) {
        this.code = code;
        this.msg = msg;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public JsonMessage toJsonMessage() {
        return JsonMessage.failed(msg,code);
    }

    @Override
    public BaseRuntimeException toRuntimeException() {
        return new DefaultRuntimeException(this);
    }
}
