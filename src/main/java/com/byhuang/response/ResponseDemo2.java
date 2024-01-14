package com.byhuang.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 响应字符数据：设置字符数据的响应体
 */
@WebServlet("/res2")
public class ResponseDemo2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("res2...");
        System.out.println(resp.getContentType());
        // 数据格式 以及 编码格式
        resp.setContentType("text/html;charset=utf-8");
        // 1 获取字符输出流
        PrintWriter writer = resp.getWriter();
        writer.write("<h1>aaa</h1>");

        // 流不需要关闭
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
