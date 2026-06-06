package inheritance_basics.example4;

public class Rocket extends SpaceVehicle {

    private double fuelCapacity;




    public Rocket (String missionName, double fuelCapacity){

        super(missionName);
        this.fuelCapacity = fuelCapacity;
    }


    @Override public void launch(){
        super.launch();
        System.out.println("Roket motorları devrede. Yakıt Durumu: " + fuelCapacity + " ton.");
    }


    public String toString(){
        return "Roket [Görev: " + getMissionName() + " Yakıt: " +fuelCapacity +"]";
    }


    @Override
    public  boolean equals(Object obj){
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Rocket)) {
            return false;
        }

        Rocket digerRocket = (Rocket) obj;



        boolean isimAynimi = this.getMissionName().equals(digerRocket.getMissionName());

        boolean yakitAynimi = (this.fuelCapacity == digerRocket.fuelCapacity);

        return isimAynimi && yakitAynimi;


    }


}
