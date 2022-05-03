package JavaBasics.task_8_1;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String products[] = {"Макароны из твердых сортов пшеницы, фасовка по 500г", "Чай", "Пельмени", "Молоко", "Хлеб"};
        int prices[] = {100, 20, 150, 80, 50};
        int productNumber[] = new int[products.length];
        String nameOfProduct = "Наименование товара       ";
        String count = "Количество  ";
        String price = "Цена/за.ед  ";
        String totalCost = "Общая стоимосоть";
        String result = "ИТОГО";

        System.out.println("Список возможных товаров для покупки");
        System.out.println("\u2756".repeat(30));
        for (int i = 0; i < products.length; i++) { // выводим перечень товаров
            System.out.printf("%d. <%s> - %d руб/шт\n", i + 1, products[i], prices[i]);
        }
        System.out.println("\u2756".repeat(30) + "\n");

        while (true) { // в цикле заносим товары в корзину
            System.out.println("Выберите номер товара и количество, через пробел, или введите <end> для вывода всех покупок");
            String data = scanner.nextLine().replaceAll(" +", " ").trim();

            if (data.toLowerCase(Locale.ROOT).equals("end")) break;

            String arrData[] = data.split(" ");
            int numberProduct = 0;
            int countProduct = 0;

            try { // проверяем на корректность вводимых данных
                numberProduct = Integer.parseInt(arrData[0]) - 1;
                countProduct = Integer.parseInt(arrData[1]);

                if (numberProduct + 1 > productNumber.length) {
                    System.err.println("Продукта под таким номером нет в списке, повторите ввод.\n");
                    continue;
                }

                productNumber[numberProduct] = countProduct + productNumber[numberProduct]; // заносим или обновляем данные в массиве по хранению кол-ва продуктов
            } catch (Exception e) {
                System.err.println("Вы ввели некоректные данные, повторите ввод.\n");
                continue;
            }

            System.out.println("\u26DA".repeat(27));
            System.out.println("\u26DA Продукты успешно добавленны в корзину  \u26DA");
            System.out.println("\u26DA".repeat(27) + "\n");

        }

        System.out.println("-*-".repeat(50));
        System.out.println(nameOfProduct + count + price + totalCost);
        int total = 0;
        for (int i = 0; i < productNumber.length; i++) { // выводим данные о продуктах в корзине
            if (productNumber[i] != 0) {
                total += productNumber[i] * prices[i];
                printString(products[i], nameOfProduct.length());
                printNumber(productNumber[i], count.length());
                printNumber(prices[i], price.length());
                printNumber(productNumber[i] * prices[i], totalCost.length());
                System.out.println("\n");
            }
        }

        printString(result, nameOfProduct.length() + count.length() + price.length());
        System.out.println(total);
    }

    // выводим цифровые значения с учетом отступа
    public static void printNumber(int number, int length) {
        System.out.print(number + " ".repeat(length - String.valueOf(number).length()));
    }

    /*выводим строковые значения с учетом возможного занимаемого места в столбце (ширины) и переносим если не влезает*/
    public static void printString(String str, int length) {
        if (str.length() - 1 < length) { // если влезает целиком строка, то печатаем и на этом заканчиваем
            System.out.print(str);
            System.out.print(" ".repeat(length - str.length()));
        } else { /* если не влезаем в ширину, делаем проверку каждого следущего слова на возможность "влезть",
        если влезло то печатем его и проверям следующие с учетом оствшиегося места,
        если нет то собираем новую строку из оставшихся слов и рекурсивно вызываем опять этот метод*/
            String arrStr[] = str.replaceAll(" +", " ").trim().split(" ");
            int remainingLength = 0;
            while (true) {
                for (int i = 0; i < arrStr.length - 1; i++) {
                    System.out.print(arrStr[i] + " ");
                    remainingLength += arrStr[i].length() + 1;
                    if (length - remainingLength > arrStr[i + 1].length()) {
                        continue;
                    } else {
                        System.out.println();
                        StringBuilder sb = new StringBuilder();
                        for (int j = i + 1; j < arrStr.length; j++) {
                            sb.append(arrStr[j] + " ");
                        }
                        str = sb.toString();
                    }
                    break;
                }
                break;
            }
            printString(str, length);
        }
    }
}
