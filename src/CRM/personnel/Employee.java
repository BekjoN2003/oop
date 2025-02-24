package CRM.personnel;

import java.util.Scanner;

public class Employee {
    private String firstName;
    private String lastName;
    private Integer experience;
    private Double salary;


    public Employee(String firstName, String lastName, Integer experience, Double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.experience = experience;
        this.salary = salary;
    }

    public Employee(){

    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String lastName){
        this.lastName = lastName;
    }

    public Integer getExperience(){
        return experience;
    }

    public void setExperience(Integer experience){
        this.experience = experience;
    }

    public Double getSalary(){
        return salary;
    }

    public void setSalary(Double salary){
        this.salary = salary;
    }

    public String toString(){
        return String.format("Name: %s,lastName: %s, experience: %d, salary: %.2f",
                firstName, lastName, experience, salary);
    }
}
