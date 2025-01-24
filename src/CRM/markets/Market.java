package CRM.markets;


import CRM.personnel.Employee;
import CRM.product.Product;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Market {
    public String name;
    public String address;
    public Product[] products;
    public Employee[] employees;
    public Double square;
    public String startTime;
    public String endTime;

    public Market(String name, String address, Double square, int productCount){
        this.name = name;
        this.address = address;
        this.square = square;
        products = new Product[productCount];
    }

    public Market(){
        products = new Product[10];
    }

    public void addProduct(){
        String name, type, unit;
        double price, amount;

        Scanner scanner = new Scanner(System.in);
        System.out.println("productName");
        name = scanner.nextLine();
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
        products[0] = product;
    }

    public void getProduct(){

    }


    public String toString() {
        return String.format("Nomi: %s \nManzili: %s \nHajmi: %f \nIsh boshlash vaqti: %s \nIsh tugash vaqti: %s\n",
                name, address, square, startTime, endTime);
    }
    // %s -> string
    // %d -> butun son(integer, short, byte, long)
    // %f -> haqiqiy son(float, double)
}

 /* Data types (Ma'liumot turlari)



                                   1- Primitive D.T. (int, char, bolean, byte,
                                                long, short, float, double)
     2 qismga bo'linadi =>
                                    2- None primitive D.T.(Class, Object, Sting,
                                                    Interface, Array)

     */
