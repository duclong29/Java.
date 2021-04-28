package BaiThi;

import java.util.Scanner;

public class TaskBank {
    public static void main(String[] args) {
        Bank b = new Bank();
        Scanner sc = new Scanner(System.in);
        System.out.print("Balance is :");
        b.balance = sc.nextDouble();
        System.out.print("Rate is :");
        b.rate = sc.nextDouble();
        System.out.println(b);
        System.out.println("Balance is :" + b.getBalance());
        System.out.println("Rate is :" + b.getRate());
        System.out.printf("CalculateInterest is : $%.2f", b.calculateInterest());
    }
}
