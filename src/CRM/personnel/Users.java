package CRM.personnel;

public class Users {
    String firstName;
    String lastName;
    Double account;

    public Users(String firstName, String lastName, Double account){
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getAccount() {
        return account;
    }

    public void setAccount(Double account) {
        this.account = account;
    }

    public String toString(){
        return String.format("1. Ismi: %s \n2. Familiya: %s \n3. Hisobdagi pul miqdori: %.2f",
                firstName, lastName, account);

    }


}
