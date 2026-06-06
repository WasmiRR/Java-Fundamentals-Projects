package inheritance_basics.example3;

public class Undergraduate extends Student{

    private int level;




    public Undergraduate (String name, int studentNumber, int level){

        super(name, studentNumber);
        this.level = level;



    }


    @Override public void writeOutput(){
        super.writeOutput();
        System.out.println("Student Level: " + level);
    }


}
