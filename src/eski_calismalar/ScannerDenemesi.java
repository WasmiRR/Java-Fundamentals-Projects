package eski_calismalar;

import java.util.Scanner;
public class ScannerDenemesi{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Arabanız Kaç Model?");
        int yas = keyboard.nextInt();

        keyboard.nextLine();

        System.out.println("Aracınızın Marka Ve Modeli Nedir?");
        String markamodel = keyboard.nextLine();
    }
}