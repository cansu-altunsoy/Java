package c06_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_IstenmeyenElementleriSilme {

    public static void main(String[] args) {

        /*
         Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan kismini list olarak bize donduren bir method olusturun
         */

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali", "Veli", "Deniz", "Burak", "Hatice", "Alp"));


        istenmeyenIsimleriSil(isimler, "l");
        System.out.println(istenmeyenIsimleriSil(isimler, "i"));


        // Listeden e iceren isimleri silin
        for (int i = 0; i < isimler.size(); i++) {

            if (isimler.get(i).contains("e")) {// Listede ki her bir elementi getirir get()
                isimler.remove(isimler.get(i)); // remove element siler
                i--;

            }

        }
        System.out.println(isimler);
    }


    public static List<String> istenmeyenIsimleriSil(List<String> isimler, String istenmeyenHarf) {

        for (int i = 0; i < isimler.size(); i++) {

            if (isimler.get(i).contains(istenmeyenHarf)) {
                isimler.remove(isimler.get(i));
                i--;

            }

        }
        return isimler;

    }
}
