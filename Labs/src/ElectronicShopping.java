import java.util.Date;

public class ElectronicShopping {
    private int id;
    private String name;
    private String nameProduct;
    private String country;
    private String typePayment;
    private double amount;
    private String date;
    private String surname;
    public ElectronicShopping(int id, String name, String nameProduct, String country,
                              String typePayment, double amount, String date, String surname){
        this.id = id;
        this.name = name;
        this.nameProduct = nameProduct;
        this.country = country;
        this.typePayment = typePayment;
        this.amount = amount;
        this.date = date;
        this.surname = surname;
    }
    public ElectronicShopping(){

    }
    public ElectronicShopping(int id, String name, String nameProduct, String country,
                              String typePayment, double amount, String date){
        this.id = id;
        this.name = name;
        this.nameProduct = nameProduct;
        this.country = country;
        this.typePayment = typePayment;
        this.amount = amount;
        this.date = date;
    }
    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public String getNameProduct(){
        return nameProduct;
    }
    public String getCountry(){
        return country;
    }
    public String getTypePayment(){
        return typePayment;
    }
    public double getAmount() {
        return amount;
    }
    public String getDate() {
        return date;
    }
    public String getSurname(){
        return surname;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNameProduct(String nameProduct){
        this.nameProduct = nameProduct;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public void setTypePayment(String typePayment){
        this.typePayment = typePayment;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String toString(){
        return "id = " + id + "\n" +
                "name = " + name + "\n" +
                "nameProduct = " + nameProduct + "\n" +
                "country = " + country + "\n" +
                "typePayment = " + typePayment + "\n" +
                "amount = " + amount + "\n" +
                "date = " + date + "\n" +
                "surname = " + surname + "\n";
    }
}
