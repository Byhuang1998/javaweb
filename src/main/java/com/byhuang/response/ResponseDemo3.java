package com.byhuang.response;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 响应字节数据：设置字节数据的响应体
 */
@WebServlet("/res3")
public class ResponseDemo3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("res3...");

        FileInputStream fileInputStream = new FileInputStream("/Users/huangbingyi/Desktop/pic.png");

        ServletOutputStream outputStream = resp.getOutputStream();

        IOUtils.copy(fileInputStream, outputStream);  // 一直提示工具类找不到

        fileInputStream.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
