package JavaBasics.task_12_1.users;

import JavaBasics.task_12_1.Book;

public interface Librarian {

    void orderBook(Book book, User user);

    void setBookInLibrary(Book book);

    String getName();
}
