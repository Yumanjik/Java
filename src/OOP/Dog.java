package OOP;

public class Dog extends Animals {
    private static int count;
    public Dog(String name) {
        super(name);
        this.type = "Собака";
        this.maxRun = 500;
        this.maxSwim = 10;
        this.maxJump = 2;
        count++;
    }
    public static int getCount() {
        return count;
    }
}
