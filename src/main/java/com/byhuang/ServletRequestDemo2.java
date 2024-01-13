package com.byhuang;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;

@WebServlet("/req2")
public class ServletRequestDemo2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get...");
        // getParameterMap 获取所有参数Map集合
        Map<String, String[]> parameterMap = req.getParameterMap();
        for (String key : parameterMap.keySet()) {
            System.out.println(key);
            String[] values = parameterMap.get(key);
            for (String value : values) {
                System.out.println(value);
            }
        }

        System.out.println("-----------");
        // getParameterValue 根据名称获取参数值（数组）
        String[] hobbies = req.getParameterValues("hobby");
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }

        // getParameter 根据名称获取参数值（单个）
        String password = req.getParameter("password");
        System.out.println(password);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get...");
        // getParameterMap 获取所有参数Map集合
        Map<String, String[]> parameterMap = req.getParameterMap();
        for (String key : parameterMap.keySet()) {
            System.out.println(key);
            String[] values = parameterMap.get(key);
            for (String value : values) {
                System.out.println(value);
            }
        }

        System.out.println("-----------");
        // getParameterValue 根据名称获取参数值（数组）
        String[] hobbies = req.getParameterValues("hobby");
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }

        System.out.println("-----------");
        // getParameter 根据名称获取参数值（单个）
        String password = req.getParameter("password");
        System.out.println(password);
    }
}
