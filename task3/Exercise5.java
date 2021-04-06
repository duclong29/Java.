package exe3;

public class Exercise5 {
    public static void main(String[] args) {
        double r = 1.1, area1, area2;
        area1 = getarea(r);
        System.out.println("area 1 is: " + area1);
        area2 = getarea(2.2);
        System.out.println("area 2 is: " + area2);
        System.out.println("area 3 is: " + getarea(3.3));
    }

    public static double getarea(double r) {
        return r * r * Math.PI;
    }
}
