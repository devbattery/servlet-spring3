package hello.servletspring3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan // 서블릿 자동 등록 애노테이션
@SpringBootApplication
public class ServletSpring3Application {

    public static void main(String[] args) {
        SpringApplication.run(ServletSpring3Application.class, args);
    }

}
