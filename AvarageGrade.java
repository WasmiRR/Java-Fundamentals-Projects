public class AvarageGrade {
    public static void main(String[] args){
        int[] notlar={85, 92, 78, 95, 88, 76, 90, 84};
        int sum = 0;
        int highest = notlar[0];
        int lowest = notlar[0];
        for (int not : notlar) {
            sum += not;
            if (not>=highest) {
                highest = not;
            }
            if (not<=lowest){
                lowest = not;

            }
        }
        double avarage = (double) sum / notlar.length;
        System.out.println("Toplam not sayısı: " + notlar.length);
        System.out.println(avarage);
        System.out.println(highest);
        System.out.println(lowest);
    }
}