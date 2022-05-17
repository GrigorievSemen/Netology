package JavaBasics.task_12_2;

public class CheckingAccount extends AccountAbstract {
    private String nameAccount = "Расчетный счет";
    private int balance = 1000;

    @Override
    public void pay(int amount) {
        if (this.balance > amount) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств для оплаты");
        }
    }

    @Override
    public void transfer(AccountAbstract account, int amount) {
        if (this.balance > amount) {
            account.addMoney(amount);
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств для перевода");
        }
    }

    @Override
    public void addMoney(int amount) {
        this.balance += amount;
    }

    @Override
    public String toString() {
        return nameAccount + " - балланс = " + this.balance;
    }
}
