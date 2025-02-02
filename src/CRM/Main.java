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
                2);
        market.startTime = "08 : 00";
        market.endTime = "22 : 00";


        int action;
        do {
            System.out.println("Menyuni tanlang! \n1. Mahsulot qo'shish \n2. Mahsulotni ekranga chiqazish \n3.Market haqida ma'lumot \n0. Dasturni tugatish");
            Scanner scanner = new Scanner(System.in);
            action = scanner.nextInt();
            switch (action){
                case 0: System.exit(0);
                case 1: market.addProduct();break;
                case 2: market.printProduct();break;
                case 3: System.out.println(market);;
            }
        } while (true);



    }
}