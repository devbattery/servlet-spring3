package hello.servletspring3.web.front_controller.v3.controller;

import hello.servletspring3.domain.member.Member;
import hello.servletspring3.domain.member.MemberRepository;
import hello.servletspring3.web.front_controller.ModelView;
import hello.servletspring3.web.front_controller.v3.ControllerV3;
import java.util.List;
import java.util.Map;

public class MemberListControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {
        List<Member> members = memberRepository.findAll();
        ModelView mv = new ModelView("members");
        mv.getModel().put("members", members);

        return mv;
    }

}
