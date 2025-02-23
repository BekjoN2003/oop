package CRM;

import CRM.markets.Market;
import CRM.service.Service;
import static CRM.helper.Config.scanner;

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
                2
        );
        Service service = new Service(market);
        service.start();

    }
}
