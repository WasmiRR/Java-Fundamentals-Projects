package com.github.enes.arrays;

//Bu kod benim kendi elimle yazdığım bir kod değil, sadece koddaki eksik yerleri gözlemleyerek kendimi geliştirdiğim bir temel.


public class OtoparkKamerasi {
    public static void main(String[] args) {

        // 3 katlı, her katında 4 araçlık yer olan otopark (0 = Boş)
        int[][] otopark = {
                {0, 0, 0, 0}, // 0. Kat
                {0, 0, 0, 0}, // 1. Kat
                {0, 0, 0, 0}  // 2. Kat
        };

        System.out.println("--- OTOPARK KAMERASI ---");

        // DIŞ DÖNGÜ: Katları (Satırları) gezer
        // Soru: otopark'ın satır sayısını dinamik olarak nasıl buluruz?
        for (int i = 0; i <otopark.length; i++) {

            // İÇ DÖNGÜ: O kattaki park yerlerini (Sütunları) gezer
            // Soru: i. satırın sütun sayısını dinamik olarak nasıl buluruz?
            for (int j = 0; j <otopark[0].length; j++) {

                System.out.print(otopark[i][j] + " ");
            }
            // Bir alt kata geçmek için alt satıra (Enter) iniyoruz
            System.out.println();
        }
    }
}