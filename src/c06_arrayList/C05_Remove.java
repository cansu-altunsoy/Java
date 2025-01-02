package c06_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_Remove {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4, 6, 9, 3));

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali", "Veli", "Hatice", "Cansu"));

        System.out.println(isimler); //

        // Listeden Ali'yi sil

        isimler.remove("Ali");
        System.out.println(isimler);

        isimler.remove(2);
        System.out.println(isimler);

        /*
        Eger List sayilardan olusursa , Java girilen degeri direkt index olarak alir
        Eger sayi olan 4'u silmek istersek bunu once object olarak olusturmalisiniz

         */
        sayilar.remove(4);
        System.out.println(sayilar);


        // sayilar listesinden 9'u silin

        Integer silinecekSayi = 9; // object olarak cozmek icin

        sayilar.remove(silinecekSayi);
        System.out.println(sayilar);


    }
}
