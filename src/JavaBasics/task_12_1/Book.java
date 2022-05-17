package JavaBasics.task_12_1;


public class Book {
    private String nameBook;

    public Book(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook = '" + nameBook + '\'' +
                '}';
    }
}
