package com.base.exception;

import com.base.message.DefaultErrorMessage;
import com.base.json.JsonMessage;

/**
 * Created by Administrator on 2017/7/26.
 */
public class DefaultRuntimeException extends BaseRuntimeException {
    private String code;
    private String msg;

    public DefaultRuntimeException() {
    }

    public DefaultRuntimeException(String message) {
        this.msg = message;
    }


    public DefaultRuntimeException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public DefaultRuntimeException(DefaultErrorMessage errorMessage){
        this(errorMessage.getCode(),errorMessage.getMsg());
    }

    @Override
    public JsonMessage toJsonMessage() {
        //如果message为空且i18nData不为空,则使用i18nData
        return JsonMessage.failed(msg,code);
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

}
