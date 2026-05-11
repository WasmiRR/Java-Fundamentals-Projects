package eski_calismalar;

import java.util.Scanner;
public class BreakTrap {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bir seçim yapınız 1/2/3: ");
        int secim = keyboard.nextInt();

        switch (secim){
            case 1:
                System.out.println("Bakiye sorgulama seçildi.");
                break;
            case 2:
                System.out.println("Para çekme seçildi.");
                break;
            case 3:
                System.out.println("Müşteri Temsilcisine Bağlanılıyor...");
                break;
            default:
                System.out.println("Hatalı Tuşlama Yaptınız.");
                break;
                }

        }

    }

