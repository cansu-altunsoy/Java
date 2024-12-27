package c03_scope_arrays;

import java.util.Arrays;

public class C06_TumElementleriKullanma {
    public static void main(String[] args) {


        int[] sayilar = {1, 2, 5, 6, 3, 8, 9, 7};

        //sayilar array'ini yazdirin

        System.out.println(Arrays.toString(sayilar));

        //sayilar array'inin tum elementlerini yan yana yazdirin

        /*
        EGERRR bir array'in tum elemantleri ile istenen bir işlem yapılacak ise for loop ile kullanırız

         */

        for (int i = 0; i < sayilar.length; i++) {

            System.out.print(sayilar[i] + " ");

        }


        //sayilar array'in deki tüm elemanların toplamini yazdir
        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {

            toplam += sayilar[i];

        }
        System.out.println("Tüm elementlerin toplami :" + toplam);


        //sayilar array'indeki çift sayıların carpımını yazdırın

        int carpim = 1;

        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i] % 2 == 0) {
                carpim *= sayilar[i];
            }


        }
        System.out.println("Çift elementlerin çarpım sonu :" + carpim);


    }
}
