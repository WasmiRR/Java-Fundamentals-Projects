package arrays_basics;

public class SpeedTest {
    public static void main (String[] args){
        double[] sureler = {9.2, 8.9, 9.5, 8.6, 9.1};
        double toplam = 0;

        for (int i=0; i < sureler.length; i++){
            toplam += sureler[i];
        }

        double ortalama = toplam / sureler.length;
        System.out.println("Ortalama hızlanma süresi: " + ortalama);


        double enIyiDerece = sureler[0];
        for (int i = 1; i < sureler.length; i++) {
            if (sureler[i]< enIyiDerece){
                enIyiDerece = sureler[i];

            }
        }

        System.out.println("En iyi derece: " + enIyiDerece);

    }
}
