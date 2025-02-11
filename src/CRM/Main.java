package CRM;

import CRM.markets.Market;

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
                5);


        int action;
        do {
            System.out.println("Menyuni tanlang! " +
                    "\n1. Mahsulot qo'shish " +
                    "\n2. Mahsulotni ekranga chiqazish " +
                    "\n3. Market haqida ma'lumot " +
                    "\n4. Mahsulotlarni ketma-ket chiqarish" +
                    "\n4. Employee qo'shishi " +
                    "\n5. Employee larni ekranga chiqarish " +
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
                    market.printProduct();
                    break;
                case 3:
                    System.out.println(market);
                case 4:
                    System.out.println("o'lchamni kiriting");
                    int size = scanner.nextInt();
                    market.printProducts(size);
                    break;
                case 5:
                    market.addEmployee();
                case 6:
                    market.printEmployee();
            }
        } while (true);


    }
}