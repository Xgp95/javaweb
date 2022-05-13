package servlet;

import com.google.gson.Gson;
import pojo.Form;
import pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: Xugp
 * @date: 2022/2/25 17:30
 * @description:
 */
public class AjaxServlet extends BaseServlet {

    protected void jQuerySerialize(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String radio = req.getParameter("radio");
        String referer = req.getHeader("referer");
        System.out.println(referer);
        Form form = new Form(username, password, radio);
        System.out.println(form);
        Gson gson = new Gson();
        String formJson = gson.toJson(form);
        System.out.println("---->>" + formJson);
        resp.getWriter().write(formJson);
    }

    protected void jQueryGetJson(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Person person = new Person(005, "王五");
        Gson gson = new Gson();
        String personJson = gson.toJson(person);
        resp.getWriter().write(personJson);
    }

    protected void jQueryPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Person person = new Person(004, "李四");
        Gson gson = new Gson();
        String personJson = gson.toJson(person);
        resp.getWriter().write(personJson);
    }

    protected void jQueryGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Person person = new Person(003, "张三");
        Gson gson = new Gson();
        String personJson = gson.toJson(person);
        resp.getWriter().write(personJson);
    }

    protected void jQueryAjax(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Person person = new Person(002, "张三");
        Gson gson = new Gson();
        String personJson = gson.toJson(person);
        resp.getWriter().write(personJson);
    }

    protected void javaScriptAjax(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Person person = new Person(001, "xugp");
        Gson gson = new Gson();
        String personJson = gson.toJson(person);
        resp.getWriter().write(personJson);
    }
}
