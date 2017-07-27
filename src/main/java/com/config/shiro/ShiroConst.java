package com.config.shiro;


import com.base.message.BaseErrorMessage;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthenticatedException;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 * Created by Administrator on 2017/7/26.
 */
public class ShiroConst {
    public static HashMap<String, BaseErrorMessage> EXCEPTION_ERRORMESSAGE_MAP = new HashMap<>();

    static {
        //配置shiro的异常对应的ErrorMessage
        EXCEPTION_ERRORMESSAGE_MAP.put(UnknownAccountException.class.getName(), BaseErrorMessage.getMessage("不存在的用户名!",String.valueOf(HttpServletResponse.SC_UNAUTHORIZED)));
        EXCEPTION_ERRORMESSAGE_MAP.put(IncorrectCredentialsException.class.getName(), BaseErrorMessage.getMessage("密码错误!"));
        EXCEPTION_ERRORMESSAGE_MAP.put(DisabledAccountException.class.getName(), BaseErrorMessage.getMessage("帐号被禁用!"));
        EXCEPTION_ERRORMESSAGE_MAP.put(AuthenticationException.class.getName(), BaseErrorMessage.getMessage("登录异常!"));
        EXCEPTION_ERRORMESSAGE_MAP.put(UnauthenticatedException.class.getName(), BaseErrorMessage.getMessage("权限不足!"));
        EXCEPTION_ERRORMESSAGE_MAP.put(ExpiredCredentialsException.class.getName(), BaseErrorMessage.getMessage("请先登录!"));
        EXCEPTION_ERRORMESSAGE_MAP.put(AuthorizationException.class.getName(), BaseErrorMessage.getMessage("凭证超时,请重新登录!"));

    }
}
