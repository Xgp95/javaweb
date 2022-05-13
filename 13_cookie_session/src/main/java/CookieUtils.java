import javax.servlet.http.Cookie;

/**
 * @author: Xugp
 * @date: 2022/2/18 10:48
 * @description:
 */
public class CookieUtils {
    public static Cookie getCookie(String name,Cookie[] cookies){
        if (name == null || cookies == null || cookies.length ==0){
            return null;
        }
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(name)){
                return cookie;
            }
        }
        return null;
    }
}
