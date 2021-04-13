package exe5;

import java.util.Arrays;

public class Line {
    point begin, and;

    public Line (int x1, int x2, int y1, int y2) {
        begin = new point(x1, y1);
        and = new point(x2, y2);
    }
    public Line (point begin, point and) {
        this.begin = begin;
        this.and = and;
    }
    public point getBegin () {
        return begin;
    }
    public void setBegin (point begin) {
        this.begin = begin;
    }
    public point getAnd () {
        return and;
    }
    public void setAnd (point and) {
        this.and = and;
    }
    public int getBeginX () {
        return begin.getX();
    }
    public void setBeginX (int x) {
        begin.setX(x);
    }
    public int getBeginY () {
        return  begin.getY();
    }
    public void setBeginY (int y) {
        begin.setY(y);
    }
    public int[] getBeginXY () {
        return begin.getXY();
    }
    public void setBeginXY (int x, int y) {
        begin.setXY(x, y);
    }
    public int getAndX () {
        return and.getX();
    }
    public void setAndX (int x) {
        and.setX(x);
    }
    public int getAndY () {
        return and.getY();
    }
    public void setAndY (int y) {
        and.setY(y);
    }
    public int[] getAndXY () {
        return and.getXY();
    }
    public void setAndXY (int x, int y) {
        and.setXY(x, y);
    }
    public String toString () {
        return "[ Begin = " + begin + ", And = " + and + "]";
    }
    public double getLength () {
        return begin.distance(and);
    }

    public static void main(String[] args) {
        Line l = new Line(1, 2, 3, 4);
        System.out.println(l);
        Line l1 = new Line(new point(6,7), new point(8,9));
        System.out.println(l1);

        l.setBegin(new point(29,06));
        l.setAnd(new point(20, 00));
        System.out.println(l);
        System.out.println("Begin is : " + l.getBegin());
        System.out.println("And is : " + l.getAnd());

        l.setBeginX(27);
        l.setAndX(04);
        l.setBeginY(19);
        l.setAndY(75);
        System.out.println(l);
        System.out.println("BeginX is : " + l.getBeginX());
        System.out.println("BeginY is : " + l.getBeginY());
        System.out.println("AndX is : " + l.getAndX());
        System.out.println("AndY is : " + l.getAndY());

        l1.setBeginXY(23, 45);
        l1.setAndXY(13, 33);
        System.out.println(l1);
        System.out.println("Begin x and y : " + Arrays.toString(l1.getBeginXY()));
        System.out.println("And x and y : " + Arrays.toString(l1.getAndXY()));
        System.out.printf("Length is : %.2f", l1.getLength());

    }
}

