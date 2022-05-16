package JavaBasics.task_11_2.taxType;

import java.math.BigDecimal;

public class TaxType {
    protected final static BigDecimal HUNDRED = new BigDecimal(100);

    public BigDecimal calculateTaxFor(BigDecimal amount) {
        // TODO override me!
        return new BigDecimal(0.0);
    }
}
