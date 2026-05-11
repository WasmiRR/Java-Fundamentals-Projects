package oop_basics;

public class SeatAteca {
    public String renk;
    public int yil;
    public boolean carPlayAktifMi;

    public SeatAteca(String siparisRenk, int siparisYili) {
        renk = siparisRenk;
        yil = siparisYili;
        carPlayAktifMi = false;
    }

    public void arabaBilgileriniGoster() {
        System.out.println("--- Araç Bilgileri ---");
        System.out.println("Yıl: " + yil);
        System.out.println("Renk: " + renk);
        System.out.println("CarPlay Aktif mi: " + carPlayAktifMi);
    }
}






