package JavaBasics.task_6_2;

public class Author {
    public Book book;
    public String nameAuthor;
    public String biography;

    public Author(String nameAuthor, String biography, Book book) {
        this.book = book;
        this.nameAuthor = nameAuthor;
        this.biography = biography;
    }

    public Author(String nameAuthor, String biography) {
        this.nameAuthor = nameAuthor;
        this.biography = biography;
    }

    public Author() {
        this("Автор неизвестен", "Биография отсутствует");
    }

    public void addBook(Book book) {
        this.book = book;
    }

    public String getBiography(){
        return "Биография " + nameAuthor + ": \n" + biography + "\n";
    }

    @Override
    public String toString() {
        return "----------------------------------\n" +
                "Имя автора(ов) - " + nameAuthor +
                ", биография - \"" + biography + "\"\n" + book +
                "\n----------------------------------\n";
    }
}
