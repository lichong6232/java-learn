package cn.bupt.springmvc.handler.http_request_handler;


import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: lichong04
 * @Date: Created in 下午1:09 2018/9/24
 */
public class UserRequestHandler implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.getRequestDispatcher("/WEB-INF/page/user1.jsp").forward(httpServletRequest,httpServletResponse);
    }
}
