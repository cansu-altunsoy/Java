package c07_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {

        /*

        1- for loop
        baslangıc ve sonuc biliniyorsa, tekrar sayisi biliniyorsa

        2- while loop
         tekrar sayisi belli degilse

         3- do-while loop
         loop' body'nin en az 1 kere calismasi gereken durumlarda

          4- ForEach loop
          Çok özel bir kullanim icin olusturulmustur ama o kullanimda cok ideal'dir

          For-each loop birden fazla eleman barindiran yapilardaki  TUM ELEMENTLERI siralama olmaksizin (index kullanmadan) bize getirir

         */


        int[] arr = {1, 5, 3, 6, 8, 9, 2, 5, 7, 6, 3, 2, 8};
        List<Integer> sayilar = new ArrayList<>(Arrays.asList(5, 2, 6, 3, 9, 8, 2, 6, 3, 5, 7, 1));


        // arr'deki elemların toplamını yazdirin
        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        System.out.println("array'deki elementlerin toplami :" + toplam);


        // ForEac ile cözümü

        toplam = 0;

        for (int eac : arr) {

            toplam += eac;

        }
        System.out.println("array'deki elementlerin toplami :" + toplam);


        // sayilar listesindeki cift sayilari yazdirin

        toplam = 0;
        for (Integer eac : sayilar) {

            if (eac % 2 == 0) {
                toplam += eac;
            }

        }
        System.out.println(toplam);


    }
}
