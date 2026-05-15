package car_speed;

public class CarMain {
    public static void main(String[] args){
        Car myCar = new Car("Seat Ateca");
        myCar.setSpeed(120);
        myCar.setSpeed(250);
        System.out.println("Arabanin son hizi: " + myCar.getSpeed());
    }
}
