package JavaBasics.task_6_1;

public class Book {
    public String name;
    public String author;
    public int numberPages;
    public int yearОfIssue;
    public int rating;
    static int count = 0;

    public Book(String name, String author, int numberPages, int yearОfIssue, int rating) {
        this.name = name;
        this.author = author;
        this.numberPages = numberPages;
        this.yearОfIssue = yearОfIssue;
        this.rating = rating;
        count++;
    }

    public Book(int numberPages, int yearОfIssue) {
        this("No name", "Не известен", numberPages, yearОfIssue, 0);
    }


    public String compareRating(Book book) {
        if (this.rating == book.rating) {
            return "Рейтинг книг одинаковый";
        }

        return this.rating > book.rating ?
                "Рейтинг книги под названием \"" + this.name + "\" выше он равен - " + this.rating :
                "Рейтинг книги под названием \"" + this.name + "\" ниже он равен - " + this.rating;
    }

    public void NumberPagesOfBook() {
        System.out.printf("Колличество страниц книги %s, составляет - %d\n", name, numberPages);
    }

    public static String countBook() {
        return "Колличество книг в читалке = " + count;
    }

    @Override
    public String toString() {
        return "Характеристика книги: " +
                "name - " + name +
                ", author - " + author +
                ", numberPages = " + numberPages +
                ", yearPublishing - " + yearОfIssue;
    }
}
