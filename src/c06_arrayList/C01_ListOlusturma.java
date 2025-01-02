package c06_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ListOlusturma {

    public static void main(String[] args) {

        int[] arr = {3, 5, 6};
        String[] isimler = new String[5];

        //arr ve isimler'in data turu Array'dir
        // int ve String bu array'lerin icine konulacak elementlerin data turudur


        List<String> metinler1 = new ArrayList<>();
        List<String> metinler2 = new ArrayList<String>();
        ArrayList<String> metinler3 = new ArrayList<>();

        List<Integer> sayilar = new ArrayList<>();
        System.out.println(sayilar); // []

        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(8);
        System.out.println(sayilar);


        sayilar.add(1, 8);
        System.out.println(sayilar); // [5, 8, 7]

        sayilar.add(0, 4);
        System.out.println(sayilar); // [4, 5, 8, 7]


        // eger List olusturulurken konulacak elementler belli ise
        // Arrays class'inda asList() ile direkt eklenebilir

        List<Integer> ekListe = new ArrayList<>(Arrays.asList(20, 30, 40));

        System.out.println(ekListe);

        sayilar.addAll(ekListe);  //  sayilar listesine ekListe listesini ekliyoruz, sayilar listesi degisir
        System.out.println(ekListe);
        System.out.println(sayilar); // [4, 5, 8, 7, 20, 30, 40]


        ekListe.add(50);
        System.out.println(ekListe);

        /*
        String'de method ile yapilan degisiklikler atama olmaz ise kalici degisiklik olmaz

        Array ve ArrayList'lerde method ile yapılan degisiklikler kalici olur

         */


    }
}
