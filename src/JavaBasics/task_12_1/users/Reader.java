package JavaBasics.task_12_1.users;

import JavaBasics.task_12_1.Book;

public interface Reader {

    void takeBook(Book book);

    void returnBook(Book book);

    String getName();
}
