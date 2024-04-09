package hello.servletspring3.basic.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "responseHeaderServlet", urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // [status-line]
        response.setStatus(HttpServletResponse.SC_OK);

        // [response-header]
//        response.setHeader("Content-Type", "text/plain;charset=utf-8");
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("my-header", "hello");

        // [Header 편의 메서드]
//        content(response);
//        cookie(response);
//        redirect(response);

        // [message body]
        PrintWriter writer = response.getWriter();
        writer.println("안녕하세용");
    }

    private void content(HttpServletResponse response) {
        // Content-Type: text/plain;charset=utf-8
        // Content-Length: 2

        // response.setHeader("Content-Type", "text/plain;charset=utf-8");
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
    }

    private void cookie(HttpServletResponse response) {
        // Set-Cookie: myCookie=good; Max-Age=600;

        // response.setHeader("Set-Cookie", "myCookie=good; Max-Age=600");
        Cookie cookie = new Cookie("myCookie", "good");
        cookie.setMaxAge(600); // 600s
        response.addCookie(cookie);
    }

    private void redirect(HttpServletResponse response)
            throws IOException { //Status Code 302 //Location: /basic/hello-form.html
        // Status Code 302
        // Location: /basic/hello-form.html

//        response.setStatus(HttpServletResponse.SC_FOUND); // 302 Redirect
//        response.setHeader("Location", "/basic/hello-form.html"); // Location (리다이렉트 위치)
        response.sendRedirect("/basic/hello-form.html");
    }

}
