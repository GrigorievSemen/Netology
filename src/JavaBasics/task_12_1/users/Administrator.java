package JavaBasics.task_12_1.users;
import JavaBasics.task_12_1.Book;

public interface Administrator {

    Book findBook(String nameBook);

    void giveBook(Book book);

    String getName();

    default void overdueNotification(Book book, User user) {
        System.out.println("Читателю <" + user.getName() + "> необходимо вернуть книгу - " + book.getNameBook());
    }
}
