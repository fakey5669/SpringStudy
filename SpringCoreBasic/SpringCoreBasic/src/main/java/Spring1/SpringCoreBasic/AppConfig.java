package Spring1.SpringCoreBasic;

import Spring1.SpringCoreBasic.discount.DiscountPolicy;
import Spring1.SpringCoreBasic.discount.RateDiscountPolicy;
import Spring1.SpringCoreBasic.member.MemberRepository;
import Spring1.SpringCoreBasic.member.MemberService;
import Spring1.SpringCoreBasic.member.MemberServiceImpl;
import Spring1.SpringCoreBasic.member.MemoryMemberRepository;
import Spring1.SpringCoreBasic.order.OrderService;
import Spring1.SpringCoreBasic.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}