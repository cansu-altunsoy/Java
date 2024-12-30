package c04_arrays;

import java.util.Arrays;

public class C07_ArrayMethodlari_sort {

    public static void main(String[] args) {

        /*
        Bir Array'in elemanlarini siralamak icin Arrays class'indan yardim almak gerekir, Arrays.sort(arr) yazilir


         */


        String[] isimler = {"Metin", "mete", "Mikail", "Nevzat", "Yasar", "Yakup", "Yaman"};

        //array'i natural order'a gore duzenleyin (dogal siralama)

        Arrays.sort(isimler);

        System.out.println(Arrays.toString(isimler));

        /*
        1- Natural order sayilar için kucukten buyuge , metinler için sozluk sıralamasına gore sıralama demektir
         AANNCCAAAKKK  Java'nin case sensitive oldugunu ve kucuk harflerin buyuk harflerden sonra geldigini UNUTMAMALIYIZZZ

         2- string'de method ile yapılan degişiklikler atama olmaz ise KALICI degisiklik olmaz ANCAAKK bu kural tum non-primitive 'ler icin gecerli degildir

         */
    }
}
