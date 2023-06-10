package Spring1.SpringCoreBasic.order;

import Spring1.SpringCoreBasic.discount.DiscountPolicy;
import Spring1.SpringCoreBasic.discount.FixDiscountPolicy;
import Spring1.SpringCoreBasic.member.Member;
import Spring1.SpringCoreBasic.member.MemberRepository;
import Spring1.SpringCoreBasic.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository = new
            MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}