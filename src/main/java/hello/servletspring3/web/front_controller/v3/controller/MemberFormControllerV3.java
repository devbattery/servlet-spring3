package hello.servletspring3.web.front_controller.v3.controller;

import hello.servletspring3.web.front_controller.ModelView;
import hello.servletspring3.web.front_controller.v3.ControllerV3;
import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {

    @Override
    public ModelView process(Map<String, String> paramMap) {
        return new ModelView("new-form");
    }

}
