package hello.servletspring3.web.front_controller.v2.controller;

import hello.servletspring3.domain.member.Member;
import hello.servletspring3.domain.member.MemberRepository;
import hello.servletspring3.web.front_controller.MyView;
import hello.servletspring3.web.front_controller.v2.ControllerV2;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberSaveControllerV2 implements ControllerV2 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public MyView process(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));

        Member member = new Member(username, age);
        memberRepository.save(member);

        // Model에 데이터 보관
        request.setAttribute("member", member);

        return new MyView("/WEB-INF/views/save-result.jsp");

    }

}
