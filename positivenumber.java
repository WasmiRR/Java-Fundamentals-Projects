import java.util.Scanner;
public class positivenumber {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int number = keyboard.nextInt();

        while (number<=0){
            System.out.println("Error! Number must be positive.");
            System.out.println("Enter a positive number: ");
            number = keyboard.nextInt();
        }

        System.out.println("Thank you! You entered: " + number);

    }
}
