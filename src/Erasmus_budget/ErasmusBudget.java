package Erasmus_budget;

public class ErasmusBudget {


    public static void main(String[] args) {


        double cash[] = {13.00, 8.25, 14.30, 9.89};
        String applepay[] = {"19.00", "7.32", "3.45", "17.32"};


        double nakitToplam = harcamaHesapla(cash);
        double kartToplam = harcamaHesapla(applepay);

        System.out.println("Nakit Harcamalar: €" + nakitToplam);
        System.out.println("Apple Pay Harcamaları: €" + kartToplam);
        System.out.println("GENEL TOPLAM: €" + (nakitToplam + kartToplam));
    }

    public static double harcamaHesapla(double cash[]) {
        double toplam = 0;
        for (int i = 0; i < cash.length; i++) {
            toplam = toplam + cash[i];
        }
        return toplam;
    }

    public static double harcamaHesapla(String applepay[]) {
        double toplam = 0;
        for (int i = 0; i < applepay.length; i++) {
            toplam = toplam + Double.parseDouble(applepay[i].trim());
        }
        return toplam;
    }
}