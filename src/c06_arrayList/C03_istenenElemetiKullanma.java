package c06_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_istenenElemetiKullanma {

    public static void main(String[] args) {

        int[] arr = {3, 5, 6, 8, 1};

        arr[2] = 10;

        System.out.println(arr[4]); // arr de 4. index'deki elemani yazdirin

        // arr'de ki tüm elemanlari topla

        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {

            toplam += arr[i];

        }
        System.out.println("Array'deki elementlerin toplami : " + toplam);

        System.out.println("===================================");

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3, 6, 5, 8, 2, 7));

        //sayilar listesinin 2. index'indeki sayiyi yazdirin
        System.out.println(sayilar.get(2));


        //sayilar listesindeki, tum elementleri toplayın

        toplam = 0;

        for (int i = 0; i < sayilar.size(); i++) {
            toplam += sayilar.get(i);

        }
        System.out.println("listede ki tum elementkerin toplamı :" + toplam);


        System.out.println(sayilar); // [3, 6, 5, 8, 2, 7]


        // 2. index deki elementi 5 yapın

        sayilar.set(2, 5);
        System.out.println(sayilar);// [3, 6, 5, 8, 2, 7]

        // 4. index'deki elementi yazdirin

        System.out.println(sayilar.get(4)); //2


        // sayilar Listesinde 4. index'i 11 yap
        sayilar.set(4, 11);
        System.out.println(sayilar); // [3, 6, 5, 8, 11, 7]


        // sayilar listesindeki 4. index'e 23 ekleyin

        sayilar.add(4, 23);

        System.out.println(sayilar); // [3, 6, 5, 8, 23, 11, 7]


        /*
        add() yeni bir element ekler, element sayisi bir artar ve eklendigi index'den sonraki elementler bir geriye itilir

        set() yeni element eklemez listenin element sayisi ayni kalir, sadece verilen index'deki element update edilmis olur

         */


    }
}
