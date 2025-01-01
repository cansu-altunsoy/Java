package c05_arrays_MultiDimensioanalArrays;

public class C06_SonElementlerinToplami {
    public static void main(String[] args) {

        // Verilen 2 katli bir array’de her bir inner array’in son elementlerinin toplaminini yazdiran bir method olusturun.

        int[][] arr = {{2, 3, 7}, {4, 5, 2, 3,}, {8, 9, 3, 5, 7}, {2, 6, 8, 5}};


        //Tum elementleri elden geçirecek miyiz?

        int sonElemanlarinToplami = 0;

        for (int i = 0; i < arr.length; i++) {


            sonElemanlarinToplami += arr[i][arr[i].length - 1];


        }
        System.out.println(sonElemanlarinToplami); //24


    }
}
