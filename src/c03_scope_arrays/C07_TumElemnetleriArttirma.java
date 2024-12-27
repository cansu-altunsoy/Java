package c03_scope_arrays;

import java.util.Arrays;

public class C07_TumElemnetleriArttirma {

    public static void main(String[] args) {

        /*
        Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun. Eski array’i yeni haliyle kaydedin.

         */


        int[] arr = {2, 3, 4, 6, 0};

        for (int i = 0; i < arr.length; i++) {

            arr[i] += 2;

        }
        System.out.println(Arrays.toString(arr));  //  [4, 5, 6, 8, 2]


        arr = arrayinElementleriniArtir(arr, 3);
        System.out.println(Arrays.toString(arr));  //  [7, 8, 9, 11, 5]


    }


    //============================================================================================================================


    //  Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun. Eski array’i yeni haliyle kaydedin.


    public static int[] arrayinElementleriniArtir(int[] arr, int artisMiktari) {

        for (int i = 0; i < arr.length; i++) {

            arr[i] += artisMiktari;

        }
        return arr;

    }


}
