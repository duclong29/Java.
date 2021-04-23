package exercise8.Abstract;

interface Movable {
    public void MoveUp ();
    public void MoveDown ();
    public void Moveleft ();
    public void MoveRight ();
}

class MovablePoint implements Movable {
    protected int x, y;
    public MovablePoint (int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString () {
        return "(" + x + "," + y + ")";
    }

    @Override
    public void MoveUp() {
        x++;
        y--;
    }

    @Override
    public void MoveDown() {
        y--;
        x++;
    }

    @Override
    public void Moveleft() {
        y++;
    }

    @Override
    public void MoveRight() {
        x--;
    }
}

public class TestMovable {
    public static void main(String[] args) {
        Movable m = new MovablePoint(3, 4);
        System.out.println(m);
        m.MoveUp();
        System.out.println(m);
        m.MoveDown();
        System.out.println(m);
        m.Moveleft();
        System.out.println(m);
        m.MoveRight();
        System.out.println(m);

    }
}