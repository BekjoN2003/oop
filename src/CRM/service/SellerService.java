package CRM.service;

import CRM.markets.Market;
import CRM.markets.SuperMarket;
import CRM.personnel.Employee;
import CRM.product.Product;

import static CRM.helper.Config.*;

public class SellerService {
    private Market market;
    private SuperMarket superMarket;
    public SellerService(SuperMarket superMarket) {
        this.superMarket = superMarket;
    }


    public SellerService(Market market) {
        this.market = market;
    }

    public void start() {
        int action;
        do {
            System.out.println("Menyuni tanlang! " +
                    "\n1. Mahsulot qo'shish " +
                    "\n2. Mahsulotni ekranga chiqazish " +
                    "\n3. Mahsulotni o'chirish" +
                    "\n4. Market haqida ma'lumot" +
                    "\n5. Market ma'lumotlarini o'zgartirish" +
                    "\n6. Mahsulotlarni ketma-ket chiqarish" +
                    "\n7. Employee qo'shishi " +
                    "\n8. Employee larni ekranga chiqarish " +
                    "\n9. Employee o'chirish" +
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
                    int number =scanner.nextInt();
                    market.deleteProduct(number);
                    break;
                case 4:
                    System.out.println(market);
                    break;
                case 5:
                    changeMarketInfo();break;
                case 6:
                    System.out.println("o'lchamni kiriting");
                    int size = scanner.nextInt();
                    market.printProducts(size);
                    break;
                case 7:
                    market.addEmployee();
                    break;
                case 8:
                    market.printEmployee();
                    break;
                case 9:
                    int delete = scanner.nextInt();
                    market.deleteEmployee(delete);
            }
        } while (true);
    }

    public void changeMarketInfo(){
        sikl:
        while(true){
            System.out.println(market.toStringWithNumber());
            System.out.println("Qaysi ma'lumotni o'zgartirishni hoxlaysiz ?");
            System.out.println("Menyuga qaytish uchun 0 ni bosing");
            int result = scanner.nextInt();
            scanner.nextLine();
            switch (result){
                case 1:
                    System.out.println("Market nomini qayta kiriting");
                    String name = scanner.nextLine();
                    market.setName(name);
                    break;
                case 2:
                    System.out.println("Market manzilini qayta kiriting");
                    String address = scanner.nextLine();
                    market.setAddress(address);
                    break;
                case 3:
                    System.out.println("Market hajmini qayta kiriting");
                    Double square = scanner.nextDouble();
                    market.setSquare(square);
                    break;
                case 4:
                    System.out.println("Market ochilish vaqtini qayta kiriting");
                    String startTime = scanner.nextLine();
                    market.setStartTime(startTime);
                    break;
                case 5:
                    System.out.println("Market yopilishi vaqtini qayta kiriting");
                    String endTime = scanner.nextLine();
                    market.setEndTime(endTime);
                    break;
                case 0:
                    break sikl;
            }
        }
    }
}




