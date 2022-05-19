package JavaBasics.task_12_2;

public class CreditAccount extends AccountAbstract {
    private String nameAccount = "Кредитный счет";
    private int balance = 0;

    @Override
    public Messages pay(int amount) {
        balance -= amount;
        return Messages.SUCCESS_PAY;
    }

    @Override
    public Messages transfer(AccountAbstract account, int amount) {
        return Messages.UNAVAILABLE;
    }

    @Override
    public Messages addMoney(int amount) {
        if (balance == 0) {
            return Messages.REFILL_NO_REQUIRED;
        } else if (-balance < amount) {
            return Messages.INCORRECT;
        } else {
            this.balance += amount;
            return Messages.SUCCESS_REFILL;
        }
    }

    @Override
    public String toString() {
        return nameAccount + " - баланс = " + this.balance;
    }
}
