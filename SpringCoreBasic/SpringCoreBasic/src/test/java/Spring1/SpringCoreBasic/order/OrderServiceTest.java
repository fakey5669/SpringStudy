package Spring1.SpringCoreBasic.order;

import Spring1.SpringCoreBasic.member.Grade;
import Spring1.SpringCoreBasic.member.Member;
import Spring1.SpringCoreBasic.member.MemberService;
import Spring1.SpringCoreBasic.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder(){
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "iteaA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
