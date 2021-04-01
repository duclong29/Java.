package exe;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int price = 200;
        int number = 4;
        int total = price * number;

        for (int i = 0; i <= n; i++) {
            total += total;
        }
        System.out.println("tong gia ban la: " + total);
    }
}
