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

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", unit='" + unit + '\'' +
                '}';
    }
}