package servlet;

import pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Xugp
 * @date: 2022/1/13 17:34
 * @description:
 */
public class SearchForStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> studentList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            studentList.add(new Student(i, "name" + i, 18 + i, "phone" + i));
        }
        req.setAttribute("studentlist", studentList);
        req.getRequestDispatcher("/stutest.jsp").forward(req, resp);
    }
}
