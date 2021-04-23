package exercise8;

public class Cylinder extends Circle{
    private double height;
    public Cylinder (double radius, double height) {
        super(radius);
        this.height = height;
    }
    public double getHeight () {
        return height;
    }
    public void setHeight (double height) {
        this.height = height;
    }
    public double getVolume () {
        return getArea() * height;
    }
    @Override
    public double getArea () {
        return 2 * Math.PI * getRadius() * height;
    }
    @Override
    public String toString () {
        return "Cylinder [Height = " + height + "," + super.toString() + "]";
    }

    public static void main(String[] args) {
        Circle c = new Cylinder(3, 3);
        System.out.println(c);
        System.out.println(c.getArea());
        c.setRadius(6);
        System.out.println(c);
        System.out.println(c.getArea());
    }
}
