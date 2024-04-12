package hello.servletspring3.domain.member;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MemberRepositoryTest {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }

    @DisplayName("")
    @Test
    void save() {
        // given
        Member member = new Member("hello", 20);

        // when
        Member savedMember = memberRepository.save(member);

        // then
        Member foundMember = memberRepository.findById(savedMember.getId());
        assertThat(foundMember).isEqualTo(savedMember);
    }

    @DisplayName("")
    @Test
    void find_all() {
        // given
        Member member1 = new Member("member1", 20);
        Member member2 = new Member("member2", 22);

        memberRepository.save(member1);
        memberRepository.save(member2);

        // when
        List<Member> members = memberRepository.findAll();

        // then
        assertThat(members).hasSize(2);
        assertThat(members).contains(member1, member2);
    }

}
