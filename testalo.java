import java.util.Scanner;
public class testalo{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int maxGrade = 0;
        int minGrade = 100;
        for (int i=1; i<=5; i++){
            System.out.println("Enter grade for Student " + i + ": ");
            int grade = keyboard.nextInt();
            if (grade>100) {
                System.out.println("System Halted!!");
                break;
            } else if (grade<0){
                System.out.println("Invalid grade! Skipping...");
                continue;
            }
                if (grade>maxGrade){
                    maxGrade = grade;
                }
                if (grade<minGrade){
                    minGrade = grade;

                }


        }
        System.out.println("\nHighest Grade: " + maxGrade);
        System.out.println("\nLowest Grade: " + minGrade);
    }
}