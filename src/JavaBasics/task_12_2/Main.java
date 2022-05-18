package JavaBasics.task_12_2;

public class Main {
    static AccountAbstract credit = new CreditAccount();
    static AccountAbstract check = new CheckingAccount();
    static AccountAbstract save = new SavingsAccount();

    public static void main(String[] args) throws InterruptedException {

        Messages action;

        action = (Messages) credit.pay(100);
        System.out.println(action);
        printAccounts();

        action = (Messages) credit.transfer(save, 100);
        System.out.println(action);
        printAccounts();

        action = (Messages) credit.addMoney(110);
        System.out.println(action);
        printAccounts();

        action = (Messages) check.pay(100);
        System.out.println(action);
        printAccounts();

        action = (Messages) check.transfer(credit,100);
        System.out.println(action);
        printAccounts();

        action = (Messages) check.addMoney(100);
        System.out.println(action);
        printAccounts();

        action = (Messages) save.pay(100);
        System.out.println(action);
        printAccounts();

        action = (Messages) save.transfer(check, 100);
        System.out.println(action);
        printAccounts();

        action = (Messages) save.addMoney(100);
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


