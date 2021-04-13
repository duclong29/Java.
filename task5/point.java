package exe5;

public class point {
    int x, y;
    public  point () {
        this.x = 0;
        this.y = 0;
    }

    public point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX () {
        return x;
    }

    public int getY () {
        return y;
    }

    public void setX (int x) {
        this.x = x;
    }

    public void setY (int y) {
        this.y = y;
    }

    public String toString () {
        return "(" + x + "," + y + ")";
    }

    public int[] getXY () {
        int[] resule = new int[2];
        resule[0] = this.x;
        resule[1] = this.y;
        return resule;
    }
    public void setXY (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double distance (int x, int y) {
        int rangeX = this.x - x;
        int rangeY = this.y - y;
        return Math.sqrt(rangeX * rangeX + rangeY * rangeY);
    }
    public double distance (point another) {
        int rangeX = this.x - another.x;
        int rangeY = this.y - another.y;
        return Math.sqrt(rangeX * rangeX + rangeY * rangeY);
    }
    public double distance () {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public static void main(String[] args) {
        point p1 = new point();
        System.out.println("rangeX is : " + p1.getX());
        System.out.println("rangeY is : " + p1.getY());
        System.out.println(p1);
        p1.setX(3);
        p1.setY(3);
        System.out.println(p1);
        System.out.println("coordinatesX is : " + p1.getXY()[0]);
        System.out.println("coordinatesY is : " + p1.getXY()[1]);
        System.out.println(p1.distance(3, 6));
        System.out.printf("%.2f\n", p1.distance());
        System.out.println("--------------------");
        point p2 = new point(2, 9);
        System.out.println("rangeX is : " + p2.getX());
        System.out.println("rangeY is : " + p2.getY());
        System.out.println(p2);
        p2.setX(3);
        p2.setY(5);
        System.out.println(p2);
        System.out.println("coordinatesX is : " + p2.getXY()[0]);
        System.out.println("coordinatesY is : " + p2.getXY()[1]);
        System.out.println(p2.distance(3, 6));
        System.out.printf("%.2f\n", p2.distance());
        System.out.println(p2.distance(p1));

    }
}
