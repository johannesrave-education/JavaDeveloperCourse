package eu.johannesrave;
public class Main {
    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount();
        
//        myBankAccount.setBalance(350.50);
        System.out.println("Your balance is: "+myBankAccount.getBalance());
    }
}

