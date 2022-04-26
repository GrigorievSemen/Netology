package JavaBasics.task4_2;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOperation;

        String message = "______________________________\n" +
                "Выберите операцию над double/float\n" +
                "1. Сравнить\n" +
                "2. Округлить\n" +
                "3. Отбросить дробную часть\n" +
                "4. Выход из программы\n" +
                "______________________________";

        while (true) {
            System.out.println(message);
            numOperation = scanner.nextInt();

            if (numOperation != 4) {
                operations(numOperation, scanner);
            } else {
                break;
            }
        }

        System.out.println("Программа закончила свою работу!");
    }

    public static void operations(int numOperation, Scanner scanner) {
        double value1;
        float value2;
        switch (numOperation) {
            case 1:
                System.out.println("--Введите первое число:--");
                value1 = scanner.nextDouble();

                System.out.println("--Введите второе число:--");
                value2 = scanner.nextFloat();

                if (Math.abs(value1 - value2) <= 0.001) {
                    System.out.println("--Числа равны--");
                } else if (value1 > value2) {
                    System.out.println("--Первое число больше второго--");
                } else {
                    System.out.println("--Второе число больше первого--");
                }
                break;
            case 2:
                System.out.println("--Введите число:--");
                value1 = Math.round(scanner.nextDouble());
                System.out.printf("Число округлено, результат = %f\n", value1);
                break;
            case 3:
                System.out.println("Введите число:");
                value1 = scanner.nextDouble();
                System.out.printf("Отброшена дробная часть, результат = %d\n", (long) value1);
                break;
            default:
                System.out.println("------------------------\n" +
                        "Такой операции нет\n" +
                        "------------------------");
        }
    }
}
