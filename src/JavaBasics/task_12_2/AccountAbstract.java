package JavaBasics.task_12_2;

abstract public class AccountAbstract {


    abstract public void pay(int amount);

    abstract public void transfer(AccountAbstract account, int amount);

    abstract public void addMoney(int amount);

}
