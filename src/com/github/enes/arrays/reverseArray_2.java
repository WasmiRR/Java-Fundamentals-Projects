package com.github.enes.arrays;

public class reverseArray_2 {
    public static void main(String[] args) {


        int[] scores = {10, 20, 30, 40, 50};


        System.out.println("Before reverse: " + scores[0]);


        reverseArray_2(scores);

        System.out.println("After reverse: " + scores[0]);

    }

    public static void reverseArray_2(int[] arr) {

        //Bunun altını unutma for döngüsünü ve karşı tarafı eşitlemen gerektiğini!!
        for (int i = 0; i < arr.length / 2; i++) {
            int karsiTaraf = arr.length - i - 1;
            int temp = arr[i];
            arr[i] = arr[karsiTaraf];
            arr[karsiTaraf] = temp;


        }
    }
}