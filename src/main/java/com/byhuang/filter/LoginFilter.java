package com.byhuang.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Objects;

@WebFilter("/hello.jsp")
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpSession session = httpServletRequest.getSession();
        System.out.println(session.getId());
        Object isLogin = session.getAttribute("is_login");
        if (Objects.isNull(isLogin) || !(boolean) isLogin) {
            httpServletRequest.getRequestDispatcher("/a.html").forward(servletRequest, servletResponse);
        }
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("request back...");
    }

    @Override
    public void destroy() {

    }
}
