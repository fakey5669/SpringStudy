package Spring1.SpringCoreBasic.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}