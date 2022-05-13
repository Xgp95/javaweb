import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author: Xugp
 * @date: 2022/2/18 14:47
 * @description:
 */
public class SessionServlet extends BaseServlet{
    protected void deleteNow(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        HttpSession session = req.getSession();
        session.invalidate();
        resp.getWriter().write("当前session设置为立刻销毁");
    }
    protected void defaultLife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        HttpSession session = req.getSession();
        int maxInactiveInterval = session.getMaxInactiveInterval();
        resp.getWriter().write("当前session的默认超时时间为：" + maxInactiveInterval);
    }
    protected void life3(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        HttpSession session = req.getSession();
        session.setMaxInactiveInterval(3);
        resp.getWriter().write("当前session设置为3秒超时");
    }

    protected void setAttribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        HttpSession session = req.getSession();
        session.setAttribute("key", "value");
    }
    protected void getAttribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        HttpSession session = req.getSession();
        Object value = session.getAttribute("key");
        resp.getWriter().write("从session中获取key的数据" + value);
    }
    protected void createSession(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        boolean aNew = session.isNew();
        System.out.println(aNew);
        String id = session.getId();
        System.out.println(id);

        resp.getWriter().write("得到一个session，他的id是：" + id + "<br/>");
        resp.getWriter().write("这个session，是新创建的：" + aNew);
    }
}
