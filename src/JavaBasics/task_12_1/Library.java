package JavaBasics.task_12_1;


import JavaBasics.task_12_1.users.Administrator;
import JavaBasics.task_12_1.users.Librarian;
import JavaBasics.task_12_1.users.User;

public class Library {
    private static int numberBooks = 20;
    private static Book[] books = new Book[numberBooks];

    private static Administrator administrator = new User("Юля");
    private static Librarian librarian = new User("Света");

    public Library() { // создаем библиотеку с некоторым набором книг
        for (int i = 0; i < 10; i++) {
            String s = "Book";
            books[i] = new Book(s + i);
        }
    }

    public void setBook(Book book) {
        boolean flag = true;
        for (int i = 0; i < numberBooks; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println(librarian.getName() + " успешно добавила в библиотеку книгу - " + book.getNameBook());
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println("Нет места для новой книги");
    }

    public Book getBook(String nameBook) {
        for (int i = 0; i < numberBooks; i++) {
            if (books[i] != null && books[i].getNameBook().equals(nameBook)) {
                Book book = books[i];
                books[i] = null;
                return book;
            }
        }
        return null;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public Librarian getLibrarian() {
        return librarian;
    }
}
