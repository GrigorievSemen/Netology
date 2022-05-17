package JavaBasics.task_11_2;



import JavaBasics.task_11_2.taxType.TaxType;

import java.math.BigDecimal;

class Bill {
    private BigDecimal amount;
    private TaxType taxType;
    private TaxService taxService;

    public Bill(BigDecimal amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        BigDecimal taxAmount = taxType.calculateTaxFor(amount);
        taxService.payOut(taxAmount);
    }
}
