package JavaBasics.task_6_2;

public class Book {
    public String name;
    public int numberPages;
    public int yearOfIssue;
    public int rating;
    static int count = 0;

    public Book(String name, int numberPages, int yearОfIssue, int rating) {
        this.name = name;
        this.numberPages = numberPages;
        this.yearOfIssue = yearОfIssue;
        this.rating = rating;
        count++;
    }

    public Book(int numberPages, int yearОfIssue) {
        this("No name", numberPages, yearОfIssue, 0);
    }


    public String changeRating(Book book) {
        if (this.rating == book.rating) {
            return "Рейтинг книг одинаковый" + "\n";
        }

        return this.rating > book.rating ?
                "Рейтинг книги под названием \"" + this.name + "\" выше он равен - " + this.rating + "\n":
                "Рейтинг книги под названием \"" + this.name + "\" ниже он равен - " + this.rating + "\n";
    }

    public void NumberPagesOfBook() {
        System.out.printf("Колличество страниц книги %s, составляет - %d\n\n", name, numberPages);
    }

    public static String countBook() {
        return "Колличество книг в читалке = " + count + "\n";
    }

    @Override
    public String toString() {
        return "Характеристика книги: " +
                "Имя книги - " + name +
                ", Кол-во страниц = " + numberPages +
                ", Год издания - " + yearOfIssue + "\n";
    }
}
