package bank_project2;

public class SavingsAccountDemo {
    public static void main(String[] args) {
    SavingsAccount.setInterestRate(0.01);
    SavingsAccount mySavings = new SavingsAccount();
    SavingsAccount yourSavings = new SavingsAccount();

    mySavings.deposit(10.75);
    yourSavings.deposit(75.00);
    yourSavings.deposit(55.00);

    yourSavings.addInterest();
    System.out.println("Senin Bakiyen: TL " + yourSavings.getBalance());
    System.out.print("Benim Bakiyem: TL ");
    SavingsAccount.showBalance(mySavings);


    System.out.println("Açılan toplam hesap sayısı: " + SavingsAccount.numberOfAccounts);
    }
}