package oop_basics;

public class CatMain {
    public static void main(String[] args){
        cat myCat = new cat();

        myCat.name= "Sütlaç";
        myCat.breed = "Tekir";
        myCat.age = 5;

        System.out.println("----SÜTLAÇIN BİLGİLERİ----");
        myCat.writeOutput();


        int humanYears = myCat.getAgeInHumanYears();
        System.out.println("Sütlaçın insan yaşı: " + humanYears);
    }
}
