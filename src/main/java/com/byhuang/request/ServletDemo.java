package com.byhuang.request;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/hello")
public class ServletDemo extends MyServlet {

    @Override
    protected void doGet(ServletRequest servletRequest, ServletResponse servletResponse) {
        super.doGet(servletRequest, servletResponse);
    }

    @Override
    protected void doPost(ServletRequest servletRequest, ServletResponse servletResponse) {
        super.doPost(servletRequest, servletResponse);
    }
}
