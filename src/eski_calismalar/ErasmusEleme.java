package eski_calismalar;

import java.util.Scanner;
public class ErasmusEleme {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Sınav puanınızı giriniz...");
        int sinavPuanı = keyboard.nextInt();
        keyboard.nextLine();
        String sonucMesajı;
        if (sinavPuanı >= 85) {
            sonucMesajı = "Erasmus Asil Liste! Avrupa biletini al.";
        } else if (sinavPuanı >= 70) {
            sonucMesajı = "Erasmus Yedek Liste! Şansın devam ediyor.";
        } else {
            sonucMesajı = "Seneye tekrar deneyeceğiz, pes etmek yok!";
        }
    System.out.println(sonucMesajı);



    }
}
