package c05_arrays_MultiDimensioanalArrays;

import java.util.Arrays;

public class C05_TumElementleriKOntrolEtme {


    public static void main(String[] args) {

        int[][] arr = {{2, 3, 7}, {4, 5, 2, 3,}, {8, 9, 3, 5, 7}, {2, 6, 8, 5}};

        // arr'de ki cift sayilari toplami yazdirin


        int toplam = 0;
        int sayi;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] % 2 == 0) {

                    toplam += arr[i][j];

                }

            }

        }
        System.out.println(toplam);


        // arr'deki tek sayılardan en buyuk olanini yazdirin

        int enBuyukTeksayi = Integer.MIN_VALUE;
        // En buyuk tek sayiyi ariyoruz, gecici atadigimiz bu degeri EN KUCUK olarak atadik


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] % 2 != 0 && arr[i][j] > enBuyukTeksayi) {

                    enBuyukTeksayi = arr[i][j];

                }
            }
        }
        System.out.println("En buyuk tek sayi : " + enBuyukTeksayi);


        // arr'deki tum sayilari 1 artirin


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] += 1;


            }
        }
        System.out.println(Arrays.deepToString(arr)); // [[3, 4, 8], [5, 6, 3, 4], [9, 10, 4, 6, 8], [3, 7, 9, 6]]


        // arr'deki tum tek sayilari ve cift sayilari ayri ayri toplayip
        // ciftSayilarToplami - tekSayilarToplamini yazdirin


        int ciftSayilarToplami = 0;
        int tekSayilarToplamini = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] % 2 == 0) {
                    ciftSayilarToplami += arr[i][j];

                } else {
                    tekSayilarToplamini += arr[i][j];

                }


            }
        }

        System.out.println("cift tek sayilar arasındaki fark :" + (ciftSayilarToplami - tekSayilarToplamini));


    }
}
