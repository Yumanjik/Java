public class MainLab1 {
    public static void main(String[] args) {
        ElectronicShopping order1 = new ElectronicShopping(1, "Федор",
                "Процессор", "Россия",
                "Безналичный расчет", 25000, "23.02.2023",
                "Белкин Федор Дмитриевич");
        ElectronicShopping order2 = new ElectronicShopping();
        ElectronicShopping order3 = new ElectronicShopping(2, "Юлия",
                "Видеокара", "Россия",
                "Безналичный расчет", 45000, "08.03.2023");
        System.out.println(order1.toString());
        System.out.println(order1);
        System.out.println(order3.getName().toString());
        order3.setSurname("Николаева Юлия Александровна");
        System.out.println(order3.toString());
    }
}