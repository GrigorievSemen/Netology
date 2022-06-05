package JavaBasics.task_13_1;

public class AccessDeniedException extends Exception{

    public AccessDeniedException () {
        super("Ваш возраст менее 18 лет!");
    }
}
