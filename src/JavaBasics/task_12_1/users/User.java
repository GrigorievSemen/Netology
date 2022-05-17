package JavaBasics.task_12_1.users;

import JavaBasics.task_12_1.Book;
import JavaBasics.task_12_1.Library;


public class User implements Administrator, Reader, Librarian, Supplier {
    private String name;
    private static Library library = new Library();

    public User(String name) {
        this.name = name;
    }

    @Override
    public Book findBook(String nameBook) {
        Book book = library.getBook(nameBook);
        if (book != null) {
            System.out.println("Администратор " + library.getAdministrator().getName() + " нашел(а) книгу " + nameBook);
            return book;
        }
        return null;
    }

    @Override
    public void giveBook(Book book) {
        if (book == null) {
            System.out.println("Такой книги нет");
        } else {
            System.out.println(this.getName() + " получил(а) книгу " + book.getNameBook());
        }
    }

    @Override
    public void orderBook(Book book, User user) {
        System.out.println("Библиотекарь " + library.getLibrarian().getName() + " заказала книгу " + book.getNameBook() +
                " у " + user.getName());
    }

    @Override
    public void takeBook(Book book) {
        System.out.println(this.getName() + " хочет взять книгу " + book.getNameBook());
        book = findBook(book.getNameBook());
        giveBook(book);
    }

    @Override
    public void returnBook(Book book) {
        System.out.println(this.getName() + " вернул(а) книгу " + book.getNameBook());
        library.setBook(book);
    }

    @Override
    public Book supplyBook(Book book) {
        System.out.println(this.getName() + " доставил книгу " + book.getNameBook());
        return book;
    }

    @Override
    public void setBookInLibrary(Book book) {
        library.setBook(book);
    }

    @Override
    public String getName() {
        return name;
    }

    public Library getLibrary() {
        return library;
    }
}
