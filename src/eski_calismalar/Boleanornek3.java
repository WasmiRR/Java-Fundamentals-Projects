package eski_calismalar;

public class Boleanornek3 {
    public static void main(String[] args){
        int age = 25;
        boolean canVote = age >= 18;
        boolean isTeenager = age >= 13 && age <= 19;
        boolean isSenior = age >= 65;
        System.out.println("Age: " + age);
        System.out.println("Kullanıcı oy kullanabilir mi?  " + canVote);
        System.out.println("Kullanıcı ergenlik döneminde mi?  " + isTeenager);
        System.out.println("Kullanıcı yaşlı mı?  " + isSenior);
    }
}
