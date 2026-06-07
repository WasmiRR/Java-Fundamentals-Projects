package interface_basics.car_simulation;

public class SeatAteca extends Vehicle  {

        private int currentSpeed;



        public SeatAteca(){
            super("Seat Ateca");
            currentSpeed = 0;
        }


        @Override public void turnOnWipers(){
            System.out.println("Wipers are sweeping the windshield.");

    }


    @Override
    public void accelerate(int targetSpeed) {
        currentSpeed = targetSpeed;

        System.out.println("Accelerating to: " + currentSpeed + " km/h");
    }
}
