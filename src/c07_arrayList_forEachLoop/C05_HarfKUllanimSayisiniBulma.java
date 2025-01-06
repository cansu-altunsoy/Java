package c07_arrayList_forEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C05_HarfKUllanimSayisiniBulma {

    public static void main(String[] args) {
        /*
        Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz...");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen bir harf giriniz arama için...");

        String aranacakHarf = scanner.nextLine().substring(0, 1);

        String[] karakterlerArr = cumle.split("");

        int sayac = 0;

        System.out.println(Arrays.toString(karakterlerArr));

        for (String eac : karakterlerArr) {
            if (eac.equals(aranacakHarf)) {
                sayac++;
            }
        }

        if (sayac == 0) {
            System.out.println("Aranan harf cumlede kullanilmamistir");
        } else {
            System.out.println("Girilen harf cumlede " + sayac + " kere kullanilmistir");
        }


    }
}
