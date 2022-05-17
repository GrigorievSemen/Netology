package JavaBasics.task_12_1;

import JavaBasics.task_12_1.users.*;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Example book");
        User user = new User("");
        Librarian librarian = user.getLibrary().getLibrarian();
        Administrator administrator = user.getLibrary().getAdministrator();
        Reader reader = new User("Коля");
        Supplier supplier = new User("Гога");

        reader.takeBook(book);

        librarian.orderBook(book, (User) supplier);

        supplier.supplyBook(book);

        librarian.setBookInLibrary(book);

        reader.takeBook(book);

        administrator.overdueNotification(book, (User) reader);

        reader.returnBook(book);
    }
}
