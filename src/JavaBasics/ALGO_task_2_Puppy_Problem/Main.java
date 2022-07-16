package JavaBasics.ALGO_task_2_Puppy_Problem;

import java.util.Arrays;

public class Main {
    private static int size = 10;

    public static void main(String[] args) {
        String[][] field = fillField();

        findPath(field, 8, 3);
        field = fillField();
        System.out.println();
        findPath(field, 9, 7);
        field = fillField();
        System.out.println();
        findPath(field, 9, 9);
    }

    public static String[][] fillField() {
        String[][] field =
                {{"Щ", "-", "-", "*", "*", "-", "-", "-", "-", "-"},
                        {"-", "-", "-", "-", "*", "-", "*", "*", "-", "-"},
                        {"-", "-", "-", "*", "-", "*", "-", "-", "-", "*"},
                        {"-", "*", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"-", "-", "-", "-", "-", "-", "*", "-", "-", "-"},
                        {"-", "-", "*", "-", "-", "*", "-", "-", "-", "-"},
                        {"-", "-", "-", "*", "-", "-", "*", "*", "*", "-"},
                        {"-", "-", "-", "-", "-", "-", "-", "*", "-", "-"},
                        {"-", "-", "-", "-", "-", "-", "-", "*", "-", "-"},
                        {"-", "-", "-", "-", "-", "*", "*", "-", "-", "-"}};
        return field;
    }

    public static void findPath(String[][] field, int x0, int y0) {
        String[][] path = new String[size][size];
        String[][] memory = new String[size][size];
        int x = x0;
        int y = y0;

        label:
        while (x != 0 || y != 0) {
            String direction = whereFrom(field, x, y, memory);

            switch (direction) {
                case "N":
                    System.out.println("Нет такого пути :(");
                    break label;
                case "U":
                    path[x][y] = "да";
                    y -= 1;
                    break;
                case "L":
                    path[x][y] = "да";
                    x -= 1;
                    break;
            }
        }

        for (y = 0; y < size; y++) {
            for (x = 0; x < size; x++) {
                if (x == x0 && y == y0) {
                    field[x][y] = "Ч";
                } else if (path[x][y] != null) {
                    field[x][y] = "x";
                }
            }
        }
        Arrays.stream(field).map(Arrays::toString).forEach(System.out::println);
    }

    public static String whereFrom(String[][] field, int x, int y, String[][] memory) {

        if (memory[x][y] != null) {
            return memory[x][y];
        }

        if (x > 0) {
            int leftX = x - 1;
            int leftY = y;
            if (leftX == 0 && leftY == 0) {
                memory[x][y] = "L";
                return "L";
            }
            if (!field[leftX][leftY].equals("*")) {
                if (!whereFrom(field, leftX, leftY, memory).equals("N")) {
                    memory[x][y] = "L";
                    return "L";
                }
            }
        }

        if (y > 0) {
            int upX = x;
            int upY = y - 1;
            if (upX == 0 && upY == 0) {
                memory[x][y] = "U";
                return "U";
            }
            if (!field[upX][upY].equals("*")) {
                if (!whereFrom(field, upX, upY, memory).equals("N")) {
                    memory[x][y] = "U";
                    return "U";
                }
            }
        }

        memory[x][y] = "N";
        return "N";
    }
}
