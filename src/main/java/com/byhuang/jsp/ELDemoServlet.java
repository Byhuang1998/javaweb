package com.byhuang.jsp;

import com.byhuang.pojo.Brand;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/el-demo")
public class ELDemoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get...");
        List<Brand> brands = new ArrayList<>();
        brands.add(new Brand("三只松鼠", "三只松鼠", 100, "三只松鼠，好吃不上火", 1));
        brands.add(new Brand("优衣库", "优衣库", 10, "优衣库，舒服", 0));
        brands.add(new Brand("小米", "小米", 1000, "小米", 1));

        req.setAttribute("brands", brands);
        req.getRequestDispatcher("/el-demo.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}