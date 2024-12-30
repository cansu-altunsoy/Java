package c04_arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {

    public static void main(String[] args) {


        int[] sayilar = {3, 5, 6};

        // Sayilar array'ine 4. element olarak (yani 3.index'e ) 8 ekleyin
        // array'i [3, 5, 6, 8] haline getirin

        // sayilar[3] = 8; //   ArrayIndexOutOfBoundsException


        // sayilar = new int[4];   //  [0, 0, 0, 0]  EEGGEERRR  direk deger atamasi olarak new  int[4] dersek tum elemanlar sifir olur


        //(  Sayilar array'ine 4. element olarak (yani 3.index'e ) 8 ekleyin  İİCCİNN  )

        //  1. adim once yeni bir array olusturalim, yeni array'in kapasitesi (length) eskiden 1 fazla olsun

        int[] yeniArr = new int[sayilar.length + 1];

        // 2. adim yeni array 0'lardan olusur, oncelikle eski array'deki elementleri yeni array'e kopyalamaliyiz

        for (int i = 0; i < sayilar.length; i++) {

            yeniArr[i] = sayilar[i];

        }
        // 3. adim sonda kalan tek 0 yerine, eklemek istedigimiz sayiyi atayalim

        yeniArr[yeniArr.length - 1] = 8;

        //  4. adim eklemeyi yeni array'e yaptik, eski array'i deger olarak atayalim

        sayilar = yeniArr;

        System.out.println("sayilar array'nin son hali : " + Arrays.toString(sayilar));


    }
}
