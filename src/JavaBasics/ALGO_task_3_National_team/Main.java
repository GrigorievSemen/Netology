package JavaBasics.ALGO_task_3_National_team;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] team1 = new int[]{45, 31, 24, 22, 20, 17, 14, 13, 12, 10};
        int[] team2 = new int[]{31, 18, 15, 12, 10, 8, 6, 4, 2, 1};
        int[] team3 = new int[]{51, 30, 10, 9, 8, 7, 6, 5, 2, 1};
        System.out.println(Arrays.toString(nationalTeam(team1, team2, team3)));
    }

    public static int[] nationalTeam(int[]... teams) {
        int[] nationalTeam = teams[0];
        for (int i = 1; i < teams.length; i++) {
            nationalTeam = merge(nationalTeam, teams[i]);
        }
        return nationalTeam;
    }

    public static int[] merge(int[] team1, int[] team2) {
        int[] teamResult = new int[10];
        int count = 0;

        int i = 0;
        int j = 0;

        while (count < 10) {
            if (i > team1.length - 1) {
                int a = team2[j];
                teamResult[count] = a;
                count++;
                j++;
            } else if (j > team2.length - 1) {
                int a = team1[i];
                teamResult[count] = a;
                count++;
                i++;
            } else if (team1[i] > team2[j]) {
                int a = team1[i];
                teamResult[count] = a;
                count++;
                i++;
            } else {
                int b = team2[j];
                teamResult[count] = b;
                count++;
                j++;
            }
        }
        return teamResult;
    }
}
