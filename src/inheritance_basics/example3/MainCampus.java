package inheritance_basics.example3;

public class MainCampus {
    public static void main(String[] args){

        Person[] yeni = new Person[3];



        yeni[0]= new Person("Dr.Adams");
        yeni[1]= new Student("Beth", 1001);
        yeni[2] = new Undergraduate("Jack", 2026, 1);



        for(Person p: yeni){
            p.writeOutput();

            System.out.println("Bu kişi bir öğrenci mi: " +(p instanceof Student));




        }


    }
}
