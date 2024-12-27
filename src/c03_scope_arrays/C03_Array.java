package c03_scope_arrays;

import java.util.Arrays;

public class C03_Array {

    public static void main(String[] args) {


        int[] sayilar = new int[4]; // [0,0,0,0]

        String[] isimler = new String[5];//[null, null, null, null, null]

        boolean[] cevaplar = new boolean[2];


        int[] notlar = {80, 90, 85, 95, 75};

        String[] mevsimler = {"ilkbahar", "Yaz", "Sonbahar", "Kis"};

        boolean[] sonuclar = {true, false, true, false, true};


        //  element atamasini da index ile yapabiliriz

        //  notlar array'indeki 2.sayiyi 45 yapiniz
        notlar[1] = 45;

        //  isimler array'inin ilk ismi olarak Cansu atayin
        isimler[0] = "Cansu";


        // mevsimler array'inin 5. elementini yazdirin
        //  System.out.println(mevsimler[4]); ============================> ArrayIndexOutOfBoundsException


        // Tum arra'i yazdirmak istersek

        // mevsimler array'ini yazdirin
        System.out.println(mevsimler); // [Ljava.lang.String;@5f184fc6

        /*
        Array non-primitive data turudur

        Non-primitive data turlerinin referanslari stack memory'de, kendileri ise heap memory'de tutulur

        Eger bir array'i direck yazdirmak isterseniz Java array'in kendisini degil, referansini yazdirir

        Array'in kendisini yazdirmak isterseniz Arrays class'indan yardim almalisiniz

         */


        System.out.println(Arrays.toString(mevsimler)); //  [ilkbahar, Yaz, Sonbahar, Kis]


        //  isimler array'ini yazdirin

        System.out.println(Arrays.toString(isimler)); // [Cansu, null, null, null, null]


        //sayilar array'ini yazdiralim
        System.out.println(Arrays.toString(notlar));


        // notlar array'indeki 85'i yazdirin
        System.out.println(notlar[2]);


        // mevsimler Kis'i yazdirin
        System.out.println(mevsimler[3]);

        // sayilar array'indeki ilk elementi yazdirin
        System.out.println(sayilar[0]);  //  0

        // isimler array'indeki 2. elementi yazdirin
        System.out.println(isimler[2]); // null


    }
}
