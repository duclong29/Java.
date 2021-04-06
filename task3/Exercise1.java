package exe3;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[10];
        int val;

        while (n-- > 0) {
            val = sc.nextInt();
            if (val == 100) {
                count[9] ++;
            }
            else {
                count[val / 10] ++;
            }
        }

        for (int i = 0; i < 10; i ++) {
            System.out.print((i * 10) + " - " + (i * 10+ 9) + " : ");
            for (int j = 0; j < count[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}