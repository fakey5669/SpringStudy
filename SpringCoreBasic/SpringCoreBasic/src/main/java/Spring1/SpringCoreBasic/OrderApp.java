package Spring1.SpringCoreBasic;

import Spring1.SpringCoreBasic.member.Grade;
import Spring1.SpringCoreBasic.member.Member;
import Spring1.SpringCoreBasic.member.MemberService;
import Spring1.SpringCoreBasic.order.Order;
import Spring1.SpringCoreBasic.order.OrderService;

public class OrderApp {

  public static void main(String[] args) {
    AppConfig appConfig = new AppConfig();
    MemberService memberService = appConfig.memberService();
    OrderService orderService = appConfig.orderService();
    long memberId = 1L;
    Member member = new Member(memberId, "memberA", Grade.VIP);
    memberService.join(member);
    Order order = orderService.createOrder(memberId, "itemA", 10000);
    System.out.println("order = " + order);
  }
}