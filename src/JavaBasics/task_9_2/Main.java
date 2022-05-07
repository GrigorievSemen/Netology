package JavaBasics.task_9_2;

import java.util.Scanner;

public class Main {
    public static final int SIZE = 5;
    public static final char EMPTY = '-';
    public static final char CROSS = 'X';
    public static final char ZERO = 'O';

    public static void main(String[] args) {
        char[][] field = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = EMPTY;
            }
        }

        Scanner scanner = new Scanner(System.in);

        boolean isCrossTurn = true;

        while (true) {
            printField(field);
            System.out.println("Ходят " + (isCrossTurn ? "крестики" : "нолики") + "!");
            String input = scanner.nextLine(); // "2 3"
            String[] parts = input.split(" "); // ["2" , "3"]
            int r = Integer.parseInt(parts[0]) - 1; // 2-1 = 1
            int c = Integer.parseInt(parts[1]) - 1; // 3-1 = 2

            if (field[r][c] != EMPTY) {
                System.out.println("Сюда ходить нельзя");
                continue;
            }

            field[r][c] = isCrossTurn ? CROSS : ZERO;
            if (isWin(field, isCrossTurn ? CROSS : ZERO)) {
                printField(field);
                System.out.println("Победили " + (isCrossTurn ? "крестики" : "нолики"));
                break;
            } else {
                if (isCrossTurn) {
                    isCrossTurn = false;
                } else {
                    isCrossTurn = true;
                }
                //isCrossTurn = !isCrossTurn;
            }
        }

        System.out.println("Игра закончена!");
    }

    public static boolean isWin(char[][] field, char player) {
        int count = 0;

        for (char[] row : field) { // проверка горизонталей
            for (char cell : row) {
                if (cell == player) count++;
            }
            if (count == SIZE) {
                return true;
            } else {
                count = 0;
            }
        }

        for (int i = 0; i < SIZE; i++) { // проверка вертикалей
            for (int j = 0; j < SIZE; j++) {
                if (field[j][i] == player) count++;
            }
            if (count == SIZE) {
                return true;
            } else {
                count = 0;
            }
        }

        for (int i = 0; i < SIZE; i++) { // проверка диагонали слева на право
            for (int j = i; j < SIZE; j++) {
                if (field[i][j] == player) count++;
                j = SIZE;
            }
        }

        if (count == SIZE) {
            return true;
        } else {
            count = 0;
        }

        for (int i = 0; i < SIZE; i++) { // проверка диагонали справа налево
            for (int j = i; j < SIZE; j++) {
                if (field[i][SIZE - j - 1] == player) count++;
                j = SIZE;
            }
        }

        if (count == SIZE) {
            return true;
        } else {
            return false;
        }


    }

    public static void printField(char[][] field) {
        for (char[] row : field) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}