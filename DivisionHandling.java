import java.util.Scanner;
public class DivisionHandling {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("İlk vize notunuz nedir?");
        double not1 = keyboard.nextDouble();
        System.out.println("İkinci Vize notunuz nedir?");
        double not2 = keyboard.nextDouble();
        System.out.println("Final notunuz nedir?");
        double not3= keyboard.nextDouble();
        double toplam = not1+not2+not3;
        double ortalama = (double) toplam/ 3;
        System.out.println(ortalama);

    }

}
