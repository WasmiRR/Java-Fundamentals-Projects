package review_for_all;

public class GradeAnalyzer {


    private double grades[];
    private int count;







    public GradeAnalyzer(int capacity){


        this.grades = new int[capacity];
        this.count = 0;

    }


    public void addGrade(double grade){

        if(count<grades.length){
            grades[count] = grades;
            count++;
        }

    }







}
