package CRM.product;

public class Product {
    private String name;
    private String type;
    private double price;
    private double amount;
    //unit -> o'lchov birligi
    private String unit;

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

    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name.length()> 2) {
            this.name = name;
        } else System.out.println("Productni nomi 2 ta harfdan kichkina bo'lmasligi kerak!");
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        do {
            this.type = type;
        } while (!type.isEmpty());
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public Double getAmount(){
        return amount;
    }

    public void setAmount(Double amount){
        this.amount = amount;
    }

    public String getUnit(){
        return unit;
    }

    public void setUnit(String unit){
        if (!unit.isEmpty()) {
            this.unit = unit;
        } else System.out.println("Unit bo'sh bo'lmasligi kerak");
    }

}