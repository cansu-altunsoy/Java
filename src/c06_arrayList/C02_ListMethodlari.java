package c06_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ListMethodlari {

    public static void main(String[] args) {


        List<Integer> sayilar = new ArrayList<>(Arrays.asList(5, 7, 2, 9, 1, 5, 9, 3));
        System.out.println(sayilar);

        //Lİste de kaç element oldugunu yazdirin

        System.out.println(sayilar.size()); // 8


        // Liste de element olarak 7 'nin olup olmadıgını kontrol et
        System.out.println(sayilar.contains(7)); // true


        // Liste de vars 2'nin ilk index'i
        System.out.println(sayilar.indexOf(2));

        // Liste de vars 2'nin son kullanim index'i
        System.out.println(sayilar.lastIndexOf(2));


        // Liste varsa 11'in ilk index
        System.out.println(sayilar.indexOf(11)); // -1


        System.out.println("=======================================");


        // Liste de 2 icin asgıdaki cumllerden uygun olanı yazdırın
        //listede 2 yok
        // listede sadece 1 tane var
        // listede 2 bir de fazla var

        if (sayilar.indexOf(2) == -1) {
            System.out.println("Liste de 2 yok");
        } else if (sayilar.indexOf(2) == sayilar.lastIndexOf(2)) {
            System.out.println("Listede 2 sadece 1 tane vardir");

        } else
            System.out.println("Listede 2 birden fazla vardir");


        sayilar.clear();
        System.out.println(sayilar);


    }
}
