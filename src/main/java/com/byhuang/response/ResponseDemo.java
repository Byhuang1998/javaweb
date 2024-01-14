package com.byhuang.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/res1")
public class ResponseDemo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("res1...");
        // 设置完状态码和请求头location，即可完成重定向
//        resp.setStatus(302);
//        resp.setHeader("location", "/javaweb/res2");

        String contextPath = req.getContextPath();
        // 简化方式完成重定向
        resp.sendRedirect(contextPath + "/res2");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setStatus(302);
        resp.setHeader("location", "/javaweb/res2");

    }
}
