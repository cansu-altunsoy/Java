package c05_arrays_MultiDimensioanalArrays;

public class C04_TumElemanlariToplama {


    public static void main(String[] args) {


        int[] sayilar = {3, 6, 9, 1};

        // array'in tum elemanlarinin toplamini yazdirin

        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {


            toplam += sayilar[i];

        }
        System.out.println("Elementlerin toplamı" + toplam);


        //=================Cok katli Array toplamı=============


        // array'in tum elemanlarinin toplamini yazdirin
        int[][] arr = {{2, 3, 7}, {4, 5, 2, 3,}, {8, 9, 3, 5, 7}, {2, 6, 8, 5}};

        toplam = 0;
        for (int i = 0; i < arr.length; i++) {// auter array'deki inner array'leri kontrol eder

            for (int j = 0; j < arr[i].length; j++) {// her bir inner array'deki elementleri

                toplam += arr[i][j];


            }

        }
        System.out.println(toplam); // 79


        //EEGGERR iki katlı bir array'de tum elemenetleri gözden geçirmemeiz gerekiyorsa yukarda ki 2 katlı lopp'u standarat olarak kullanabiliriz


    }


}
