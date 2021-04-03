package exe2;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks obtained int Maths: ");
        int a = sc.nextInt();
        System.out.print("Enter marks obtained Science: ");
        int b = sc.nextInt();
        System.out.print("Enter marks obtained English: ");
        int c = sc.nextInt();
        System.out.println();
        System.out.print("Enter marks obtained int Maths: ");
        int d = sc.nextInt();
        System.out.print("Enter marks obtained Science: ");
        int g = sc.nextInt();
        System.out.print("Enter marks obtained English: ");
        int h = sc.nextInt();

        System.out.println("Marks of ThiDK: ");
        System.out.print("Maths = " + a);
        System.out.print("Science = " + b);
        System.out.print("English = " + c);

        System.out.println("Marks of Bill");
        System.out.print("Maths = " + d);
        System.out.print("Science = " + g);
        System.out.print("English = " + h);

        int totalThiDK = a + b + c;
        int percentageThiDK = totalThiDK / 3;

        int totalBill = d + g + h;
        int percentageBill = totalBill / 3;

        System.out.println("Total marks scored by ThiDK = " + totalThiDK);
        System.out.println("Percentage = " + percentageThiDK + "%");

        System.out.println("Total marks scored by Bill = " + totalBill);
        System.out.println("Percentage = " + percentageBill + "%");

        if (percentageThiDK < percentageBill) {
            System.out.println("No");
        }
        else if (percentageThiDK > percentageBill) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        if (percentageThiDK > 70) {
            System.out.println("Scholarship Amount for ThiDk = $20000");
        }
        else if (percentageThiDK < 70 && percentageThiDK >60) {
            System.out.println("nghĩ xem cho không đã \uD83E\uDD23\uD83D\uDE02");
        }
        else {
            System.out.println("ngu thì nhịn \uD83D\uDC7B");
        }

        if (percentageBill > 70) {
            System.out.println("Scholarship Amount for Bill = $10000");
        }
        else if (percentageBill < 70 && percentageBill >60) {
            System.out.println("nghĩ xem cho không đã \uD83E\uDD23\uD83D\uDE02");
        }
        else {
            System.out.println("ngu thì nhịn \uD83D\uDC7B");
        }


    }
}
