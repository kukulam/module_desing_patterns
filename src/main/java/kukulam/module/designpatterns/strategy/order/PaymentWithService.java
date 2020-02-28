package kukulam.module.designpatterns.strategy.order;

class PaymentWithService implements Payment {

    @Override
    public double pay(double amount) {
        double service = 1.0/10.0 * amount;
        return amount + service;
    }
}
