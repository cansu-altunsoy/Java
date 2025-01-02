package c06_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_TumElementleriArttirma {


    public static void main(String[] args) {

        // Verilen integer bir liste dedki tum elementleri istenen bir deger kadar arttirip donduren bir method ıolusturun


        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4, 6, 9, 3, 5, 6));

        // Listede ki tum elementleri 3 arttirin

        for (int i = 0; i < sayilar.size(); i++) {

            int eskiDeger = sayilar.get(i);

            int yeniDeger = eskiDeger + 3;

            sayilar.set(i, eskiDeger);
        }
        System.out.println("Sayilar Listesinin elementlerinin degerinin 3 arttırılmıs hali : " + sayilar);


        System.out.println("===============================");

        // sayilar listesindeki tum elementleri 4 artirin

        ListeninElementleriniArttir(sayilar, 4);
        System.out.println("Listenin son hali :" + sayilar);


        ListeninElementleriniArttir(sayilar, 2);
        System.out.println("Listenin 2 artirilmis hali : " + sayilar);


    }


    // Verilen integer bir liste dedki tum elementlkeri istenen bir deger kadar arttiip donduren bir method ıolusturun

    public static List<Integer> ListeninElementleriniArttir(List<Integer> eskiListe, int artisMiktari) {


        for (int i = 0; i < eskiListe.size(); i++) {

            int eskiDeger = eskiListe.get(i);

            int yeniDeger = eskiDeger + artisMiktari;

            eskiListe.set(i, yeniDeger);
        }
        return eskiListe;
    }

}
