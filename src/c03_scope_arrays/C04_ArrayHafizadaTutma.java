package c03_scope_arrays;

import java.util.Arrays;

public class C04_ArrayHafizadaTutma {

    public static void main(String[] args) {


        int[] sayilar = {3, 4, 6, 7};

        System.out.println(Arrays.toString(sayilar));


        // 4'un yerine 9 degerini atayin
        sayilar[1] = 9;

        System.out.println(Arrays.toString(sayilar));

        String[] metinler = {"java", "python", "C#"};

        System.out.println(metinler[1]);


    }
}
