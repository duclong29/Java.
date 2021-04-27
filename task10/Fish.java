package lab4;

public class Fish extends Animal {
    private String type;

    public Fish () {}

    public Fish (String type) {
        this.type = type;
    }


    public String getType() {
        return type;
    }

    public void setType (String type) {
        this.type = type;
    }

    public void swim () {
        System.out.println("boi ngua");
    }

    public void dive () {
        System.out.println("lan up mat");
    }

    public String toString () {
        return "Type :" + type;
    }

    @Override
    public Animal haveBaby (String name) {
        Fish f = new Fish();
        f.name = name;
        return f;
    }

}
