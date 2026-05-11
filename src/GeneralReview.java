import java.util.Scanner;
public class GeneralReview {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Kaçıncı döneminizdesiniz?");
        int donem = keyboard.nextInt();
        System.out.println("Gitmek istediğiniz Avrupa ülkesi hangisidir?");
        keyboard.nextLine();
        String ulke = keyboard.nextLine();
        System.out.println("Mezuniyet için hedeflediğiniz not ortalaması nedir?");
        double ortalama = keyboard.nextDouble();
        System.out.printf("Hedef ülke: %8s%n Aktif Dönem:%8d%n Hedef ortalama:%8.2f%n Kabul İhtimali:  %%95%n ",ulke, donem, ortalama);

    }
}
