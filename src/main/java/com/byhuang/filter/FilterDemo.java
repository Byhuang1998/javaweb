package com.byhuang.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class FilterDemo implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter demo...");
        // 一定要有这一行，表示处理完请求后，放行，会请求到对应的servlet
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("request back...");
    }

    @Override
    public void destroy() {

    }
}
