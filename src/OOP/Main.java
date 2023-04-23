package OOP;

public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Данил Болотин", "Главный менеджер", "holw@mailbox.com", "89998887755", 80000, 44);
        persArray[1] = new Person("Юлия Николаева", "Консультант", "Yuli@mailbox.com", "89884445511", 30000, 21);
        persArray[2] = new Person("Федор Белкин", "Складской рабочий", "Belk@mailbox.com", "89112123131", 20000, 54);
        persArray[3] = new Person("Валерий Тыковкин", "HR-менеджер", "tykovk@mailbox.com", "89445556699", 65000, 21);
        persArray[4] = new Person("Елизавета Замулло", "Генеральный директор", "ElZa@mailbox.com", "89991111111", 203000, 38);
        for (Person pers : persArray)
            if (pers.getAge() > 40)
                System.out.println(pers);

        Cat cat1 = new Cat("Руби");
        Cat cat2 = new Cat("Аква");

        Dog dog1 = new Dog("Аметист");
        Dog dog2 = new Dog("Кварц");

        System.out.println();

        dog1.run(400);
        dog2.swim(5);

        System.out.println();

        cat1.run(1700);
        cat2.swim(5);

        System.out.println(Animals.getCount());
    }
}

