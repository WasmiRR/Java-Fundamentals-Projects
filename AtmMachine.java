public class AtmMachine {
    public static void main (String[] args){
        int accountBalance = 400;
        int withdrawAmount = 300;
        if (accountBalance >= withdrawAmount) {
            accountBalance = accountBalance - withdrawAmount;
            System.out.println("Withdrawal succesful!");
            System.out.printf("New balance:  $ %8.2f\n", (double)accountBalance);
        } else {
            System.out.println("Insufficient funds!");
            System.out.printf("Current balance: $ %8.2f\n", + (double)accountBalance );
        }
    }
}
