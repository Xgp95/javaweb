package servlet_06.servlet_06;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class HelloServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("servlt的初始化方法");


    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service被访问！");
        ServletContext context = getServletConfig().getServletContext();
        System.out.println(context.getInitParameter("userName"));
        System.out.println(context.getInitParameter("password"));
        System.out.println(context.getRealPath("/"));
        System.out.println(context.getContextPath());
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String method = httpServletRequest.getMethod();
        if ("GET".equals(method)){
            doGet();
        }else if ("POST".equals(method)){
            dopost();
        };
    }
    public void doGet(){
        System.out.println("get被访问了");

    }
    public void dopost(){
        System.out.println("post被访问了");
    }
    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}