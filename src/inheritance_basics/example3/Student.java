package inheritance_basics.example3;

public class Student extends Person {


    private int studentNumber;



    public Student(String name, int studentNumber){
        super(name);
        this.studentNumber = studentNumber;

    }

    @Override public void writeOutput(){
        super.writeOutput();
        System.out.println("Student Number: " + studentNumber);
    }

}
