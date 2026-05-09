import java.util.Scanner;
public class AyGunHesaplayıcı {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bir ay numarası giriniz: ");
        int ay = keyboard.nextInt();
        int gunSayisi = 0;

        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                gunSayisi = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                gunSayisi = 30;
                break;
            case 2:
                gunSayisi = 28;
                break;
            default:
                System.out.println("Hatalı Sayı Girdiniz!");
        }
        if (gunSayisi != 0) {
            System.out.println("Seçtiğiniz ay " + gunSayisi + " gün çekmektedir.");
        }

    }
}
