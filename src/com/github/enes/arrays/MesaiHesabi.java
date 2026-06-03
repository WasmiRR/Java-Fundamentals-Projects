package com.github.enes.arrays;

public class MesaiHesabi {
    public static void main(String[] args) {

        int[][] hours = {
                {8, 0, 9},
                {8, 0, 9},
                {8, 8, 8},
                {8, 8, 4},
                {8, 8, 8}
        };

        System.out.println("--- HAFTALIK MESAİ RAPORU ---");


        for (int emp=0; emp< hours[0].length; emp++){
            int total = 0;
            for(int day=0; day<hours.length; day++){

                total += hours[day][emp];

            }
            System.out.println("Employee: " + (emp + 1) + ": "  + total + "hrs");
            System.out.println();

        }
    }
}