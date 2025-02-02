package CRM.markets;


import CRM.personnel.Employee;
import CRM.product.Product;

import java.util.Arrays;
import java.util.Scanner;

public class Market {
    public String name;
    public String address;
    public Product[] products;
    public Employee[] employees;
    public Double square;
    public String startTime;
    public String endTime;
    /** index of new inserted product*/
    private int index;

    // Topshiriq: Yangi method qo'shish, yani Mahsulotni o'chirish degan;

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
        System.out.print("productName: ");
        name = scanner.nextLine();
        System.out.print("type: ");
        type = scanner.nextLine();
        System.out.print("unit: ");
        unit = scanner.nextLine();
        System.out.print("price: ");
        price = scanner.nextDouble();
        System.out.print("amount: ");
        amount = scanner.nextDouble();

        Product product = new Product(name, type, unit, price,amount);

        if (index == products.length){
            resizeArray();
        }
        products[index++] = product;
        /*
         * postfix -> a++;
         * prefix -> ++a;
         * */
    }

    public void getProduct(){

    }


    public void resizeArray(){
      //  Product[] temp = new Product[products.length * 2];

//        for (int i = 0; i<products.length; i++){
//            temp[i] =products[i];
//        }
//        products = temp;
        products = Arrays.copyOf(products, products.length * 2);
    }


    public void printProduct(){
        for (int i = 0; i<index; i++){
            System.out.println(i+ 1 + "." + products[i]);
        }
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
