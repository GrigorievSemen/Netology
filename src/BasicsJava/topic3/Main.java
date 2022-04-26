package BasicsJava.topic3;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.println("Введите год в формате: yyyy количество-дней");
            int year = sc.nextInt();
            int days = sc.nextInt();

            int daysInYear = checkYear(year); // заносим в переменную "реальное" кол-во дней в году

            if (daysInYear == days) {
                count++;
            } else {
                System.out.printf("Неправильно! В этом году %d дней!%n", daysInYear);
                System.out.printf("Набрано очков: %d ", count);
                break;
            }
        }
    }

    public static int checkYear(int year) {
        boolean b = year % 400 == 0 || year % 4 == 0 && year % 100 != 0; // проверяем високосный год или нет
        //  boolean b =((GregorianCalendar) Calendar.getInstance()).isLeapYear(year);
        return b ? 366 : 365; // в зависимости от значения "b" возвращаем кол-во дней - true = 366, false = 365
    }
}

