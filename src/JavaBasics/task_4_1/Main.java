package JavaBasics.task_4_1;

import java.util.Scanner;

public class Main {
    private static int earnings = 0;
    private static int spendings = 0;
    private static int taxEarn = 0;
    private static int taxEarnMinusSpend = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOperation;
        String input;
        String message = "______________________________\n" +
                "Выберите операцию и введите её номер:\n" +
                "1. Добавить новый доход\n" +
                "2. Добавить новый расход\n" +
                "3. Выбрать систему налогообложения\n" +
                "Наберите \"end\" для окончания работы\n" +
                "______________________________";

        while (true) {
            System.out.println(message);
            input = scanner.nextLine();

            if (!input.equals("end")) {
                numOperation = Integer.parseInt(input);
                operations(numOperation, scanner);
            } else {
                break;
            }
        }

        System.out.println("Программа завершена!");
    }

    public static void operations(int numOperation, Scanner scanner) {
        int value;
        switch (numOperation) {
            case 1:
                System.out.println("Введите сумму дохода (целое число):");
                value = Integer.parseInt(scanner.nextLine());
                earnings += value;
                break;
            case 2:
                System.out.println("Введите сумму расхода (целое число):");
                value = Integer.parseInt(scanner.nextLine());
                spendings += value;
                break;
            case 3:
                taxEarn = taxEarnings(earnings);
                taxEarnMinusSpend = taxEarningsMinusSpendings(earnings, spendings);

                if (taxEarnMinusSpend > taxEarn) {
                    System.out.printf("Мы советуем вам УСН доходы\n" +
                            "Ваш налог составит: %d рублей\n" +
                            "Налог на другой системе: %d рублей\n" +
                            "Экономия: %d рублей\n\n", taxEarn, taxEarnMinusSpend, taxEarnMinusSpend - taxEarn);
                } else {
                    System.out.printf("Мы советуем вам УСН доходы минус расходы\n" +
                            "Ваш налог составит: %d рублей\n" +
                            "Налог на другой системе: %d рублей\n" +
                            "Экономия: %d рублей\n\n", taxEarnMinusSpend, taxEarn, taxEarn - taxEarnMinusSpend);
                }
                break;
            default:
                System.out.println("------------------------\n" +
                        "Такой операции нет\n" +
                        "------------------------");
        }
    }

    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        return tax >= 0 ? tax : 0;
    }

    public static int taxEarnings(int earnings) {
        return earnings * 6 / 100;
    }
}