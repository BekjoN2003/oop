package CRM.service;

import CRM.markets.Market;
import CRM.product.Product;

import static CRM.helper.Config.*;

public class Service {
    private Market market;

    public Service(Market market){
        this.market = market;
        initProduct();
    }
    public void start(){
        while (true) {
            System.out.print("Qanday foydalanuvchisiz? " +
                    "\n1. Haridor" +
                    "\n2. Sotuvchi ");
            int result = scanner.nextInt();
            if (result == 1) {
                // Haridorga bog'liq methodlar
                Buyer buyer = new Buyer(market);
                buyer.start();
                break;
            } else if (result == 2) {
                // Sotuvchiga bog'liq methodlar
                Seller seller = new Seller(market);
                seller.start();
                break;
            }
            System.out.println("Noto'g'ri raqam kiritildi!");
        }
    }

    public void initProduct(){
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
    }
}
