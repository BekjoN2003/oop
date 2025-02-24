package CRM.markets;

import CRM.parts.Cash;
import CRM.product.Product;

import java.util.Arrays;

import static CRM.helper.Config.scanner;

public class SuperMarket extends Market{
    private Cash[] cashes;
    private Product[] sales;// chegirmadagi mahsulotlar
    private Integer baskets;
    private Integer usingBaskets;

    private Integer saleIndex;


    /**
     *      Run-time polymorphism: overriding
     *      Ota class methodini bola(child) classda tanasini qaytadan yozish
     *      Shartlari:
     *      1.Nomi bir xil bo'lishligi kerak
     *      2.Parametrlari bir xil bo'lishi kerak
     *      3.Access modifier ni bola class faqar tepaga ko'tara oladi
     *      4. return type ni pastga qararb tushura olamiz (parentdan -> child) ga qarab
     *      5.Parametr o'zgas bo'ladi aks holda (Override) yoqoladi
            */
     /**
     * Access modifierlar
     * 1.private
     * 2.protected
     * 3.default
     * 4.public
      */


    public void addProduct(){
        System.out.println("Mahsulot qo'shish turini tanlang: " +
                "\n1.Chegirmadagi mahsulotlarga qo'shish: " +
                "\n2.Hozirgi bor mahsulotlardan chegirmaga o'tkazish " +
                "\n3.Mahsulot qo'shish");
        int result = scanner.nextInt();

        switch(result){
            //chegirmadagi mahsulotlani qo'shishi
            case 1:
                addSale();
                break;
            //bor bo'lgan mahsulotlarni chegirmaga o'tkazish
            case 2:
                super.printProducts();
                System.out.println("Qaysi mahsulot uchun chergirma qilmoqchisiz ?");
                int res = scanner.nextInt();
                Product sale = super.deleteProduct(res);
                System.out.println("Necha foiz chegirma qilmoqchisiz ?");
                /** Chegirma narxini belgilash*/
                double present = scanner.nextDouble();
                sale.setPrice(sale.getPrice() * (100D - present) / 100);
                /** Chegirmadagi mahsulotlarga qo'shish */
                addSale(sale);
            //mahsulot qo'shish
            case 3:
                super.addProduct();
                break;
        }

    }

    public void addSale(){
        String name, type, unit;
        double price, amount;

        System.out.print("name: ");
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

        if (saleIndex == sales.length) {
            this.resizeArray();
        }
        sales[saleIndex++] = product;
    }

    public void addSale(Product product){
        if(saleIndex == sales.length){
            this.resizeArray();
        }
        sales[saleIndex++] = product;
    }

    public void resizeArray(){
        sales = Arrays.copyOf(sales, saleIndex * 2);
    }

//    public SuperMarket(String name, String address, Double square){
//        super(name, address, square);
//    }
}
