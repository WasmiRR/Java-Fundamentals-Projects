package sneaker_project;

public class MagazaMain {
    public static void main(String[] args){
        Sneaker ayakkabi = new Sneaker("New Balance ", "530 ", 43);
        ayakkabi.kutuBilgisiYazdir();
        double ayakBoyu= ayakkabi.gercekCmHesapla();
        System.out.println("Ayakkabının gerçek ölçüsü: " + ayakBoyu +" cm");
    }

}
