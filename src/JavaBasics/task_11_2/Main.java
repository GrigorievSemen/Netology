package JavaBasics.task_11_2;
import JavaBasics.task_11_2.taxType.IncomeTaxType;
import JavaBasics.task_11_2.taxType.ProgressiveTaxType;
import JavaBasics.task_11_2.taxType.VATaxType;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[] {
                new Bill(new BigDecimal(1023.237533), new IncomeTaxType(), taxService),
                new Bill(new BigDecimal(56123.124535), new VATaxType(), taxService),
                new Bill(new BigDecimal(98963.1234567), new ProgressiveTaxType(), taxService),
                new Bill(new BigDecimal(100001.101237), new ProgressiveTaxType(), taxService)
        };

        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
