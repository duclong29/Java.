package exe;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14159265;
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        double surfaceArea;
        double baseArea;
        double volume;

        surfaceArea = 2 * PI +radius * radius + 2 * PI * radius * height;
        baseArea = 2 * PI * radius * height;
        volume = PI * radius * radius * height;

        System.out.println("diện tích bề mặt hình trụ là: " +(double) Math.round(surfaceArea*100)/100);
        System.out.println("diện tích cơ sở hình trụ là: " + (double) Math.round(baseArea*100)/100);
        System.out.println("thể tích hình trụ là: " + (double) Math.round(volume*100)/100);

    }
}
