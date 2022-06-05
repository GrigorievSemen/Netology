package JavaBasics.task_13_2;

public class Main {
    public static void main(String[] args) {
        for (AbstractEvent event: getMovies()) {
            validEvent(event);
        }

        for (AbstractEvent event: getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
                new Movie("Робокоп", 1987, 15),
                new Movie("Один дома", 1990, 6),
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Гамлет", 1599, 17),
                new Theatre("Остров сокровищ", 1947, 5),
        };
    }

    public static void validEvent(AbstractEvent event){
       if (event.getTitle() == null || event.getReleaseYear() == 0 || event.getAge() == 0) {
           System.out.println(event);
           throw new RuntimeException();
       }
    }
}
