package JavaBasics.task_13_2;

public abstract class AbstractEvent {
   private String title;
   private int releaseYear;
   private int age;

    public AbstractEvent(String title, int releaseYear, int age) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return  "Title = " + title +
                ", ReleaseYear = " + releaseYear +
                ", Age = " + age;
    }
}
