package CRM.markets;


import CRM.personnel.Employee;
import CRM.product.Product;

import java.util.Scanner;

public class Market {
    public String name;
    public String address;
    public Product[] products;
    public Employee[] employees;
    public Double square;
    public String startTime;
    public String endTime;
    public String weekdays;

    public Market(String name, String address, Double square){
        this.name = name;
        this.address = address;
        this.square = square;
    }

    public Market(){
        products = new Product[10];
    }

    public void addProduct(){
        String name, type, unit;
        double price, amount;

        Scanner scanner = new Scanner(System.in);
        System.out.println("name");
        name=scanner.nextLine();
        System.out.println("type");
        type = scanner.nextLine();
        System.out.println("unit");
        unit = scanner.nextLine();
        System.out.println("price");
        price = scanner.nextDouble();
        System.out.println("amount");
        amount = scanner.nextDouble();

        Product product = new Product(name, type, unit, price,amount);
        System.out.println(product);

    }


    public String toString() {
        return String.format("Nomi: %s \nManzili: %s \nHajmi: %f \nIsh boshlash vaqti: %s \nIsh tugash vaqti: %s\nHaftalik ish kuni 6/7, yakshanba dam olsih: %s",
                name, address, square, startTime, endTime, weekdays);
    }
    // %s -> string
    // %d -> butun son(integer, short, byte, long)
    // %f -> haqiqiy son(float, double)
}
