package Cats;

public class Main {
    public static void main(String[] args) {
        Cat[] Cats = new Cat[3];
        Cats[0] = new Cat("Хризолит",5,false);
        Cats[1] = new Cat("Руби",10,false);
        Cats[2] = new Cat("Сапфир",25,false);
        Plate plate = new Plate(30);
        plate.info();
        catsEat(Cats, plate);
        plate.info();
        plate.increaseFood(100);
        plate.info();
        catsEat(Cats, plate);
        plate.info();
    }

    public static void catsEat(Cat[] Cats, Plate plate) {
        for (int i = 0;i < Cats.length; i++) {
            if ((!Cats[i].getSatiety()) && (Cats[i].getAppetite() < plate.getFood())){
                Cats[i].eat(plate);
                Cats[i].setSatiety(true);
                System.out.println("Кот " + Cats[i].getName() + " поел");
            }
            else if (!Cats[i].getSatiety()) {
                System.out.println("Кот " + Cats[i].getName() + " не поел");
            }
        }
    }
}

