package c07_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_ArrayiListeCevirme {

    public static void main(String[] args) {


        Integer[] arr = {3, 5, 6, 9, 2, 8, 4, 6, 3, 7, 59, 2};

        //array'in elementlerini kullanarak bir list olusturun

        List<Integer> sayilar = new ArrayList<>();

        for (int eac : arr) {
            sayilar.add(eac);
        }
        System.out.println("Sayilar listesi" + sayilar);


        // Arrays class'inda bu cevirme islemini yapan hazir bir method var
        //ANCAKK 2 BUYUK dezavantjı oldugu icin GENELDE kullanilmaz

        //1. list'in en buyuk avantjı olan ekleme ve remove yapilamaz
        //2. Java array ve list'de yapilan tum degisiklikleri ortak olarak kabul eder

        List<Integer> arraydenList = Arrays.asList(arr);

        // arraydenList.add(5);
        // arraydenList.remove(3);


        System.out.println("Array'den list" + arraydenList);


    }
}
