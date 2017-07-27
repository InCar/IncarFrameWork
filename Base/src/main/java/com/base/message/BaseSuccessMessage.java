package com.base.message;

import com.base.json.JsonMessage;

/**
 * Created by Administrator on 2017/7/26.
 */
public abstract class BaseSuccessMessage {
    public abstract JsonMessage toJsonMessage();

    public static BaseSuccessMessage getMessage(String msg){
        return new DefaultSuccessMessage(msg);
    }
    public static BaseSuccessMessage getMessage(String msg,String code){
        return new DefaultSuccessMessage(msg,code);
    }
}
