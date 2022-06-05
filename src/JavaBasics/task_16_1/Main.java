package JavaBasics.task_16_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    protected static List<String> toDoList = new ArrayList();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String message = "Выберите действие: \n" +
                "-----------------------------------\n" +
                "1. Добавить задачу \n" +
                "2. Вывести список задач\n" +
                "3. Удалить задачу\n" +
                "0. Выход\n" +
                "-----------------------------------";
        String messageException = "Некорректный ввод, следует ввести номер действия (0-3)";

        while (true) {
            System.out.println(message);
            int num = checkAct();

            if (num < 0 || num > 3) {
                System.out.println(messageException);
                continue;
            } else if (num == 0) {
                System.out.println("Программа завершена!");
                break;
            } else {
                doOperation(num);
            }
        }
    }


    public static void doOperation(int num) {
        switch (num) {
            case 1:
                System.out.println("Введите задачу для планирования:");
                toDoList.add(sc.nextLine());
                break;
            case 2:
                print();
                break;
            case 3:
                if (toDoList.isEmpty()) {
                    System.out.println("Список задач пуст");
                    break;
                }
                System.out.println("Какой номер задачи удалить?");
                print();
                int index = checkAct();
                if (index <= 0 || index > toDoList.size()) {
                    System.out.println("Введен некорректный номер задачи");
                } else {
                    toDoList.remove(index - 1);
                    System.out.printf("Задача номер - <%d>, удалена.\n", index);
                    break;
                }
            default:
                break;
        }
    }

    public static void print() {
        if (toDoList.isEmpty()) {
            System.out.println("Список задач пуст");
        } else {
            System.out.println("Список задач:\n ////////////////////////");
            for (int i = 0; i < toDoList.size() ; i++) {
                System.out.printf("%d. %s\n", i + 1, toDoList.get(i));
            }
            System.out.println("///////////////////////");
        }
    }

    public static int checkAct() {
        int num;
        try {
            num = Integer.parseInt(sc.nextLine());
            return num;
        } catch (Exception e) {
            return -1;
        }
    }
}
