package first;

public class Human {
//------------ ACCESS MODIFIERS javada 4 ta bular ...
 /* private
 *  default
 *  protected
 *  public 
 */

    /* Data types (Ma'liumot turlari)

                                   1- Primitive D.T. (int, char, bolean, byte,
                                                long, short, float, double)
     2 qismga bo'linadi =>
                                    2- None primitive D.T.(Class, Object, Sting,
                                                    Interface, Array)

     */


    // private -> classni ichida
    // protected -> classni o'zida + packageda + voris olganda
    // default -> classni o'zida + packagedagi boshqa classlarda
    // public -> hammada




    // Klassni ichida nimalari bo'ladi ?
    //fields -> maydonlari
    //Constructor
    //Method

    // Constructor nima ? -> Constructor bu manashu Class(first.Human)ni obektini qurish uchun ishlatilinadigan metod.
    // Constructor lar Klasni obektini yaratish uchun xizmat qiladi

    // Obektni String holatidagi ko'rinishi sifatida "toString()" metodi foydalaniladi.


    //fields
    String name;
    int age;
    double weight;

    //Bu bo'sh Constructor
    public Human() {
        System.out.println("Constructor ga keldi !");
    }

    //Bo'sh bo'lmagan Constructor
    public Human(String name) {
        this.name = name;
    }

    //Method
    // (  %s  -> bu String qiymat qabul qiladi degani )
    // (  %d  -> Desimal integer, buni o'rnida butun son keladi )
    // (  %f  -> Float point, yani Xaqiqiy sonlar )
    public void printHuman()   {
        System.out.printf("Ismi: %s \nYoshi: %d \nVazni: %.2f\n", name, age, weight);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
