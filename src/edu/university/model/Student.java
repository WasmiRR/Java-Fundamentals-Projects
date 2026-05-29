package edu.university.model;

public class Student {

    private String name;
    private int id;
    private Grade grade;

    private static int nextId = 1000;

    public Student(String name){
        this.name = name;
        this.id = nextId++;
        this.grade = null;
    }

    public String getName(){
        return name;

    }


    public int getId(){
        return id;
    }

    public Grade getGrade() {
        return grade;
    }


    public void setGrade(Grade yeniNot) {
        this.grade = yeniNot;

    }

    public boolean hasPassed(){
        return grade != null&& grade.isPassing();
    }
}
