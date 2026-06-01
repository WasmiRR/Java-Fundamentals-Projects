package com.github.enes.arrays;

import java.util.Arrays;

public class reverseArray {
    public static void main (String[] args) {

        int[] myNumbers = {10, 20, 30, 40, 50};

        System.out.println("Ters çevrilmeden önce ilk eleman: " + myNumbers[0]);

        reverseArray(myNumbers);

        System.out.println("Ters çevrildikten sonra ilk eleman: " + myNumbers[0]);
    }

        public static void reverseArray(int[] arr){
            for (int i=0; i< arr.length/2; i++){
                int karsiTaraf = arr.length -1 -i;

                int temp = arr[i];
                arr[i] = arr[karsiTaraf];
                arr[karsiTaraf] = temp;
            }

            }

}
