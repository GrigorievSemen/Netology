package JavaBasics.task_12_2;

public enum Messages {

    SUCCESS_PAY ("Оплата прошла удачно!"),
    SUCCESS_TRANSFER ("Перевод прошел удачно!"),
    FAIL ("Операция закончилась неудачей"),
    INCORRECT ("Перевод невозможен, сумма пополнения должна быть меньше или равна кредитному остатку"),
    UNAVAILABLE ("Для данного счета действие недоступно"),
    SUCCESS_REFILL ("Пополнение счета прошло успешно!"),
    REFILL_NO_REQUIRED ("Пополнение кредитного счета не требуется."),
    INSUFFICIENT_FUNDS ("Недостаточно средств");

   private String message;

    Messages (String message){
        this.message = message;
    }

    @Override
    public String toString() {
        return  message;
    }
}
