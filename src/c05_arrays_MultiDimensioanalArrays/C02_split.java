package c05_arrays_MultiDimensioanalArrays;

import c04_arrays.C04_EnUzunEnKisaKelime;

import java.util.Arrays;

public class C02_split {

    public static void main(String[] args) {

        String str = "Java gun gecdikce daha da guzellesiyor";

        //cumledeki en kisa ve en uzun kelimeyi yazdirin

        String[] kelimeler = str.split(" ");

        System.out.println(Arrays.toString(kelimeler)); // [Java, gun, gecdikce, daha, da, guzellesiyor]


        C04_EnUzunEnKisaKelime.enKisaVeEnUzunuYazdir(kelimeler);
        //Array'deki en kisa kelime : da
        //Array'deki en uzun kelime : guzellesiyor
        //Eşit uzunlukta olan elementler goz ardi edilmistir


        //  "Java gun gecdikce daha da guzellesiyor";

        String[] aDanAyir = str.split("a");

        System.out.println(Arrays.toString(aDanAyir)); // [J, v,  gun gecdikce d, h,  d,  guzellesiyor]


        //tum harfleri bir array olarak kaydedin

        String[] harfler = str.split("");
        System.out.println(Arrays.toString(harfler)); // [J, a, v, a,  , g, u, n,  , g, e, c, d, i, k, c, e,  , d, a, h, a,  , d, a,  , g, u, z, e, l, l, e, s, i, y, o, r]


        harfler = str.replace(" ", "").split("");
        System.out.println(Arrays.toString(harfler));


    }
}
