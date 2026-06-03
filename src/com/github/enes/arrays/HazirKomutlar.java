package com.github.enes.arrays;
import java.util.Arrays;




public class HazirKomutlar {
    public static void main (String[] args){


        int[] sınavlar = {55, 12, 98, 45, 88};

        System.out.println(Arrays.toString(sınavlar));


        Arrays.sort(sınavlar);

        System.out.println(Arrays.toString(sınavlar));



        int indeks = Arrays.binarySearch(sınavlar, 88);

        System.out.println("88 notu şu indekste bulundu: " + indeks);

    }


}
