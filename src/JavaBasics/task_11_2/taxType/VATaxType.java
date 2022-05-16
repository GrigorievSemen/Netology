package JavaBasics.task_11_2.taxType;

import java.math.BigDecimal;

public class VATaxType extends  TaxType{
    private BigDecimal percent = new BigDecimal(18);

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return amount.divide(HUNDRED).multiply(percent);
    }
}
