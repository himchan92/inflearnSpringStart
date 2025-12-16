package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemerApp {
    public static void main(String[] args) {

        //AppConfig 설정정보가져오기
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MemerApp.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);//Bean 명시된 파라미터 객체 찾기

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new Member = " + member.getName());
    }
}
