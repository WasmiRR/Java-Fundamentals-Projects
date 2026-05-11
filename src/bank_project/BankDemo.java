package bank_project;

public class BankDemo {
    public static void main(String[] args){
    BankAccount bobaccount = new BankAccount("Bob", 500.0);
    bobaccount.deposit(250.0);
    bobaccount.withdraw(1000.0);
    bobaccount.withdraw(150.0);

    double finalBalance = bobaccount.getBalance();
    double interestAmount = finalBalance * 0.05;
    System.out.println("Bob's current balance: " + finalBalance + " Interest amount: " + interestAmount );

    }
}
