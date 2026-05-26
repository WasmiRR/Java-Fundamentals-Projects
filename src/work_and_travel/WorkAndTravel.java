package work_and_travel;

public class WorkAndTravel {
    public static void main (String[] args){

        double[] haftalikSaatler = {35.5, 40, 38, 26.5, 23.5};
        String[] whatsappSaatleri = {" 12.5", "8.0 ", " 15.5 "};

        double toplamSaat = toplamMesaiHesapla(haftalikSaatler);
    System.out.println("Amerika'daki Toplam Mesai Saatim: " + toplamSaat + " saat");
        double totalSaat = toplamMesaiHesapla(whatsappSaatleri);
    System.out.println("WhatsApp'tan Gelen Ekstra Mesai: " + totalSaat + " saat");

    }

    public static double toplamMesaiHesapla (String[] whatsappSaatleri){
        double total = 0;
        for (int i=0; i<whatsappSaatleri.length; i++){
            String temizMetin = whatsappSaatleri[i].trim();
            double temizSayı = Double.parseDouble(whatsappSaatleri[i]);
            total = total + temizSayı;
        }

        return total;

    }

    public static double toplamMesaiHesapla (double[] haftalikSaatler){
        double toplam = 0;
        for (int i=0; i<haftalikSaatler.length; i++){
            toplam = toplam + haftalikSaatler[i];

        }
        return toplam;
    }

}
