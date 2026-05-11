package methods;

public class HesapMakinesi {
    public void hosgeldinMesajiYazdir(String isim){
        System.out.println("Merhaba " + isim + ", dükkana hoş geldin!" );
    }
    public double kdvHesapla(double fiyat){
        double kdvlifiyat = fiyat + (fiyat/100)*20;
        return kdvlifiyat;
    }


}
