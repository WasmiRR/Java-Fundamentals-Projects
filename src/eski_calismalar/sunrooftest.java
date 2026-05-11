package eski_calismalar;

import java.util.Scanner;
public class sunrooftest {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bir durum giriniz:");
        String durum = keyboard.nextLine();

        switch (durum.toUpperCase()){

            case "YAGMUR":
                System.out.println("Silecekleri çalıştır ve bagajı kontrol et.");
                break;
            case "GUNES":
                System.out.println("Sunroof'u açabilirsin ama tahliyeleri unutma!");
                break;
            case "YIKAMA":
                System.out.println("Basınçlı suya dikkat, bagaj su alabilir!");
                break;
            default:
                System.out.println("Yola devam, Ateca emrinde.");
                break;


        }

    }
}
