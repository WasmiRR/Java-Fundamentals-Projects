package review_for_all;

public class TransactionManager {

    private static int  totalTransactions=0;
    private String accountName;







    public TransactionManager(String accountName){

        this.accountName = accountName;
        totalTransactions++;


    }


    public static int getTotalTransactions() {

        return  totalTransactions;
    }

        public void addFunds(double amount){

            System.out.println("Added double amount: " + amount);
        }

        public void addFunds(int dollars, int cents){

            System.out.println("Added exact cash: " +dollars + " dollars and " + cents + " cents.");
        }


}
