package c06_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C07_ArraydenTekrarEdenSayilariSilme {

    public static void main(String[] args) {

        // Verilen bir array'de tekrar eden sayi var ise tekrar eden sayilari silip,
        // array'i her sayidan sadece bir tane bulunacak sekilde kaydedin


        int[] arr = {2, 3, 4, 5, 2, 4, 2, 2, 4, 2, 4, 3, 5, 1};


        List<Integer> tekrarsizList = new ArrayList<>();

        // arr'deki tüm elemanları gozden gecirip
        //tekrarsiz list'de yoksa ekleyelim

        for (int i = 0; i < arr.length; i++) {

            if (!tekrarsizList.contains(arr[i])) {
                tekrarsizList.add(arr[i]);
            }

        }

        Collections.sort(tekrarsizList); // Listeyi sırali hale geitirir

        System.out.println("Tekrarsiz Liste :" + tekrarsizList); // [2, 3, 4, 5, 1]

        //arr'deki tekrar etmeyen sayilari bulduk
        //ama henuz gorev bitmedi
        // arr ile ilgili bir islem yapmadik tekrarsız elementler List'e kaydedildi

        Collections.sort(tekrarsizList); // Listeyi sırali hale geitirir

        arr = new int[tekrarsizList.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = tekrarsizList.get(i);

        }
        Arrays.sort(arr); // array'li sırali hale getirir

        System.out.println("arr'nin son hali :" + Arrays.toString(arr));


    }
}
