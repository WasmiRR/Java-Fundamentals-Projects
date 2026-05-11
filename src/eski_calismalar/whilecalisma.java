package eski_calismalar;

import java.util.Scanner;
public class whilecalisma {
    public static void main(String[] args){
        int count=1;
        int sum=0;
        System.out.println("Enter 5 numbers: ");
        Scanner keyboard = new Scanner(System.in);
        while (count<=5){
            System.out.print("Number " + count +": ");
            int number = keyboard.nextInt();
            sum += number;
            System.out.println("Sum so far: " + sum );
            count++;
        }

        System.out.println("\n Final sum: " + sum);



    }
}
