package exe2;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Shirts to order: ");
        int quantityShirts = sc.nextInt();
        System.out.print("Enter the number of Trousers: ");
        int quantityTrousers = sc.nextInt();
        int priceShirts = 300;
        int priceTrousers = 700;
        int total = quantityShirts * priceShirts;
        int total1 = quantityTrousers * priceTrousers;
        int discount = (total + total1) / 10;
        int sum = total + total1;
        int points = (sum - discount) / 100;
        System.out.println("Item" +"        " + " Quantity " +"          " + "Price" + "         " +  "Total" );
        System.out.println("======================================================");
        System.out.println("Shirts" + "           " + quantityShirts + "             " + priceShirts + "           " + total);
        System.out.println("Shirts" + "           " + quantityTrousers + "             " + priceTrousers + "           " + total1);

        if (sum > 3000) {
            System.out.println("Discount" + "                                      " + discount);
        } else {
            System.out.println("xin loi ban ko duoc giam gia");
        }

        System.out.println("======================================================");

        if (sum > 3000) {
            System.out.println("New Total" + "                                   " + (sum - discount));
        } else {
            System.out.println("New Total" + "                                   " + sum);
        }

        if (sum > 3000) {
            System.out.println("Points Earned" + "       " +points);
        } else {
            System.out.println("ban ko duoc cong diem");
        }

        System.out.println("Thank You!");


    }
}
