package kukulam.module.designpatterns.strategy.order;

import kukulam.module.designpatterns.singleton.Logger;

public class Order {
    private int people;
    private double amount;
    private Payment payment;

    public Order(int people, double amount, Payment payment) {
        this.people = people;
        this.amount = amount;
        this.payment = payment;
    }

    void pay() {
        double amountToPay = payment.pay(amount);
        Logger.INSTANCE.logMessage("Order for " + people + " people with amount " + amount + " has been paid: " + amountToPay + " PLN");
    }

    public static void main(String[] args) {
        Payment paymentWithService = new PaymentWithService();
        Order groupOf8People = new Order(8, 120, paymentWithService);
        groupOf8People.pay();

        Payment paymentWithoutService = new PaymentWithoutService();
        Order pair = new Order(2, 40, paymentWithoutService);
        pair.pay();
    }
}