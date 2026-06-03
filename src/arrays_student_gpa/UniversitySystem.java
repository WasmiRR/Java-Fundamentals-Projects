package arrays_student_gpa;

public class UniversitySystem {
    public static void main(String[] args){

        Student[] list1 = new Student[3];


        list1[0] = new Student("Alice", 3.9);
        list1[1] = new Student("Bob", 3.4);
        list1[2] = new Student("Enes", 2.70);


        Student highestGpa = list1[0];

        for (int i=0; i<list1.length; i++){

            if (list1[i].getGpa()>highestGpa.getGpa()){
                highestGpa = list1[i];
            }

        }

        System.out.println("Top student is " + highestGpa.getName() +  " with a GPA of " + highestGpa.getGpa());


    }
}
