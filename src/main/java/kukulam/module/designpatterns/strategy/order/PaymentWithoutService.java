package kukulam.module.designpatterns.strategy.order;

class PaymentWithoutService implements Payment {

    @Override
    public double pay(double amount) {
        return amount;
    }
}
