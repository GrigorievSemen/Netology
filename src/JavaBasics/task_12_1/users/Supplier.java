package JavaBasics.task_12_1.users;

import JavaBasics.task_12_1.Book;

public interface Supplier {

    Book supplyBook(Book book);

    String getName();
}
