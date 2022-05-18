package JavaBasics.task_12_2;

public class CheckingAccount extends AccountAbstract {
    private String nameAccount = "Расчетный счет";
    private int balance = 1000;

    @Override
    public void pay(int amount) {
        if (checkBalance(amount)) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств для оплаты");
        }
    }

    @Override
    public void transfer(AccountAbstract account, int amount) {
        if (!checkBalance(amount)) {
            System.out.println("Недостаточно средств для перевода");
            return;
        }

        if (account.getNameAccount().equals("Кредитный счет")) {
            if (account.getBalance() != 0 && Math.abs(account.getBalance()) >= amount){
                account.addMoney(amount);
                balance -= amount;
                return;
            }else {
                System.out.println("Перевод невозможен, сумма должна быть меньше или равна кредитному остатку");
            }
        }

        if (!account.getNameAccount().equals("Кредитный счет")){
            account.addMoney(amount);
            balance -= amount;
        }
    }

    @Override
    public void addMoney(int amount) {
        this.balance += amount;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public String getNameAccount(){
        return nameAccount;
    }

    @Override
    public String toString() {
        return nameAccount + " - баланс = " + this.balance;
    }

    private boolean checkBalance(int amount) {
        return this.balance > amount;
    }
}
