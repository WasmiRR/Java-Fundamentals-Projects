package bank_project2;

public class SavingsAccount {

private double balance;
public static double interestRate = 0;
public static int numberOfAccounts = 0;

public SavingsAccount(){
    balance = 0;
    numberOfAccounts++;
}

public static void setInterestRate(double newRate){
    interestRate = newRate;
}
public void deposit (double amount){
    balance += amount;

}



public void addInterest(){
    balance += balance * interestRate;
}

public double getBalance(){
    return balance;
}
public static void showBalance(SavingsAccount account) {
    System.out.println(account.getBalance());
}
}
