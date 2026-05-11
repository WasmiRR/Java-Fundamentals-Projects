package methods;

public class DukkanMain {
    public static void main(String[] args){
        Barista calisan = new Barista();
        calisan.siparisHazirla("Americano");
        double alacagimpara = calisan.paraUstuHesapla(200.0, 85.0);
        System.out.println("Para Üstünüz: " + alacagimpara + "TL");


    }
}
