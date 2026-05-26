package flight_baggage;

public class FlightBaggage {
    public static void main(String[] args){
    double[] baggages = {32.3, 35.0, 22.6, 33.8, 23.46};
    String[] baggage = {" 23.0", " 20.0 ", "13.6", "23.7", "13.38"};


    double total1 = calculateTotalWeight(baggages);
    System.out.println("Your total baggage weights are: " + total1 +  ".");

    double total2 = calculateTotalWeight(baggage);
        System.out.println("Your total baggage weights are: " + total2 + ".");

    }


    public static double calculateTotalWeight (double[] baggages){

        double totalWeight = 0;
        for (int i=0; i<baggages.length; i++){
            totalWeight = totalWeight + baggages[i];
        }
    return totalWeight;

    }


    public static double calculateTotalWeight(String[] baggage){
        double totalWeight2 = 0;
        for (int i=0; i<baggage.length; i++){
            String temizMetin = baggage[i].trim();
            double temizSayı = Double.parseDouble(temizMetin);
            totalWeight2 = totalWeight2 + temizSayı;
        }
        return totalWeight2;


    }



}
