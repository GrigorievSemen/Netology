package JavaBasics.task_6_3;

public class User {
    public String name;
    public String surname;
    public String emailAddress;
    public Sex sex;
    public int age;
    static public int totalOnline = 0;

    public User(String name, String surname, String emailAddress, Sex sex, int age) {
        this.name = name;
        this.surname = surname;
        this.emailAddress = emailAddress;
        this.sex = sex;
        this.age = age;
        totalOnline++;
    }
}
