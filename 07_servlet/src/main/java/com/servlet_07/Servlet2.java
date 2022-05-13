package com.servlet_07;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        System.out.println("Servlet2中的：" + username);
        Object value = req.getAttribute("key");
        System.out.println("Servlet1的章" + value);
        System.out.println("Servlet2运行");
    }
}
