package Spring1.SpringCoreBasic.scan;

import Spring1.SpringCoreBasic.AutoAppConfig;
import Spring1.SpringCoreBasic.member.MemberRepository;
import Spring1.SpringCoreBasic.member.MemberService;
import Spring1.SpringCoreBasic.order.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoAppConfigTest {

    @Test
    void basicScan() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(
                AutoAppConfig.class);
        MemberService memberService = ac.getBean(MemberService.class);
        Assertions.assertThat(memberService).isInstanceOf(MemberService.class);

        OrderServiceImpl bean = ac.getBean(OrderServiceImpl.class);
        MemberRepository memberRepository = bean.getMemberRepository();
        System.out.println("memberRepository = " + memberRepository);
    }

}
