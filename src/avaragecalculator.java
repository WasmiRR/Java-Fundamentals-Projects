import java.util.Scanner;
public class avaragecalculator {
    public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("PHY 101 dönem sonu ortalamanızı girin (0-100): ");
    int ortalama = keyboard.nextInt();
    if (ortalama < 0 || ortalama > 100) {
        System.out.println("Girilen not 0 ile 100 arasında olmalıdır!");
    } else {
        if (ortalama > 60) {
            System.out.println("Tebrikler, PHY 101 dersini geçtiniz!");
            System.out.println("3.5 GPA için harika bir adım!");
        } else {
            System.out.println("Maalesef dersten kaldınız. Finalden 50 alma gibi bir baraj olmasa bile, genel ortalamayı 60'ın üzerine çekmek şart!");
        }
    }
    }
}
