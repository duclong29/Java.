package exe;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double area;
        double perimeter;

        area = a * b;
        perimeter = (a + b) * 2;

        System.out.print("dien tich hinh chu nhat la: " + area);
        System.out.println();
        System.out.print("chu vi hinh chu nhat la: " + perimeter);
    }
}
