/**
 * Created by Tianzhu on 2016/9/18.
 */
public class BankAccount {
    private String name;
    private double balance;
    private double transactionFee = 0;

    public BankAccount() {
        name = null;
        balance = 0;
    }
    public BankAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }
    
    public double getTransactionFee() {
        return transactionFee;
    }
    
    public void deposit(double amount){
        balance = balance + amount;
    }
    
    public void withdraw(double amount){
        if(balance - (amount + transactionFee)< 0){
            System.out.println("Error");
        }else{
            balance = balance - (amount + transactionFee);
        }
    }

    public boolean equals(BankAccount acc){
       return this.name.equals(acc.getName())&&this.balance == acc.getBalance()&& this.transactionFee == acc.getTransactionFee();
      
    }
    

}
