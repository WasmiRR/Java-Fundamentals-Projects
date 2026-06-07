package interface_basics.car_simulation;

public abstract class Vehicle implements Drivable{

    protected String brand; //yapamadım





    public Vehicle (String brand){


        this.brand = brand;


    }


    @Override public void startEngine(){

        System.out.println("Starting the engine of: " + brand);
    }


    public abstract void turnOnWipers();





}


