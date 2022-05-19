package JavaBasics.task_12_2;

public class CheckingAccount extends AccountAbstract {
    private String nameAccount = "Расчетный счет";
    private int balance = 1000;

    @Override
    public Messages pay(int amount) {
        if (!checkBalance(amount)) {
            return Messages.INSUFFICIENT_FUNDS;
        } else {
            balance -= amount;
            return Messages.SUCCESS_PAY;
        }
    }

    @Override
    public Messages transfer(AccountAbstract account, int amount) {
        if (!checkBalance(amount)) {
            return Messages.INSUFFICIENT_FUNDS;
        }
        Messages check = account.addMoney(amount);
        if (check.equals(Messages.SUCCESS_REFILL)) {
            balance -= amount;
        }
        return check.equals(Messages.SUCCESS_REFILL) ? Messages.SUCCESS_TRANSFER : check;
    }

    @Override
    public Messages addMoney(int amount) {
        this.balance += amount;
        return Messages.SUCCESS_REFILL;
    }

    @Override
    public String toString() {
        return nameAccount + " - баланс = " + this.balance;
    }

    private boolean checkBalance(int amount) {
        return this.balance > amount;
    }
}
