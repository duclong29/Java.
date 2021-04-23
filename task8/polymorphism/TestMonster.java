package exercise8;

class Monster {
    protected String name;

    public Monster (String name) {
        this.name = name;
    }
    public String attack () {
        return "Name is : ";
    }
}

class FireMonster extends Monster {
    protected String name;

    public FireMonster (String name) {
        super(name);
    }
    public String attack () {
        return super.attack() + name;
    }
}

class WaterMonster extends Monster {
    protected String name;

    public WaterMonster (String name) {
        super(name);
    }
    public String attack () {
        return super.attack() + name;
    }
}

class StoneMonster extends Monster {
    protected String name;

    public StoneMonster (String name) {
        super(name);
    }
    public String attack () {
        return super.attack() + name;
    }
}

public class TestMonster {
    public static void main(String[] args) {
        Monster m = new FireMonster("vinh");
        Monster m1 = new WaterMonster("xuan");
        Monster m2 = new StoneMonster("long");

        System.out.println(m.attack());
        System.out.println(m1.attack());
        System.out.println(m2.attack());

        System.out.println("-----------------------------");
        m1 = new  FireMonster ("long");
        m2 = new WaterMonster("huong");
        System.out.println(m1.attack());
        System.out.println(m2.attack());
    }
}
