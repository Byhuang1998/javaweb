package com.byhuang.login;

import com.byhuang.mvc.mapper.UserMapper;
import com.byhuang.mvc.util.SqlSessionFactoryUtil;
import com.byhuang.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Objects;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        String username = (String) req.getParameter("username");
        String password = (String) req.getParameter("password");

        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByName(username);
        System.out.println(user);
        if (Objects.nonNull(user) && password.equals(user.getPassword())) {
            session.setAttribute("is_login", true);
        }
        req.getRequestDispatcher("/hello.jsp").forward(req, resp);
    }
}
