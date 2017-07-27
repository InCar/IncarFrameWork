package com.config.shiro;

import com.base.json.JsonMessage;
import com.base.util.JsonUtil;
import org.apache.shiro.web.filter.authc.AuthenticationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义的authc的过滤器，替换shiro默认的过滤器
 */
public class MyAuthenticationFilter extends AuthenticationFilter{
    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        if(!response.isCommitted()){
            response.setCharacterEncoding("UTF-8");
            response.getWriter().print(
                    JsonUtil.toDefaultJSONString(new JsonMessage<>(false, "请先登录!",
                            "",String.valueOf(HttpServletResponse.SC_UNAUTHORIZED)
                    ))
            );
        }
        return false;
    }
}
