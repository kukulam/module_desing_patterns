package kukulam.module.designpatterns.strategy.order;

class OrderFactory {

    private final Payment paymentWithService;
    private final Payment paymentWithoutService;

    public OrderFactory(Payment paymentWithService, Payment paymentWithoutService) {
        this.paymentWithService = paymentWithService;
        this.paymentWithoutService = paymentWithoutService;
    }

    public Order createOrder(int people, double amount) {
        if (people < 4) {
            return new Order(people, amount, paymentWithoutService);
        } else {
            return new Order(people, amount, paymentWithService);
        }
    }
}
