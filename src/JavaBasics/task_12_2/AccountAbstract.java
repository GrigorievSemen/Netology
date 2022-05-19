package JavaBasics.task_12_2;

abstract public class AccountAbstract {

    abstract public Messages pay(int amount);

    abstract public Messages transfer(AccountAbstract account, int amount);

    abstract public Messages addMoney(int amount);
}
