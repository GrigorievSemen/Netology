package JavaBasics.task_18_2_StudentsList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"\n" +
                    "либо введите \"end\" для вывода списка студентов и выхода из программы");
            String param = sc.nextLine();

            if (!param.trim().equals("end")) {
                String[] date = param.split(", ");

                if (date.length < 3 || date.length > 3) {
                    System.err.println("Введены некорректные данные, введите данные согласно шаблона!");
                    continue;
                }

                Student student = new Student(date[0], date[1], date[2]);

                if (students.contains(student)) {
                    System.err.println("Студент с таким Id уже существует в базе.");
                    continue;
                }
                students.add(student);
            } else {
                System.out.println("Список студентов:");
                Iterator it = students.iterator();
                while (it.hasNext()) {
                    System.out.println(" - " + it.next());
                }
                break;
            }
        }
    }
}
