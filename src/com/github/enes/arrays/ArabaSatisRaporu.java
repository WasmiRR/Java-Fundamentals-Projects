package com.github.enes.arrays;

public class ArabaSatisRaporu {
    public static void main(String[] args){

        int[][] satislar = {

                {15, 20, 30},
                {10, 25, 35},
                {20, 15, 45},
        };

        String[] modeller = {"Polo", "Leon", "Golf"};

        System.out.println("---- 3 AYLIK SATIŞ RAPORU ----");

        for (int i=0; i< satislar[0].length; i++){

            int total = 0;

            for(int j=0; j<satislar.length; j++){

                total += satislar[j][i];

            }


            System.out.println(modeller[i] + " Toplam satış: " + total);
            System.out.println();

        }


    }


}
