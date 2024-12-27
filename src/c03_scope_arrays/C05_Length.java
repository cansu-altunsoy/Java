package c03_scope_arrays;

public class C05_Length {
    public static void main(String[] args) {


        String str = "Java candir";

        int[] arr = {3, 5, 7, 9, 1, 2};

        System.out.println(str.length());// 11 String karakter sayısı
        System.out.println(arr.length); // 6 array'deki element sayisi


        // String'in son karakterini yazdırın

        System.out.println(str.charAt(str.length() - 1));


        //arr'nin son elementini yazdırın'

        System.out.println(arr[arr.length - 1]);

        //String'in sondan 3. elementini yazdırın

        System.out.println(str.charAt(str.length() - 3));

        //arr'nin sondan 3. elementini yazdır
        System.out.println(arr[arr.length - 3]);


    }
}
