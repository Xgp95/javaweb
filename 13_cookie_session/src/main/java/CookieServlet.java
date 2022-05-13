import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: Xugp
 * @date: 2022/2/18 10:11
 * @description:
 */
public class CookieServlet extends BaseServlet {

    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if ("xugp".equals(username) && "123456".equals(password)){
            Cookie cookie = new Cookie("username", username);
            cookie.setMaxAge(60*60*24*7);
            resp.addCookie(cookie);
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }

    protected void testPath(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("pathkey", "pathvalue");
        cookie.setMaxAge(3600);
        cookie.setPath("/test");
        resp.addCookie(cookie);
        resp.getWriter().write("创建life3600秒带path/test的cookie");
    }

    protected void life3600(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("key3600", "value3600");
        cookie.setMaxAge(3600);
        resp.addCookie(cookie);
        resp.getWriter().write("创建life3600秒的cookie");
    }

    protected void deleteNow(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("key2", "value2");
        cookie.setMaxAge(0);
        resp.addCookie(cookie);
        resp.getWriter().write("立即删除");
    }

    protected void defaultLife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = CookieUtils.getCookie("key1", req.getCookies());
        cookie.setMaxAge(-1);
        resp.addCookie(cookie);
        resp.getWriter().write("设置生命周期为-1");
    }

    protected void updateCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = CookieUtils.getCookie("key1", req.getCookies());
        if (cookie != null) {
            cookie.setValue("updatevalue");
            resp.addCookie(cookie);
            resp.getWriter().write("修改成功！新值为" + cookie.getValue());
        } else {
            resp.getWriter().write("未找到要修改的cookie");
        }
    }

    protected void getCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = CookieUtils.getCookie("key4", req.getCookies());
        if (cookie != null) {
            resp.getWriter().write("找到了cookie:" + cookie.getName() + "=" + cookie.getValue());
        } else {
            resp.getWriter().write("未找到该cookie");
        }

    }

    protected void createCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("key1", "value1");
//        Cookie cookie2 = new Cookie("key2", "value2");
//        Cookie cookie3 = new Cookie("key3", "value3");
//        Cookie cookie4 = new Cookie("key4", "value4");
        resp.addCookie(cookie);
//        resp.addCookie(cookie2);
//        resp.addCookie(cookie3);
//        resp.addCookie(cookie4);
        resp.getWriter().write("cookie创建成功");
    }
}
