package exercise8;

 class Shape {
    private String color;

    public Shape (String color) {
        this.color = color;
    }
    public String getColor () {
        return color;
    }
    public void setColor (String color) {
        this.color = color;
    }
    public double getArea () {
        return 0;
    }
    public String toString () {
        return "Shape [Color = " + color + "]";
    }
}

 class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle (String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    @Override
     public double getArea () {
        return length * width;
    }
    @Override
     public String toString () {
            return "Rectangle [Length = " + length + ", Width = " + width + super.toString() + "]";
    }

}

 class Triangle extends Shape {
        private int base, height;
        public Triangle (String color, int base, int height) {
            super(color);
            this.base = base;
            this.height = height;
        }
        @Override
        public double getArea () {
            return 0.5 * base * height;
        }
        @Override
        public String toString () {
            return "Triangle [Base = " + base + ", height = " + height + super.toString() + "]";
        }
}

public class TestShape {
    public static void main(String[] args) {
        Shape s = new Rectangle("red", 5, 5);
        System.out.println(s);
        System.out.println(s.getArea());
        System.out.println("------------------------------");
        Shape s1 = new Triangle("blue", 4, 4);
        System.out.println(s1);
        System.out.println(s1.getArea());
    }
}

