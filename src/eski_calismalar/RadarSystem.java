package eski_calismalar;

import java.util.Scanner;
public class RadarSystem {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the wanted license plate: ");
        int targetPlate = keyboard.nextInt();
        boolean found = false;
        for (int i=1; i<=5; i++) {
            System.out.println("Enter scanned plate " + i + ": ");
            int scannedPlate = keyboard.nextInt();
            if (scannedPlate == targetPlate) {
                System.out.println("ALARM! Wanted car detected at position " + i);
                found = true;
                break;
            }
        }
            if (!found){
        System.out.println("Target not found. Coast is clear.");
        }


    }
}
