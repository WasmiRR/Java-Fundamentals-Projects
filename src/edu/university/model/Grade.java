package edu.university.model;

public enum Grade {
    A(4.0, true),
    B(3.0, true),
    C(2.0, true),
    D(1.0, true),
    F(0.0, false);


    private final double points;
    private final boolean passing;

    private Grade(double points, boolean passing){
        this.points = points;
        this.passing = passing;
    }



    public boolean isPassing(){
        return passing;
    }


    public double getPoints() {
        return points;
    }
}
