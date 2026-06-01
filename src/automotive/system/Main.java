package automotive.system;

public class Main {
    public static void main(String[] args) {
        Vehicle myAteca = new Vehicle("SeatAteca", EngineType.TSI);
        Vehicle myGolf = new Vehicle("VwGolf", EngineType.TDI);

        myAteca.setCurrentRpm(3000);

        myGolf.setCurrentRpm(7000);


        Vehicle[] garage = {myGolf, myAteca};

        for (Vehicle araba : garage) {

            System.out.println("Model: " + araba.getModelName());
            System.out.println("Motor: " + araba.getEngine());
            System.out.println("HP: " + araba.getEngine().getHorsepower() + " HP");
            System.out.println("Current RPM: " + araba.getCurrentRpm());

        }
    }
}
