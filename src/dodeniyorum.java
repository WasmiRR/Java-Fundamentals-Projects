import java.util.Scanner;
public class dodeniyorum {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int choice;
        do{
            System.out.println("===ATM MENU====");
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw money");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");
            choice = keyboard.nextInt();
            if (choice==1){
                System.out.println("Showing balance...");
            }else if (choice==2){
                System.out.println("Dispensing cash...");
            }else if(choice==3){
                System.out.println("Loggging out...");
            }else{
                System.out.println("Invalid choice!");
            }
        } while (choice != 3);
        System.out.println("Good Bye!");
    }
}
