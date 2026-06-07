package interface_basics.car_simulation;

public class Main {
    public static void main(String[] args){

        Vehicle myCar = new SeatAteca();

        myCar.startEngine();
        myCar.turnOnWipers();
        myCar.accelerate(50);

    }
}
