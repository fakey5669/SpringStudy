package Spring1.SpringCoreBasic.discount;

import Spring1.SpringCoreBasic.member.Grade;
import Spring1.SpringCoreBasic.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Grade.VIP)
            return discountFixAmount;
        else
            return 0;
    }
}
