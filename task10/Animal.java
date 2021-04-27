package lab4;

public class Animal {
    protected String name;
    private Food food;

    public Animal () {
    }

    public Animal (String name, Food food) {
        this.name = name;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    protected int eat (Food food, int m) {
        food.mass -= m;
        return food.mass;
    }

    protected Animal haveBaby (String name) {
        return null;
    }
}
