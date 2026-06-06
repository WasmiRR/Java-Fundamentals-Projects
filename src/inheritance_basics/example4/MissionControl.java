package inheritance_basics.example4;

public class MissionControl {
    public static void main(String[] args) {

        SpaceVehicle[] dizi = new SpaceVehicle[3];


        dizi[0] = new SpaceVehicle("Apollo");
        dizi[1] = new Rocket("Tehlike", 1453);
        dizi[2] = new CrewRocket("Çok Tehlike", 1881, 6);

        for (SpaceVehicle p : dizi) {
            p.launch();
            if (p instanceof CrewRocket) {
                CrewRocket yeni = (CrewRocket) p;
                yeni.startLifeSupport();

            }

        }

    }
}