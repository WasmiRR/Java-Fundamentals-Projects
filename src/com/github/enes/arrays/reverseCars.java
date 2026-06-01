package com.github.enes.arrays;

public class reverseCars {
    public static void main(String[] args) {

        String[] otoparkKuyrugu = {"Megane", "Civic", "Ateca", "Golf", "BMW"};

        System.out.println("Valenin dizdiği yanlış araç sırası: " + otoparkKuyrugu[0]);

        reverseCars(otoparkKuyrugu);

        System.out.println("Valenin düzelttiği doğru araç sırası: " + otoparkKuyrugu[0]);

    }
        public static void reverseCars(String[] cars){
            for (int i=0; i<cars.length/2; i++){
                int karsiTaraf = cars.length -1 -i;

                String temp = cars[i];
                cars[i] = cars[karsiTaraf];
                cars[karsiTaraf] = temp;
            }
        }



    }

