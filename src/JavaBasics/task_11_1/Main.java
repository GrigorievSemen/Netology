package JavaBasics.task_11_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        printPhraseForPlayer(player);

        while (true){
            int slot;
            try{
                slot = scanner.nextInt();
                if(slot == -1) break;
                player.shotWithWeapon(slot);
                printPhraseForPlayer(player);
            }catch (Exception e){
                System.out.println("Введены некорректные данные!");
                scanner.nextLine();
            }
        }

        System.out.println("Game over!");
    }

    public static void printPhraseForPlayer (Player player) {
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
    }
}
