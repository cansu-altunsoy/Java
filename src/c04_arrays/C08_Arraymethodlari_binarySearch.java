package c04_arrays;

import java.util.Arrays;

public class C08_Arraymethodlari_binarySearch {

    public static void main(String[] args) {


        String[] harfler = {"d", "d", "h", "y", "k", "a"};


        //verilen bir array'de a harfinin olup olmadığını yazdirin

        C01_ElemenArama.arraydekiArananElemaninSayisiniYazdir(harfler, "d");
        // Aradiginiz harf, array'de 2 kere kullanilmistir


        C01_ElemenArama.arraydekiArananElemaninSayisiniYazdir(harfler, "x"); // Aradıgınız harf kullanılmamıstır


        int[] sayilar = {3, 5, 8, 96, 7, 2};

        // sayilar array'inde 8'in var olup olmadıgını kontrol edin

        // C01_ElemenArama.arraydekiArananElemaninSayisiniYazdir(sayilar, 8);
        // method call icin kullanilan argumentler (sayilar ve 8 )
        // method parametreleriyle uyumlu degil ( String[] ve String arananHarf)


        System.out.println(Arrays.binarySearch(sayilar, 3));
        System.out.println(Arrays.binarySearch(sayilar, 8));
        System.out.println(Arrays.binarySearch(sayilar, 7));

        /*
        Arrays.binarySearch() bir array'de  aranan elementin hangi index'de oldugunu verir

        AANNCCAKKk bu method'dan once sort() calistirilmalidir

         */


        Arrays.sort(sayilar);

        System.out.println(Arrays.binarySearch(sayilar, 3));
        System.out.println(Arrays.binarySearch(sayilar, 8));
        System.out.println(Arrays.binarySearch(sayilar, 7));



        //// Olmayan bir element arandiginda olsaydi bulunacagı SIRAMALYI - olarak verir
        /// index kullanilsaydi -0 diyemeyecegimiz icin index degil SIRALAMAYI VERİR


        System.out.println(Arrays.binarySearch(sayilar, 10)); // -6
        System.out.println(Arrays.binarySearch(sayilar, 1)); // -1
        System.out.println(Arrays.binarySearch(sayilar, 0)); // -1


    }
}
