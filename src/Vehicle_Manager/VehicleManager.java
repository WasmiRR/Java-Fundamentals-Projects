package Vehicle_Manager;

public class VehicleManager {

    private String transmissionType;
    public static int totalVehiclesProcessed=0;


    public VehicleManager(String transmissionType){
        this.transmissionType = transmissionType;
        totalVehiclesProcessed++;
    }


    public void generateMaintenanceID(){
        int random = (int)(Math.random() * 9000) + 1000;
        System.out.println("Vehicle " + transmissionType + " assigned  ID: " + random);
    }


    public static double calculatePartsCost(double[] costs ){
        double total = 0;
        for (int i=0; i<costs.length; i++){
            total = total + costs[i];
        }
        return total;
    }

    public static double calculatePartsCost(String[] costs){
        double total2= 0;
        for (int i=0; i<costs.length; i++){
            String temizMetin = costs[i].trim();
            double temizSayı = Double.parseDouble(temizMetin);
            total2= total2 + temizSayı;
        }

        return total2;

    }

}
