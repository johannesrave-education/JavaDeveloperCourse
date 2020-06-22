package eu.johannesrave;

public class BankAccount {
    private int accNumber;
    private double balance;
    private String name;
    private String email;
    private int phone;

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }
    
    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void depositFunds(double amount){
        this.balance += amount;
    }
    
    public void withdrawFunds(double amount){
        if (this.balance <= amount){
            this.balance -= amount;
        } else {
            System.out.println("Not enough money in your account.");
        }
            
    }
}
