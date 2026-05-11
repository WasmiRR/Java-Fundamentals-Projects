package sneaker_project;

public class Sneaker {
String marka;
String model;
int numara;

public Sneaker(String siparisMarka, String siparisModel, int siparisNumara){
    marka= siparisMarka;
    model=siparisModel;
    numara=siparisNumara;
}

public void kutuBilgisiYazdir() {
    System.out.println(marka + model + numara);
}

public double gercekCmHesapla(){
    if (numara==43){
        return 28;

    }else{
        return 27.5;
    }

}


}

