package JavaBasics.task_6_3;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Наполеон", "Бонапарт", "emperor.fr@mail.com", Sex.MALE, 35);
        User user2 = new User("Кот", "Матроскин", "milk_for_cats@mail.com", Sex.MALE, 7);
        User user3 = new User("Лара", "Крофт", "tomb.raider@mail.com", Sex.FEMALE, 28);
        User user4 = new User("Арнольд", "Шварценеггер", "i_will_be_back@mail.com", Sex.MALE, 74);

        System.out.printf("Пользователей онлайн - %d", User.totalOnline);
    }
}
