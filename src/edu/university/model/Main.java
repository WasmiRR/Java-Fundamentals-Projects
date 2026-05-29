package edu.university.model;

public class Main {
    public static void main(String[] args) {
        Student A1 = new Student("Ali");
        Student B2 = new Student("Berkay");
        Student C3 = new Student("Ceylin");

        A1.setGrade(Grade.A);
        B2.setGrade(Grade.C);
        C3.setGrade(Grade.F);

        Student[] students = {A1, B2, C3};

        for (int i=0; i<students.length; i++){
            System.out.println("Student Name: " + students[i].getName());
            System.out.println("Passed: " + students[i].hasPassed());
            System.out.println("GPA Points: " + students[i].getGrade().getPoints());
        }

    }
}