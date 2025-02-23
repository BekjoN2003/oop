package CRM.service;

import CRM.markets.Market;

import static CRM.helper.Config.*;

public class Seller {
    private Market market;

    public Seller (Market market){
        this.market = market;
    }

    public void start() {
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
                        "\n8. Employee larni o'chirish" +
                        "\n0. Dasturni tugatish \n");
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
                        break;
                    case 7:
                        market.printEmployee();
                        break;
                    case 8:
                        market.deleteEmployee();
                }
            } while (true);
        }
    }




