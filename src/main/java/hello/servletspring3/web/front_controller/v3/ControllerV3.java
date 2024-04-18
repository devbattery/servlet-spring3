package hello.servletspring3.web.front_controller.v3;

import hello.servletspring3.web.front_controller.ModelView;
import java.util.Map;

public interface ControllerV3 {

    ModelView process(Map<String, String> paramMap);

}
