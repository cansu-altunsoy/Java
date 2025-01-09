package c10_passByValue_immutableClasses;

import java.util.Arrays;

public class C07_Mutable_immutableClasses {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.toUpperCase());

        System.out.println(str);


        String[] isimler = {"Cansu", "Burak", "Alp"};

        isimler[1] = isimler[1].toUpperCase();


        System.out.println(Arrays.toString(isimler));


        /*
        Java'da bazi class'lardan olusturulan objeler sonradan DEGISTIRILEMEZ (immutable) Ornek : String

        Ama bazı class'lardan olusturulan objeler sonradan degistirilebilir. Ornek ; arrays ve arrayList

        immutable class'larda  method'larla yapilan degisiklikler KALICI OLMAZ iken mutable Class'larla yapilan degisiklikler
        KALICI OLUR

         */

    }
}
