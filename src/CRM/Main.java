package CRM;

import CRM.markets.Market;

public class Main {

    public static void main(String[] args) {

        Market market = new Market("Easy", "Shayxontohur tumani, Ganga", 80D, 8);
        market.addProduct();
        market.startTime = "08 : 00";
        market.endTime = "22 : 00";
        System.out.println(market);

        System.out.println("--------------------------------");

        Market market1 = new Market("Easy2", "Chilonzor tumani", 120D, 9);
        market1.addProduct();
        market1.startTime = "08 : 00";
        market1.endTime = "22 : 00";
        System.out.println(market);



    }
}