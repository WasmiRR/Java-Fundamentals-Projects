package oop_basics;

public class OtoparkMain {
    public static void main(String[] args){
        SeatAteca myvehicle = new SeatAteca("Beyaz", 2017);
        myvehicle.arabaBilgileriniGoster();
        System.out.println("\n--- OBDeleven ile Kodlama Yapılıyor... ---");
        myvehicle.carPlayAktifMi = true;

        myvehicle.arabaBilgileriniGoster();
    }
}
