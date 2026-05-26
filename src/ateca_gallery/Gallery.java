package ateca_gallery;

public class Gallery {
    public static void main(String[] args){
        AtecaCar araba1 = new AtecaCar("Xlellcene", 1.750000);
        AtecaCar araba2 = new AtecaCar("FR", 1.900000);
        System.out.println("Galerideki Toplam Araç: " + AtecaCar.toplamUretim);

        int rastgeleIndirim = (int)(Math.random() * 5000);
        System.out.println("Şanslı Müşteriye İndirim Tutarı: " + rastgeleIndirim + " TL ");
    }
}
