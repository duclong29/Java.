package exe2;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 8;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1) {
                    if (j == 0 || j == n - 1) {
                        System.out.print("+");
                    }
                    else {
                        System.out.print("-");
                    }
                }
                else {
                    if (j == 0 || j == n - 1) {
                        System.out.print("|");
                    }
                    else if (i == j) {
                        System.out.print("#");
                    }
                    else if (j == n - 1 - i) {
                        System.out.print("#");
                    }
                    else if (j > i && j < n - 1- i) {
                        System.out.print(".");
                    }
                    else if (j < i && j > n - 1 - i) {
                        System.out.print(".");
                    }
                    else {
                        System.out.print(" ");
                    }

                }

            }
            System.out.println("");
        }
    }
}