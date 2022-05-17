package JavaBasics.task_12_2;

public class Main {
    public static void main(String[] args) {

        AccountAbstract save = new SavingsAccount();
        AccountAbstract credit = new CreditAccount();
        AccountAbstract check = new CheckingAccount();

        save.pay(100);
        save.transfer(check, 200);
        save.transfer(credit, 1100);
        save.addMoney(100);
        System.out.println(save);
        System.out.println(credit);
        System.out.println(check);

        credit.pay(200);
        credit.transfer(save, 200);
        credit.addMoney(100);
        System.out.println(save);
        System.out.println(credit);
        System.out.println(check);

        check.pay(200);
        check.transfer(credit, 100);
        check.addMoney(100);
        System.out.println(save);
        System.out.println(credit);
        System.out.println(check);
    }
}
