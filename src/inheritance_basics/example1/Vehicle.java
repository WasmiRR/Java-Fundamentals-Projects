package inheritance_basics.example1;

public class Vehicle {

    private int wheels;


    public Vehicle (int wheels){
        this.wheels = wheels;

    }

    public int getWheels(){
        return wheels;
    }

    public void startEngine() {
        System.out.println("Genel bir aracın motoru çalıştırılıyor...");
    }

}
