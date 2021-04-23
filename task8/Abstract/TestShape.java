package exercise8.Abstract;

abstract class Shape {
    protected String color = "red";
    abstract double getArea ();

    public String toString () {
        return "Color is : " + color;
    }
}

class Rectangle extends Shape {
    protected double length, width;
    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    protected double height, base;
    public Triangle (double height, double base) {
        this.base = base;
        this.height = height;
    }
    @Override
    double getArea () {
        return 0.5 * height * base;
    }
}

public class TestShape {
    public static void main(String[] args) {
        Shape s = new Rectangle(3, 3);
        System.out.println(s);
        System.out.println(s.getArea());
    }
}
