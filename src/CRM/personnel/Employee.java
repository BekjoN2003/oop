package CRM.personnel;

public class Employee {
    String firstName;
    String lastName;
    Integer experience;
    Double salary;

    public Employee(String firstName, String lastName, Integer experience, Double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.experience = experience;
        this.salary = salary;
    }

    public Employee(){

    }

    public String toString(){
        return String.format("Name: %s,lastName: %s, experience: %d, salary: %.2f",
                firstName, lastName, experience, salary);
    }
}
