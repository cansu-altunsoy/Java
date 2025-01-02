package c06_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C10_TamBolenSayilarListesi {
    public static void main(String[] args) {

        // 30 sayisini tam bolebilen pozitif tamsayilari
        // bir liste olarak yazdirin


        System.out.println(tamBolenlerListesi(45)); // method ile cozumu


        // tamBolenlerListesi method'unu kullanarak 2 basamaklı sayilari yazdirin

        for (int i = 10; i <= 99; i++) {

            int bolenSayisi = tamBolenlerListesi(i).size();

            if (bolenSayisi == 2) {
                System.out.println(i + " ");
            }

        }


        List<Integer> tamBolenlerListesi = new ArrayList<>();

        for (int i = 1; i < 30; i++) {

            if (30 % i == 0) {

                tamBolenlerListesi.add(i);
            }

        }
        System.out.println(tamBolenlerListesi);


    }

      /*
        Verilen pozitif bir tamsayiyi, tam bolebilen tum pozitif tamsayilari bir liste olarak bize donduren bir method olusturun.

       */

    public static List<Integer> tamBolenlerListesi(int sayi) {

        List<Integer> tamBolenlerListesi = new ArrayList<>();
        for (int i = 1; i < sayi; i++) {

            if (sayi % i == 0) {
                tamBolenlerListesi.add(i);


            }

        }
        return tamBolenlerListesi;


    }

}
