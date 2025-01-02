package c06_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_SonucVsReturn {

    public static void main(String[] args) {


        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4, 6, 9, 3));

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali", "Veli", "Hatice", "Cansu", "Burak"));

        System.out.println(sayilar);

        System.out.println(sayilar.set(2, 5)); // 9
        // asil isi 2. index'deki elementi 5 yapmak
        //asil isini yapti, delil olarak eski elementi getirdi

        System.out.println(sayilar); //[4, 6, 5, 3]


        System.out.println(isimler.remove("Ali"));
        System.out.println(isimler.remove("Pelin Su"));

        System.out.println(isimler);


        System.out.println(isimler.remove(2));
        System.out.println(isimler);

        System.out.println(sayilar.remove(3));//3

        int silinecekSayi = 2;
        System.out.println(sayilar.remove(silinecekSayi)); // 5 sildigi sayi delil olarak getirir


    }
}
