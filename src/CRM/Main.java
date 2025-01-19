package CRM;

import CRM.markets.Market;

public class Main {

    public static void main(String[] args) {

        Market market = new Market("Easy", "Shayxontohur tumani, Ganga", 80D);
        market.addProduct();
        market.startTime = "08 : 00";
        market.endTime = "22 : 00";
        System.out.println(market);

        System.out.println("--------------------------------");

        int max1 = findMax(234, 54, 382);
        int max2 = findMax(2345, 684, 35);
        int max3 = findMax(639, 980, 42);
        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);

    }


    static int findMax(int a, int b, int c) {
        int max;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;

        } else {
            max = c;
        }
        return max;
    }
}