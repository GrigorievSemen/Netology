package JavaBasics.task_11_2.taxType;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType{
    private BigDecimal percentBeforeHundred = new BigDecimal(10);
    private BigDecimal percentAfterHundred = new BigDecimal(15);

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        int check = amount.compareTo(new BigDecimal(100000));
        if (check <= 0){
            return amount.divide(HUNDRED).multiply(percentBeforeHundred);
        } else {
            return amount.divide(HUNDRED).multiply(percentAfterHundred);
        }
    }
}
