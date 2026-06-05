package space_mission;



public class Main {
    public static void main (String[] args){

        SpaceVehicle[] filo = new SpaceVehicle[3];



        filo[0] = new SpaceVehicle();
        filo[1] = new Rocket();
        filo[2] = new CrewRocket();


        for (int i=0; i< filo.length; i++){
            filo[i].launch();
        }


    }
}
