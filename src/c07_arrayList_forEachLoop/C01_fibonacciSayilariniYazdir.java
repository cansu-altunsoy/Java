package c07_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_fibonacciSayilariniYazdir {

    public static void main(String[] args) {

        /*
        Kullanicidan pozitif bir n tamsayisini alarak, bize ilk n tane Fibonacci sayisini bir list olarak donduren bir method olusturun.

        Kullanici negatif veya 0 girerse ==> hata
        kullanici 1 girerse ==> 0
        kullanici 2 girerse  ==> 0,1
        kullanici 2'den fazla deger girerse  ==> 0,1 ....
         */


        System.out.println(ilkNFibonacciListesi(5));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kac adet fibonacci sayisini yazdirmak istediginizi yazdirin...");
        int n = scanner.nextInt();

        List<Integer> fibonacciSerisi = new ArrayList<>();

        if (n <= 0) {
            System.out.println("Girilen deger pozitif olmali");

        } else if (n == 1) {
            fibonacciSerisi.add(0);

        } else if (n == 2) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
        } else
            fibonacciSerisi.add(0);
        fibonacciSerisi.add(1);

        for (int i = 2; i < n; i++) {
            fibonacciSerisi.add(fibonacciSerisi.get(i - 2) + fibonacciSerisi.get(i - 1));

        }
        System.out.println(fibonacciSerisi);


    }


    public static List<Integer> ilkNFibonacciListesi(int n) {


        List<Integer> fibonacciSerisi = new ArrayList<>();

        if (n <= 0) {
            System.out.println("Girilen deger pozitif olmali");

        } else if (n == 1) {
            fibonacciSerisi.add(0);

        } else if (n == 2) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
        } else {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);


            for (int i = 2; i < n; i++) {
                fibonacciSerisi.add(fibonacciSerisi.get(i - 2) + fibonacciSerisi.get(i - 1));

            }
        }
        return fibonacciSerisi;

    }
}


