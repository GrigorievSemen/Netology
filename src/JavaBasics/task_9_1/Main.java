package JavaBasics.task_9_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];
        int[][] rotatedColors = new int[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);

        colors = fillArray(colors);
        System.out.println("Исходная матрица имеет следущий вид");
        printArray(colors);

        while (true) {
            System.out.println("Выберите угол поворота матрицы:\n" +
                    "Для поворота на 90\u00B0 введите <1>\n" +
                    "Для поворота на 180\u00B0 введите <2>\n" +
                    "Для поворота на 270\u00B0 введите <3>\n" +
                    "Для выхода введите <4>\n");


            String line = scanner.nextLine();
            int number = 0;
            try {
                number = Integer.parseInt(line);
                if (number == 1 || number == 2 || number == 3) {
                    rotatedColors = turnArray(colors, number);
                    break;
                } else if (number == 4) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Введены не коректные данные, повторите ввод:");
            }
        }

        System.out.println("Новая матрица имеет следущий вид");
        printArray(rotatedColors);
    }

    public static int[][] fillArray(int array[][]) {
        Random random = new Random();

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                array[i][j] = random.nextInt(256);
            }
        }
        return array;
    }

    public static int[][] turnArray(int array[][], int num) {
        int[][] arr = new int[SIZE][SIZE];
        int[][] original = new int[SIZE][SIZE];
        for (int i = 0; i < array.length; i++) {
            original[i] = Arrays.copyOf(array[i], array[i].length);
        }

        while (num > 0) {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    arr[i][j] = original[SIZE - 1 - j][i];
                }
            }
            num--;
            for (int i = 0; i < arr.length; i++) {
                original[i] = Arrays.copyOf(arr[i], arr[i].length);
            }
        }
        return arr;
    }

    public static void printArray(int array[][]) {
        System.out.println("--------------------------------------");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", array[i][j]);
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");
    }
}
