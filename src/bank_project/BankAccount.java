package bank_project;

public class BankAccount {
    private String accountHolder;
    private double balance;

public BankAccount(String accountHolder, double Initialbalance){
    this.accountHolder = accountHolder;
    this.balance = Initialbalance;
    if (Initialbalance<0){
        balance = 0;
    }
}

public String getAccountholder(){
    return accountHolder;
}
public double getBalance(){
    return balance;
}
public void deposit(double amount){
    if(amount>0){
        balance = amount + balance;
    }
}
public void withdraw(double amount){
    if(amount>0 && balance>=amount){
        balance = balance - amount;
    }else{
        System.out.println("Error:Insufficient funds!");
    }
}
}
