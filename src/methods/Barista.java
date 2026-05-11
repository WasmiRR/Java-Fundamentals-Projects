package methods;

public class Barista {
    public void siparisHazirla(String kahveIsmi){
        System.out.println("Hemen hazırlıyorum! " + kahveIsmi + " siparişiniz alınıyor...");
    }
    public double paraUstuHesapla(double odenenTutar, double kahveFiyati){
        double paraustu = odenenTutar - kahveFiyati;
        return paraustu;
    }


}
