package JavaBasics.task_12_2;

public class Main {
    static AccountAbstract credit = new CreditAccount();
    static AccountAbstract check = new CheckingAccount();
    static AccountAbstract save = new SavingsAccount();

    public static void main(String[] args) throws InterruptedException {
        Messages action;

        action = credit.pay(100);
        System.out.println(action);
        printAccounts();

        action = credit.transfer(save, 100);
        System.out.println(action);
        printAccounts();

        action = credit.addMoney(110);
        System.out.println(action);
        printAccounts();

        action = check.pay(100);
        System.out.println(action);
        printAccounts();

        action = check.transfer(credit, 100);
        System.out.println(action);
        printAccounts();

        action = check.addMoney(100);
        System.out.println(action);
        printAccounts();

        action = save.pay(100);
        System.out.println(action);
        printAccounts();

        action = save.transfer(check, 100);
        System.out.println(action);
        printAccounts();

        action = save.addMoney(100);
        System.out.println(action);
        printAccounts();
    }

    public static void printAccounts() {
        System.out.println(credit);
        System.out.println(check);
        System.out.println(save);
        System.out.println();
    }
}


