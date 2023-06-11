package Spring1.SpringCoreBasic;

import Spring1.SpringCoreBasic.discount.FixDiscountPolicy;
import Spring1.SpringCoreBasic.member.MemberService;
import Spring1.SpringCoreBasic.member.MemberServiceImpl;
import Spring1.SpringCoreBasic.member.MemoryMemberRepository;
import Spring1.SpringCoreBasic.order.OrderService;
import Spring1.SpringCoreBasic.order.OrderServiceImpl;

public class AppConfig {

  public MemberService memberService() {
    return new MemberServiceImpl(new MemoryMemberRepository());
  }

  public OrderService orderService() {
    return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
  }
}