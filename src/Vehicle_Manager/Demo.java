package Vehicle_Manager;

public class Demo {
    public static void main(String[] args){
        VehicleManager arac1 = new VehicleManager("Standart Automatic");
        arac1.generateMaintenanceID();

        String[] liste1 = {" 1250.50", "85.0 ", " 430.75"};
        double toplamMaliyet = VehicleManager.calculatePartsCost(liste1);
        System.out.println("String dizisinden hesaplanan toplam maliyet: " + toplamMaliyet + " TL");

        System.out.println(VehicleManager.totalVehiclesProcessed);

    }





}
