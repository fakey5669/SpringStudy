package Spring1.SpringCoreBasic.discount;

import Spring1.SpringCoreBasic.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
