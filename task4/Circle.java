package exe4;

class Circle {
    double radius;
    String color;

    public Circle () {
        radius = 5;
        color = "rel";
    }
    public Circle (double r) {
        radius = r;
        color = "yellow";
    }
    public Circle (double r, String c) {
        radius = r;
        color = c;
    }
    public double getRadius () {
        return radius;
    }
    public String getColor () {
        return color;
    }
    public double getArea (double radius) {
        return radius * radius * Math.PI;
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }
    public void setColor (String color) {
        this.color = color;
    }
    public String toString () {
        return radius + " " + color;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.getRadius());
        System.out.println(c.getColor());
        System.out.printf("%.2f", c.getArea(5));
        System.out.println();
        c.setRadius(6);
        System.out.println(c.getRadius());
        c.setColor("blue");
        System.out.println(c.getColor());
        System.out.println(c.toString());
        System.out.println();

        Circle c1 = new Circle(6);
        System.out.println(c1.getRadius());
        System.out.println(c1.getColor());
        System.out.printf("%.2f", c1.getArea(6));
        System.out.println();
        c1.setRadius(9);
        System.out.println(c1.getRadius());
        c1.setColor("green");
        System.out.println(c1.getColor());
        System.out.println(c1.toString());
        System.out.println();

        Circle c2 = new Circle(7, "black");
        System.out.println(c2.getRadius());
        System.out.println(c2.getColor());
        System.out.printf("%.2f", c2.getArea(7));
        System.out.println();
        c2.setRadius(9);
        System.out.println(c2.getRadius());
        c2.setColor("pig");
        System.out.println(c2.getColor());
        System.out.println(c2.toString());
    }
}
