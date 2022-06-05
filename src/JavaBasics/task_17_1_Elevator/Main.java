package JavaBasics.task_17_1_Elevator;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Deque<Integer> dequeElevator = new ArrayDeque<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            int floor = checkFloor();
            int totalSeconds = 0;
            int waitDoorsInSeconds = 10;
            int waitMoveInSeconds = 5;

            if (floor < 0 || floor > 25) {
                System.out.println("Такого этажа нет в доме");
                continue;
            } else if (floor == 0) {
                dequeElevator.offerLast(floor);
                System.out.println("Лифт проследовал по следующим этажам:");
                totalSeconds = totalSeconds + (dequeElevator.size()) * waitDoorsInSeconds;

                int floorPresent = 0;
                while (!dequeElevator.isEmpty()) {
                    floorPresent = dequeElevator.peek();
                    System.out.printf("этаж %d ", dequeElevator.poll());

                    if (dequeElevator.peek() != null) {
                        System.out.print("-> ");
                        totalSeconds = totalSeconds + (Math.abs(floorPresent - dequeElevator.peek())) * waitMoveInSeconds;
                    } else {
                        totalSeconds = totalSeconds + floorPresent * waitMoveInSeconds;
                        System.out.println();
                    }
                }

                System.out.printf("Время затраченное лифтом на маршрут =: %d с.", totalSeconds);
                break;
            } else {
                dequeElevator.offerLast(floor);
            }
        }
    }

    public static int checkFloor() {
        int num;
        try {
            num = Integer.parseInt(sc.nextLine());
            return num;
        } catch (Exception e) {
            return -1;
        }
    }
}
