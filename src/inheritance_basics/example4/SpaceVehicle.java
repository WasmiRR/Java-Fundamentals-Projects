package inheritance_basics.example4;

public class SpaceVehicle {


    private String missionName;




    public SpaceVehicle(String missionName){
        this.missionName = missionName;
    }


    public String getMissionName() {
        return missionName;
    }


    public void launch(){

        System.out.println("Uzay Aracı Ateşleniyor. Görev: " + missionName);
    }



}
