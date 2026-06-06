package inheritance_basics.example4;

public class CrewRocket extends Rocket{


    private int astronautCount;



    public CrewRocket (String missionName, double fuelCapacity, int astronautCount){

        super(missionName, fuelCapacity);
        this.astronautCount = astronautCount;


    }



    @Override public void launch(){
        super.launch();
        System.out.println("Mürettebat modülü hazır. Astronot Sayısı: " + astronautCount);

    }



    public void startLifeSupport(){

        System.out.println("DİKKAT! Yaşam destek sistemleri devrede! ");

    }



}
