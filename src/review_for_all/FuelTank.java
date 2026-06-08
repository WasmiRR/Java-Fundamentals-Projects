package review_for_all;

public class FuelTank {


    private double currentLiters;





    public FuelTank (double currentLiters){

        this.currentLiters = currentLiters;


    }


    public double getCurrentLiters(){

        return currentLiters;

    }


    public void addFuel(double liters) {

        if (liters<0){
            System.out.println("Error! Invalid amount!");
        }else{
            currentLiters += liters;
        }
    }
}
