package CRM.product;

public class Product {
    String name;
    double price;
    String type;
    double amount;
    //unit -> o'lchov birligi
    String unit;

    public Product(String name, String type, String unit, double price, double amount) {
        this.name = name;
        this.type = type;
        this.unit = unit;
        this.price = price;
        this.amount = amount;
    }

    public Product(){

    }

    @Override
    public String toString(){
        return String.format("productName: %s, type: %s, unit: %s, price: %.2f, amount: %.2f",
                name,   type,   unit,   price,  amount);
    }
}