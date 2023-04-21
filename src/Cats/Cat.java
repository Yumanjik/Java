package Cats;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }
}
