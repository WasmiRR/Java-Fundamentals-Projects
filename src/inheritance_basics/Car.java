package inheritance_basics;


public class Car extends Vehicle {


    private String licensePlate;


    public Car (int wheels, String licensePlate) {

        super(wheels);

        this.licensePlate = licensePlate;

    }

@Override

    public void startEngine(){
        System.out.println("Audi A8L aracınızın motoru çalışmaya başladı, " + licensePlate + " yola çıkmaya hazır.");

    }



}