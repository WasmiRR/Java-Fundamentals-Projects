package com.github.enes.arrays;

public class shiftQueue {
    public static void main(String[] args) {

        String[] playlist = {"Madrigal", "Duman", "Yüzyüzeyken Konuşuruz", "Mor ve Ötesi"};
        System.out.println("Şu an çalan: " + playlist[0]);

        shiftQueue(playlist);

        System.out.println("Sıradaki çalan: " + playlist[0]);
        System.out.println("En sona atılan: " + playlist[playlist.length - 1]);

    }


    public static void shiftQueue(String[] songs){

        String temp = songs[0];

        for (int i=0; i<songs.length-1; i++){
                songs[i] = songs[i+1];

        }

        songs[songs.length - 1] = temp;
    }


}

