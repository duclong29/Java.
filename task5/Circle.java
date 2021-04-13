package exe5;

import java.util.concurrent.Callable;

public class Circle {
    point center;
    private double radius;

    public Circle () {
        this.center = new point();
        this.radius = 1;
    }
    public Circle (int xcenter, int ycenter, double radius) {
        center = new point(xcenter, ycenter);
        this.radius = radius;
    }
    public Circle (point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    public double getRadius () {
        return radius;
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }
    public point getCenter () {
        return this.center;
    }
    public void setCenter (point center) {
        this.center = center;
    }
    public int getCenterX () {
        return center.getX();
    }
    public void setCenterX (int x) {
        center.setX(x);
    }
    public int getCenterY () {
        return center.getY();
    }
    public void setCenterY (int y) {
        center.setY(y);
    }
    public int[] getCenterXY () {
        return center.getXY();
    }
    public void setCeneterXY (int x, int y) {
        center.setXY(x, y);
    }
    public String toString () {
        return "[ Center = " + center + ", Radius = " + radius + "]";
    }
    public double getArea () {
        return 2 * Math.PI * radius * radius;
    }
    public double getCricumference () {
        return 2 * Math.PI * radius;
    }
    public double distance (Circle another) {
        return center.distance(another.center);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("The beginning of c is : ");
        System.out.println(c);
        c.setCenter(new point(4, 5));
        c.setRadius(6);
        System.out.println("change Center : ");
        System.out.println(c);

        c.setCenterX(3);
        c.setCenterY(6);
        c.setRadius(8);
        System.out.println("change x và y in center : ");
        System.out.println(c);
        System.out.println("CenterX of c is : " + c.getCenterX());
        System.out.println("CenterY of c is : " + c.getCenterY());
        System.out.println("Radius of c is : " + c.getRadius());

        c.setCeneterXY(4, 8);
        System.out.println(c);
        System.out.println("Center of X is : " + c.getCenterXY()[0]);
        System.out.println("Center of Y is : " + c.getCenterXY()[1]);

        System.out.printf("Area circle is : %.2f\n", c.getArea());
        System.out.printf("Cricumference circle is : %.2f\n", c.getCricumference());

        System.out.println("----------------------------------------");
        Circle c1 = new Circle(2, 5, 6);
        System.out.println(c1);
        c1.setRadius(6);
        System.out.println("change Center : ");
        System.out.println(c1);

        c1.setCenterX(3);
        c1.setCenterY(6);
        c1.setRadius(5);
        System.out.println("change x và y in center : ");
        System.out.println(c1);
        System.out.println("CenterX of c is : " + c1.getCenterX());
        System.out.println("CenterY of c is : " + c1.getCenterY());
        System.out.println("Radius of c is : " + c1.getRadius());

        c1.setCeneterXY(3, 5);
        System.out.println(c1);
        System.out.println("Center of X is : " + c1.getCenterXY()[0]);
        System.out.println("Center of Y is : " + c1.getCenterXY()[1]);
        System.out.printf("Area circle is : %.2f\n", c1.getArea());
        System.out.printf("Cricumference circle is : %.2f\n", c1.getCricumference());
        System.out.printf("Distance is : %.2f\n" ,c1.distance(c));
        System.out.println("--------------------------------------------");
        Circle c2 = new Circle(new point(3, 7), 9);
        c2.setCenterX(3);
        c2.setCenterY(6);
        c2.setRadius(5);
        System.out.println("change x và y in center : ");
        System.out.println(c2);
        System.out.println("CenterX of c is : " + c2.getCenterX());
        System.out.println("CenterY of c is : " + c2.getCenterY());
        System.out.println("Radius of c is : " + c2.getRadius());

        c2.setCeneterXY(3, 7);
        System.out.println(c2);
        System.out.println("Center of X is : " + c2.getCenterXY()[0]);
        System.out.println("Center of Y is : " + c2.getCenterXY()[1]);
        System.out.printf("Area circle is : %.2f\n", c2.getArea());
        System.out.printf("Cricumference circle is : %.2f\n", c2.getCricumference());
        System.out.printf("Distance is : %.2f" ,c2.distance(c1));
    }
}
