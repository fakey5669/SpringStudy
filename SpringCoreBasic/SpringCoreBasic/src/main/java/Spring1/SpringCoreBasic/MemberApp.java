package Spring1.SpringCoreBasic;

import Spring1.SpringCoreBasic.member.Grade;
import Spring1.SpringCoreBasic.member.Member;
import Spring1.SpringCoreBasic.member.MemberService;
import Spring1.SpringCoreBasic.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}