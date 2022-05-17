package JavaBasics.task_12_2;

public class SavingsAccount extends AccountAbstract {
    private String nameAccount = "Сберегательный счет";
    private int balance = 1000;

    @Override
    public void pay(int amount) {
        System.out.println("Для данного счета действие недоступно");
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
