package CRM.service;

import CRM.markets.Market;
import CRM.personnel.Users;
import CRM.product.Product;

import static CRM.helper.Config.scanner;

public class BuyerService {
     private Market market;
     private Users users;
     private Product[] products;

     public BuyerService(Market market){
         this.market = market;
     }

    public void start(){
         initUser();
         /** User menyulari
          * 1. Shaxsiy ma'lumotlar
          * 2. Market ma'lumotlari
          * 3. Mahsulotlar royhati
          * 4. Sotib olish
          * 0. Chiqish
          * */
         sikl:
         while(true){
             System.out.println("Menyuni tanlang: " +
                     "\n1. Shaxsiy ma'lumotlar" +
                     "\n2. Shaxsiy ma'lumotlarni o'zgaritirish" +
                     "\n3. Mahsulotlar royxati" +
                     "\n4. Market ma'lumotlari" +
                     "\n5. Sotib olsh" +
                     "\n6. Hisobni to'ldirish" +
                     "\n0. Chiqish");
             int action = scanner.nextInt();
             switch (action){
                 case 0:
                     break sikl;
                 case 1:
                     System.out.println(users); break;
                 case 2:
                     changeUserInfo();break;
                 case 3:
                     market.printProducts(); break;
                 case 4:
                     System.out.println(market);break;
                 case 5:
                     buyProduct(); break;
             }
         }
   }
   public void buyProduct(){
      market.printProducts();
      String amount;
       System.out.println("Sotib olmoqchi bo'lgan mahsulotingizni kiritng");
       amount = scanner.nextLine();
       Product[] product = new Product[products.length];
       //for (int i = 0; i< )
   }

    public void changeUserInfo(){
         String firstName, lastname;
         Double account;

        sikl:
        while(true) {
            System.out.println(users);
            System.out.println("Qaysi ma'umotni o'zgartiririshni xohlaysiz ?");
            int result = scanner.nextInt();

            switch (result) {
                case 1:
                    System.out.print("Isimni qayta kiriting: ");
                    scanner.nextLine();
                    firstName = scanner.nextLine();
                    users.setFirstName(firstName); break ;
                case 2:
                    System.out.print("Familiyani qayta kiring: ");
                    lastname = scanner.nextLine();
                    users.setLastName(lastname); break ;
                case 3:
                    System.out.print("Hisob raqamidagi pul miqdorini qayat kiriting: ");
                    account = scanner.nextDouble();
                    users.setAccount(account); break ;
                case 0:
                    break sikl;
                default:
                    System.out.println("Noto'g'ri raqam tanlandi");
            }
        }
    }

   /** User ma'lumotlarini kiritish */
   public void initUser(){
       System.out.print("Ismingizni kiriting: ");
       scanner.nextLine();
       String firsName = scanner.nextLine();
       System.out.print("Familyangizni kiring: ");
       String lastName = scanner.nextLine();
       System.out.print("Qancha miqdorda pulingiz bor? ");
       Double account = scanner.nextDouble();

       this.users = new Users(firsName, lastName, account);
   }
}
