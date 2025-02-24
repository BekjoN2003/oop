package CRM.markets;
import CRM.personnel.Employee;
import CRM.product.Product;
import java.util.Arrays;
import java.util.Scanner;
import CRM.helper.Config.*;

import static CRM.helper.Config.scanner;

public class Market {
    private String name;
    public String address;
    private Product[] products;
    private Employee[] employees;
    private Double square;
    private String startTime;
    private String endTime;
    /**
     * index of new inserted product
     */
    private int index;
    private int indexE;
    // Topshiriq: Yangi method qo'shish, yani Mahsulotni o'chirish degan;

    public Market(String name, String address, Double square, String startTime, String endTime, int productCount, int employeeCount) {
        this.name = name;
        this.address = address;
        this.square = square;
        this.startTime = startTime;
        this.endTime = endTime;
        products = new Product[productCount];
        employees = new Employee[employeeCount];
    }

    public Market() {
        products = new Product[10];
        employees = new Employee[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 4){
        this.name = name;
        } else System.out.printf("%s uzunligi to'g'ri kelmadi \n", name);
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        if (address.length() >= 4){
            this.address = address;
        } else System.out.printf("%s uzunligi to'g'ri kelmadi \n", address);
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        if (products != null) {
            this.products = products;
            index = products.length;
            resizeArray();
        }
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        if(employees != null){
            this.employees = employees;
            index = employees.length;
            resizeArray();
        }
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        if (square >= 30) {
            this.square = square;
        } else System.out.printf("%s Market maydonini to'g'ri kiriting \n", square);
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        if (startTime != null){
        this.startTime = startTime;
        } else System.out.print("%s Marketning ochilish vaqtini kiriting");
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        if (endTime != null) {
            this.endTime = endTime;
        } else System.out.print("%s Marketning yopilish vaqtini kiriting");
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void addProduct() {
        String name, type, unit;
        double price, amount;
        scanner.nextLine();
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

        Product product = new Product(name, type, unit, price, amount);

        if (index == products.length) {
            resizeArray();
        }
        products[index++] = product;
        /*
         * postfix -> a++;
         * prefix -> ++a;
         * */
    }

    public void addEmployee() {
        String firstName, lastName;
        int experience;
        double salary;
        scanner.nextLine();
        System.out.print("Employee Name: ");
        firstName = scanner.nextLine();
        System.out.print("Employee lastName: ");
        lastName = scanner.nextLine();
        System.out.print("experience: ");
        experience = scanner.nextInt();
        System.out.print("salary: ");
        salary = scanner.nextDouble();

        Employee employee = new Employee(firstName, lastName, experience, salary);

        if (indexE == employees.length){
            resizeArray();
        }
        employees[indexE++] = employee;
    }

    public void printEmployee() {
        for (int i = 0; i < indexE; i++) {
            if (employees[i] != null){
                System.out.println(i + 1 + "." + employees[i]);
            }
        }
    }

    public Employee deleteEmployee(int number) {
        if(number >= index) {
            System.out.println("Bunday o'rin mavjud emas");
            return null;
        } System.out.println("O'chirish uchun Empolee ismini kiriting");
        number = scanner.nextInt();
        Employee empl = employees[number - 1];
        for(int i = number - 1; i < index - 1; i++){
            employees[i] = employees[i+1];
        }
        employees[index -1] = null;
        index --;
        return empl;
    }


    public Product deleteProduct(int number){
        System.out.println("productni nomerini kriting ");
        number = scanner.nextInt();
        Product product = products[number - 1];
        for (int i = number - 1; i< index - 1; i++){
            products[i] = products[i + 1];
        }
        products[index - 1] = null;
        index--;
        return product;
    }

    public void getProduct() {

    }


    public void resizeArray() {
        //  Product[] temp = new Product[products.length * 2];

//        for (int i = 0; i<products.length; i++){
//            temp[i] =products[i];
//        }
//        products = temp;
        products = Arrays.copyOf(products, products.length * 2);
        employees = Arrays.copyOf(employees, employees.length * 2);
    }

/**             compile-time polymorphism - overloading
//              method nomlari bir xil, parametrlari har xil bo'lishi kerak*/
    public void printProducts() {
        for (int i = 0; i < index; i++) {
            System.out.println(i + 1 + "." + products[i]);
        }
    }

    public void printProducts(int size){
        for (int i = 0; i < size && i < index; i++){
            System.out.println(i + 1 + "." + products[i]);
        }
    }


    public String toString() {
        return String.format("Nomi: %s \nManzili: %s \nHajmi: %f \nIsh boshlash vaqti: %s \nIsh tugash vaqti: %s\n",
                name, address, square, startTime, endTime);
    }

    public String toStringWithNumber(){
        return String.format("1.Nomi: %s" +
                "\n2.Manzili: %s" +
                "\n3.Hajmi: %f.2" +
                "\n4.Ish boshlash vaqti: %s" +
                "\n5.Ish tugash vaqti: %s",
                name, address, square, startTime, endTime);
    }
    // %s -> string
    // %d -> butun son(integer, short, byte, long)
    // %f -> haqiqiy son(float, double)
}

//  Encapsulation
// access modifier 4ta -> private, protected, public, default;
// 1. private - faqat class ichida ko'rinadi
//2. default - o'zi turgan papka ichida ko'rinadi
//3. protected - o'zi turgan papka ichida va extends olgan subclass ichida ko'rinadi
//4. public - hamma yerda ko'rinadi

// polymorphism -> poly - ko'p, morphism - shakl (methodlar uchun ishlatilinadi)
// compile-time polymorphism -- overloading
// run-time polymorphism -- overriding
// method nomi bir xil parametrlari har xil bo'lishi kerak


 /* Data types (Ma'liumot turlari)



                                   1- Primitive D.T. (int, char, bolean, byte,
                                                long, short, float, double)
     2 qismga bo'linadi =>
                                    2- None primitive D.T.(Class, Object, String,
                                                    Interface, Array)

     */
