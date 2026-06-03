package com.github.enes.arrays;


import java.util.Arrays;



public class GradeManager {
    public static void main(String[] args){



        int[] scores = {72, 95, 61, 88, 54, 91, 78, 83};


        System.out.println("Original: " + Arrays.toString(scores));

        int[] sorted = Arrays.copyOf(scores, scores.length);

        Arrays.sort(sorted);

        System.out.println("Sorted: " + Arrays.toString(sorted));


        int pos = Arrays.binarySearch(sorted, 88);

        System.out.println("88 found at index: "  + pos );


        double sum = 0;

        for (int i = 0; i<scores.length; i++) {

            sum += scores[i];

        }

            double average = sum / scores.length;


            System.out.println("Average: " + average + " | " + "Min: " + sorted[0] + " | " + "Max: "  + sorted[sorted.length -1] );


    }

}


