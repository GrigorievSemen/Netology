package JavaBasics.task_12_2;

public class CreditAccount extends AccountAbstract {
    private String nameAccount = "Кредитный счет";
    private int balance = 0;

    @Override
    public void pay(int amount) {
        balance -= amount;
    }

    @Override
    public void transfer(AccountAbstract account, int amount) {
        System.out.println("Для данного счета действие недоступно");
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
