package c10_passByValue_immutableClasses;

import java.util.Arrays;

public class C05_BirdenFazlaElemanBarindiranYapilar {

    public static void main(String[] args) {

        /*
        Java da Array ve arrayList gibi birden fazla element barindiran yapilarda method'da yapilan degisikligin, elementlere mi yoksa
         array ya da arrayLİst'in endisine yapıldigina bakar


         Elementler degistiyde java bu dagisikligi kabullenir, hata vermez
         AMMAAA array veya arrayList'in kendisine atama yapilirsa
         bu degisikligi kabul etmez, main method'da olusturulan halini kullanir

         */


        int[] arr = {3, 5, 6};

        // array'in elementlerini birer artirip son halini yazdiran bir method olusturun

        elementleriBirArttir(arr);// Method'da yazdirdi [4, 6, 7]
        System.out.println("Main method calıstıktan sonra array : " + Arrays.toString(arr)); // [4, 6, 7]
        // sadece elementler degisirse Java bu degisikligi kabullenir
        // Main method'da method call'dan sonra arr :  [4, 6, 7]


        // array'e 5 uzunlugunda ve icinde 4,7,8,3,1 elementleri olan yeni bir array atayip
        // array'i yazdiran method olusturun

        yeniArrAta(arr);
        System.out.println("Main method 2. kez calıstıktan sonra array : " + Arrays.toString(arr));


    }

    public static void elementleriBirArttir(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            arr[i] += 1;

        }
        System.out.println(Arrays.toString(arr));

    }

    public static void yeniArrAta(int[] arr) {

        int[] yeniArr = {4, 7, 8, 1, 3};

        arr = yeniArr;

        System.out.println("Method'da array'in son hali :" + Arrays.toString(arr));
    }


}
