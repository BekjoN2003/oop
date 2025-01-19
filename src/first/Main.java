package first;

public class Main {
    public static void main(String[] args) {



        Human inson =  new Human();
        inson.age = (22);
        inson.name = "Bek";
        inson.weight = 65;
        inson.toString();
        System.out.println(inson);


        Sportsmen sportsmen = new Sportsmen();
        sportsmen.name = "Muhammadqodir";
        sportsmen.age = 21;
        sportsmen.weight = 71;
        System.out.println(sportsmen);


        JavaProgrammer javaProgrammer = new JavaProgrammer();
        javaProgrammer.name = "Bekmurod";
        javaProgrammer.coding = "Java language";
        System.out.println(javaProgrammer);

    }
}

/* OOP -> Object Oriented Programming
 * OOPning 4 ta ustuni bo'ladi ular:
 * 1. Inheritance - vorislik
 * 2. Polymorphism
 * 3. Encapsulation
 * 4. Abstraction
 *
 *                          first.Human
 *                        /           \
 *              first.Programmer      first.Sportsmen
 *                       |             |
 *                     Java        first.Judoist
 *
 *
 *
 */



