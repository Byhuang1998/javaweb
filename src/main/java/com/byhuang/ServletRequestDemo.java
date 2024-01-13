package com.byhuang;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/req1")
public class ServletRequestDemo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 1 请求行
        // 获取请求方式
        String method = req.getMethod();
        System.out.println(method);
        // 获取虚拟目录（项目访问路径）
        String contextPath = req.getContextPath();
        System.out.println(contextPath);
        // 获取URL（统一资源定位符）
        StringBuffer requestURL = req.getRequestURL();
        System.out.println(requestURL);
        // 获取URI（统一资源标识符）
        String requestURI = req.getRequestURI();
        System.out.println(requestURI);
        // 获取请求参数
        String queryString = req.getQueryString();
        System.out.println(queryString);

        // 2 请求头
        String header = req.getHeader("user-agent");
        System.out.println(header);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 3 请求体
        BufferedReader reader = req.getReader();
        String s = reader.readLine();
        System.out.println(s);
    }
}
