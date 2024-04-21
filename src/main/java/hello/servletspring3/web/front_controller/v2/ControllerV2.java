package hello.servletspring3.web.front_controller.v2;

import hello.servletspring3.web.front_controller.MyView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ControllerV2 {

    /**
     * 서블릿 메서드랑 똑같은 모양의 메서드
     *
     * @return MyView
     */
    MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}
