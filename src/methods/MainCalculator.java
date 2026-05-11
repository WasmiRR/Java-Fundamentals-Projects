package methods;

public class MainCalculator {
    public static void main(String[] args){
        HesapMakinesi makine = new HesapMakinesi();
        makine.hosgeldinMesajiYazdir("Esma");
        double ödenecekTutar = makine.kdvHesapla(100.0);
        System.out.println("KDV DAHİL ÖDENECEK TUTAR: " + ödenecekTutar + "TL");

    }
}
