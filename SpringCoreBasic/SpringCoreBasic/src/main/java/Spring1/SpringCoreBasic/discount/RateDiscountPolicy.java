package Spring1.SpringCoreBasic.discount;

import Spring1.SpringCoreBasic.annotation.MainDiscountPolicy;
import Spring1.SpringCoreBasic.member.Grade;
import Spring1.SpringCoreBasic.member.Member;
import org.springframework.stereotype.Component;

@Component
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10; //10% 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }
}