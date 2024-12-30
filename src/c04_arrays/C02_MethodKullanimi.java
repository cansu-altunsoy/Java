package c04_arrays;

import c03_scope_arrays.C07_TumElemnetleriArttirma;

import java.util.Arrays;

public class C02_MethodKullanimi {
    public static void main(String[] args) {


        //Verilen harf bir array'de istenen bir elemanin var olup olmadıdığını ve varsa kac kere kullanildigini yazdirin


        // verilen array de a harfinin olup olmadığını varsa kaç kere oldugunu yazdirin


        String[] harfler = {"a", "d", "f", "e", "a", "e", "d", "a", "a", "e", "a"};


        C01_ElemenArama.arraydekiArananElemaninSayisiniYazdir(harfler, "a");
        // Aradiginiz harf, array'de 5 kere kullanilmistir


        C01_ElemenArama.arraydekiArananElemaninSayisiniYazdir(harfler, "f");// Aradiginiz harf, array'de 1 ker kullanilmistir


        // Kullanicidan degerler alarak bir array olusturup, kaydedin

        int[] kullaniciArr = C03_KullaniciyaArrayOlusturtma.arrayOlustur();

        System.out.println(Arrays.toString(kullaniciArr));


        //Kullanicidan alarak olusturdugunuz int array'in elemanlarını +5 eklayip yazdırın
        kullaniciArr = C07_TumElemnetleriArttirma.arrayinElementleriniArtir(kullaniciArr, 5);

        System.out.println("Elemanları 5 arttirilmis array : " + Arrays.toString(kullaniciArr));


        //kullanicidan degerler alarak bir String array oluşturun


        String[] isimler = C03_KullaniciyaArrayOlusturtma.StringArrayOlustur();
        System.out.println(Arrays.toString(isimler));

        // bu String array'deki en kisa ve en uzun metinleri yazdirin

        C04_EnUzunEnKisaKelime.enKisaVeEnUzunuYazdir(isimler);


    }
}
