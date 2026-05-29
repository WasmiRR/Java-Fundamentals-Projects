package measurement.temperature;

public class Temperature {


    private double celsius;


    public double getCelsius() {
        return celsius;
    }


    public void setCelsius(double value){
        if (value<-273.15){
            System.out.println("Error! Please enter a valid degree.");
            }else{
            this.celsius = value;
        }
    }

}
