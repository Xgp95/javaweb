import org.apache.commons.io.IOUtils;
import sun.misc.BASE64Encoder;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * @author: Xugp
 * @date: 2022/1/24 17:33
 * @description:
 */
public class Download extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String downloadFileName = "2.jpg";
        ServletContext servletContext = getServletContext();
        String mimeType = servletContext.getMimeType("/file/" + downloadFileName);
//        System.out.println(mimeType);
        resp.setContentType(mimeType);

//        resp.setHeader("Content-Disposition", "attachment; filename=22.jpg");
        String header = req.getHeader("User-Agent");
        if (header.contains("Firefox")){
            resp.setHeader("Content-Disposition", "attachment; filename==?UTF-8?B?" + new BASE64Encoder().
                    encode("身份证背面.jpg".getBytes("UTF-8")) + "?=");
        } else {
            resp.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode("身份证背面.jpg", "UTF-8"));
        }
        InputStream resourceAsStream = servletContext.getResourceAsStream("/file/" + downloadFileName);
        OutputStream outputStream = resp.getOutputStream();
//        System.out.println(resourceAsStream + "111");
//        System.out.println(outputStream + "222");
        IOUtils.copy(resourceAsStream, outputStream);
    }
}
