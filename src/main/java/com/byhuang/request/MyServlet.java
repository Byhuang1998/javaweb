package com.byhuang.request;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public abstract class MyServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;

        String method = httpServletRequest.getMethod();

        if ("GET".equals(method)) {
            System.out.println("get method...");
            // GET方法获取参数，并进行相应处理
            doGet(servletRequest, servletResponse);
        } else if ("POST".equals(method)) {
            System.out.println("post method...");
            // POST方法获取参数，并进行相应处理
            doPost(servletRequest, servletResponse);
        }
        System.out.println("hello servlet!");
    }


    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }

    protected void doGet(ServletRequest servletRequest, ServletResponse servletResponse) {
        // do something
    }

    protected void doPost(ServletRequest servletRequest, ServletResponse servletResponse) {
        // do something
    }

        
}

    
