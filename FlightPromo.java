import java.util.Scanner;
public class FlightPromo {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int finalAttempt = 3;
        int attempt = 0;
        boolean isCodeValid = false;
        while (!isCodeValid && attempt < finalAttempt ){
            System.out.println("Enter the discount code: ");
            String password = keyboard.nextLine();
            attempt++;
            if (password.equals("ERASMUS")){
                isCodeValid = true;
                System.out.println("Awesome! 20% discount applied.");
            } else{
                System.out.println("Invalid code. Remaining attemps: " + (finalAttempt-attempt));

            }
        }
    }
}