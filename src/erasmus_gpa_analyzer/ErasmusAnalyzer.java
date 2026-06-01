package erasmus_gpa_analyzer;

import java.util.Scanner;

public class ErasmusAnalyzer {
    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many exams did you take this semester? ");
        int exams = keyboard.nextInt();

        double[] grade = new double[exams];

        double sum = 0;

        for (int i=0; i<grade.length; i++){
            System.out.println("Enter grade " + (i+1) + ":" );
            grade[i] = keyboard.nextInt();
            sum += grade[i];
        }


        double average = sum / grade.length;
        System.out.println("Your GPA average is: " + average);

        for (int i=0; i<grade.length; i++){
            if (grade[i]<average){
                System.out.println(grade[i] + " is BELOW your avarage. ");
            }else if(grade[i]>average){
                System.out.println(grade[i] + " is ABOVE your avarage. ");
            }else{
                System.out.println(grade[i] + " is exactly your avarage. ");
            }
        }






    }
}
