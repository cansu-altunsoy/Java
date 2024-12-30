package c04_arrays;

import java.util.Arrays;

public class C06_ArrayElemanEklemeMEthodu {

    public static void main(String[] args) {

        // verilen String bir array'in sonuna , verilen yeni bir metni eleman olarak ekleyip
        // array'in yeni halini bize donduren bir method olusturun


        String[] isimler = {"Cansu", "Burak"};
        isimler = arrayElementEkle(isimler, "Deniz");

        System.out.println("Element eklenmis hali : " + Arrays.toString(isimler));

        isimler = arrayElementEkle(isimler, "Ada");

        System.out.println("YEni element eklenmis hali : " + Arrays.toString(isimler));
    }


    public static String[] arrayElementEkle(String[] eskiArray, String eklenecekElement) {

        // 1. adim yeni array olustur
        String[] yeniArr = new String[eskiArray.length + 1];

        // 2. adim eski array'deki elementleri yeni array'e kopyala


        for (int i = 0; i < eskiArray.length; i++) {

            yeniArr[i] = eskiArray[i];

        }
        // 3. adim olarak sonda kalan elemana yeni element degerini atayalim

        yeniArr[yeniArr.length - 1] = eklenecekElement;

        eskiArray = yeniArr;

        return eskiArray;

    }


}
