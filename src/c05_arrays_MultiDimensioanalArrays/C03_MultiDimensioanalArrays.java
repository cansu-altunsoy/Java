package c05_arrays_MultiDimensioanalArrays;

import java.util.Arrays;

public class C03_MultiDimensioanalArrays {

    public static void main(String[] args) {

        //Array'lerde herhangi bir yazdırma işlemi yapacagımız zaman ne yazdırdıgımızı iyi bilmeliyiz, eger bir element String veya primitive bir deger yazdıracak ise
        // direk sout yazdıra biliriz

        // EEggerr yazdırmak istediğimiz şey tek katlı bir array ise Array.toString(arr[3])
        // Eger yazdırmaak istediginiz sey muliDiamensioanlArray ise  deepToString kullanilir


        int[][] arr = {{2, 3, 7}, {4, 5, 2, 3,}, {8, 9, 3, 5, 7}, {2, 6, 8, 5}};

        System.out.println(arr.length); // 4
        System.out.println(arr[0].length); //3

        System.out.println(arr[2][0]);
        System.out.println(arr[3][3]);

        System.out.println(arr[1]);

        System.out.println(Arrays.toString(arr[3])); // [2, 6, 8, 5]

        System.out.println(Arrays.toString(arr)); // [[I@3feba861, [I@5f184fc6, [I@5b480cf9, [I@6f496d9f]

        System.out.println(Arrays.deepToString(arr)); //  [[2, 3, 7], [4, 5, 2, 3], [8, 9, 3, 5, 7], [2, 6, 8, 5]]


    }
}
