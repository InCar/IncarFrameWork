package com.base.message;

import com.base.json.JsonMessage;

/**
 * Created by Administrator on 2017/7/26.
 */
public class DefaultSuccessMessage extends BaseSuccessMessage{
    private String code;
    private String msg;

    public DefaultSuccessMessage() {
    }

    public DefaultSuccessMessage(String msg) {
        this.msg = msg;
    }


    public DefaultSuccessMessage(String msg,String code) {
        this.code = code;
        this.msg = msg;
    }


    @Override
    public JsonMessage toJsonMessage() {
        return null;
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
