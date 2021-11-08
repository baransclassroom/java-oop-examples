package byk.baran.abstraction.abstracts;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Username = baranbuyuk
 * Date = 29.07.2021 23:08
 **/
public class DailyDiscount extends Discount {

    public static final BigDecimal RATE = new BigDecimal(15);

    public DailyDiscount(BigDecimal amount) {
        super(amount);
    }

    //there is better solution for this abstraction..
    @Override
    protected BigDecimal calculate() {
        return getAmount().subtract(getAmount()
                .multiply(RATE)
                .divide(new BigDecimal(100), RoundingMode.FLOOR));
    }
}
