package CRM;

import CRM.markets.Market;
import CRM.product.Product;

import java.util.Scanner;

public class Main {
    /*
     * static - bu, o'zgarmas degan ma'noni bildiradi
     * Xatolik. -> NullPointerException - bu, qiymati Null ga teng bo'lgan o'zgaruvchi ustida qilingan amal orqali hosil bo'ldi*/

    public static void main(String[] args) {

        Market market = new Market(
                "Easy",
                "Shayxontohur tumani," +
                        " Ganga",
                80D,
                "08:00",
                "22:00",
                2,
                5
        );

        Product[] products = new Product[]{
            new Product("banan", "meva", "kg", 20000D, 30D),
                    new Product("shokolad", "shirinlik", "kg", 30000D, 45D),
                    new Product("qovun", "meva", "dona", 10000D, 60D),
                    new Product("tarvuz", "meva", "kg", 3000D, 40D),
                    new Product("uzum", "meva", "kg", 25000D, 60D),
                    new Product("nok", "meva", "kg", 30000D, 30D),
                    new Product("go'shit", "go'sht mahsuloti", "kg", 100000D, 10D),
                    new Product("cola", "ichimlik", "dona", 13000D, 50D),
        };
        market.setProducts(products);

        int action;
        do {
            System.out.println("Menyuni tanlang! " +
                    "\n1. Mahsulot qo'shish " +
                    "\n2. Mahsulotni ekranga chiqazish " +
                    "\n3. Mahsulotni o'chirish" +
                    "\n4. Market haqida ma'lumot " +
                    "\n5. Mahsulotlarni ketma-ket chiqarish" +
                    "\n6. Employee qo'shishi " +
                    "\n7. Employee larni ekranga chiqarish " +
                    "\n0. Dasturni tugatish \n");
            Scanner scanner = new Scanner(System.in);
            action = scanner.nextInt();
            switch (action) {
                case 0:
                    System.exit(0);
                case 1:
                    market.addProduct();
                    break;
                case 2:
                    market.printProducts();
                    break;
                case 3:
                    market.deleteProduct();
                    break;
                case 4:
                    System.out.println(market);
                case 5:
                    System.out.println("o'lchamni kiriting");
                    int size = scanner.nextInt();
                    market.printProducts(size);
                    break;
                case 6:
                    market.addEmployee();
                case 7:
                    market.printEmployee();
            }
        } while (true);

    }
}