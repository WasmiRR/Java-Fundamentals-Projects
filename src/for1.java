import java.util.Scanner;
public class for1{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int sum =0;

        for (int i=1; i<=5; i++) {
            System.out.println("Enter a score " + i + ": ");
            sum += keyboard.nextInt();
        }
            double avarage= sum/5.0;
            System.out.println("Avarage: " + avarage);


    }
}