package com.github.enes.arrays;

public class VipOtopark {
    public static void main (String[] args) {

        String[][] otopark = {
                {null, null, null},
                {null, null, null}
        };


        otopark[0][1] = "Golf";
        otopark[1][2] = "Ateca";

        otoparkiGoster(otopark);

    }

    public static void otoparkiGoster(String[][] park){

        for (int i =0; i<park.length; i++){
           for ( int j=0; j<park[i].length; j++){
               System.out.print(park[i][j] + " ");

           }
        System.out.println();

        }
    }

}
