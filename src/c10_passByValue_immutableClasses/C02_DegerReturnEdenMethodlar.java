package c10_passByValue_immutableClasses;

import java.util.Scanner;

public class C02_DegerReturnEdenMethodlar {

    public static void main(String[] args) {

        // Verilen isim ve soyisimleri düzenleyip ilk harfle buyuk diğer harfler kucuk olacak sekilde isim soyisim halinde
        // bize donduren method olusturun


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();


        //=============================================================================

        System.out.println(isimDuzenle(isim, soyisim));


    }

    public static String isimDuzenle(String isim, String soyisim) {

        isim = isim.substring(0, 1).toUpperCase() +
                isim.substring(1).toLowerCase();

        soyisim = soyisim.substring(0, 1).toUpperCase() +
                soyisim.substring(1).toLowerCase();


        String duzenlenmisIsim = isim + " " + soyisim;

        return duzenlenmisIsim;

    }

}
