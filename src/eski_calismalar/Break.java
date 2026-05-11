package eski_calismalar;

public class Break {
    public static void main(String[] args){
        for(int i=1; i<3; i++) {
            System.out.println("Dış döngü başladı: i =" + i);
            for (int j = 1; j < 5; j++) {
                System.out.println("   İç Döngü: j = " + j);
                if (j == 3) {
                    System.out.println("   BAM! j=3 oldu, iç döngü kırılıyor...");
                    break;
                }
            }
            System.out.println("Dış döngüye geri dönüldü. \n");
        }

    }
}
