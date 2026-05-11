package eski_calismalar;

public class boleanornek2 {
    public static void main(String[] args){
        int score = 85;
        int passingScore = 60;
        boolean dersiGecti = score >= passingScore;
        boolean derstenKaldi = passingScore > score;
        boolean perfectScore = score == 100;
        System.out.println("Öğrenci dersi geçti mi? " + dersiGecti);
        System.out.println("Öğrenci dersten kaldı mı? " + derstenKaldi);
        System.out.println("Öğrenci mükemmel skoru aldı mı? " + perfectScore);



    }
}
