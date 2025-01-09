package c11_immutableClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_mutable_immutableClasses {

    public static void main(String[] args) {


        String str = "Java candir";

        str.toUpperCase();
        str.substring(5);

        System.out.println(str);

        // immutable Class'larda method'larla yapılan değişiklikler KALICI OLMAZ
        // Stringler ve wrapper class'lar immutable'dir


        List<String> isimler = new ArrayList<>(Arrays.asList("Cansu", "Asuman", "Burak"));

        System.out.println(isimler);


        isimler.set(0,isimler.get(0).toUpperCase());

        isimler.add("İpek");
        isimler.remove(1);

        System.out.println(isimler);

        // mutable Class'larda method'larla yapılan değişiklikler KALICI OLUR
        // array ve arrayList mutable'dir


    }
}
