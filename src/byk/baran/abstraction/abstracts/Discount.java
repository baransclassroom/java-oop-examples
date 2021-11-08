package byk.baran.abstraction.abstracts;

import java.math.BigDecimal;

/**
 * Username = baranbuyuk
 * Date = 29.07.2021 23:06
 **/
public abstract class Discount {

    private final BigDecimal amount;


    protected Discount(BigDecimal amount) {
        this.amount = amount;
    }

    protected BigDecimal getAmount() {
        return amount;
    }

    protected abstract BigDecimal calculate();

    public Long getDiscountDay() {
        return 9L;
    }

}
