package com.base.message;

import com.base.exception.BaseRuntimeException;
import com.base.json.JsonMessage;

/**
 * Created by Administrator on 2017/7/26.
 */
public abstract class BaseErrorMessage {
    public abstract JsonMessage toJsonMessage();
    public abstract BaseRuntimeException toRuntimeException();

    public static BaseErrorMessage getMessage(String msg){
        return new DefaultErrorMessage(msg);
    }
    public static BaseErrorMessage getMessage(String msg,String code){
        return new DefaultErrorMessage(msg,code);
    }
}
