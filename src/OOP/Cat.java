package OOP;

public class Cat extends Animals {
    private static int count;
    public Cat(String name) {
        super(name);
        this.maxJump = 2;
        this.maxRun = 200;
        this.type = "Кот";
        count++;
    }

    public void swim(int dist) {
        System.out.println("Кот не умеет плавать");
    }
    public static int getCount() {
        return count;
    }
}
