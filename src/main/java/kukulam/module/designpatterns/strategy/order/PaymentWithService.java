package kukulam.module.designpatterns.strategy.order;

import java.math.BigDecimal;

class PaymentWithService implements Payment {

    @Override
    public double pay(double amount) {
        double service = 1.0/10.0 * amount;
        return amount + service;
    }

    // example with BigDecimal instead of double
    public BigDecimal pay(BigDecimal amount) {
        BigDecimal tenPercent = amount.divide(new BigDecimal(10));
        return amount.add(tenPercent);
    }
}
