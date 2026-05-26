package ateca_gallery;

public class AtecaCar {

    private String donanimPaketi;
    private double fiyat;


    public static int toplamUretim = 0;

    public AtecaCar(String paket, double ucret){
            donanimPaketi = paket;
            fiyat = ucret;
            toplamUretim++;
    }
}
