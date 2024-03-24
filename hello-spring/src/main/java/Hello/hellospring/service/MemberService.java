package Hello.hellospring.service;

import Hello.hellospring.domain.Member;
import Hello.hellospring.repository.MemberRepository;
import Hello.hellospring.repository.MemoryMemberRepository;

import java.util.Optional;

public class MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    /*
    * 회원가입
    * */

    public Long join (Member member) {
        // 같은 이름이 있는 중복 회원x
        Optional<Member> result = memberRepository.findByName(member.getName());

        memberRepository.save(member);
        return member.getId();
    }
}
