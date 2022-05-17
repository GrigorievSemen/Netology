package JavaBasics.task_12_2;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        AccountAbstract save = new SavingsAccount();
        AccountAbstract credit = new CreditAccount();
        AccountAbstract check = new CheckingAccount();

        credit.pay(100);
        save.transfer(credit,101);
        save.transfer(credit, 100);
        save.addMoney(100);
        System.out.println(save);
        System.out.println(credit);
        System.out.println(check);
        System.out.println();

        credit.pay(200);
        credit.transfer(save, 200);
        credit.addMoney(100);
        System.out.println(save);
        System.out.println(credit);
        System.out.println(check);
        System.out.println();

        check.pay(200);
        check.transfer(save, 2000);
        check.addMoney(100);
        System.out.println(save);
        System.out.println(credit);
        System.out.println(check);
    }
}
