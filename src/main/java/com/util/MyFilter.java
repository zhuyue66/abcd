package com.util;

import com.bean.Users;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 9:15 2019/7/8
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        Users users = (Users) request.getSession().getAttribute("nowuser");//查询session中的用户
        if (users != null) {
            filterChain.doFilter(request, response);//用户已经登录
        } else {
            System.out.println("MyFilter 用户没有登录重定向至登录界面");
            response.sendRedirect("/abcd/login.jsp");//用户没有登录，跳转登录界面
            System.out.println("MyFilter 用户没有登录重定向至登录界面++");
        }
    }

    @Override
    public void destroy() {

    }
}
