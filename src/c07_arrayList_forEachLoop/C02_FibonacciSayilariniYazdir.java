package c07_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_FibonacciSayilariniYazdir {

    public static void main(String[] args) {

        /*
        Kullanicidan pozitif bir tamsayi alip, o tamsayidan kucuk Fibonacci sayilarini bir liste olarak bize donduren bir method olusturun.
         */


        System.out.println(fibonacciListesiOLustur(100));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen fibonacci sayilarini yazdirmak icin ust sayi sinirini girin...");
        int maxSayi = scanner.nextInt();


        List<Integer> fibonacciSerisi = new ArrayList<>();

        if (maxSayi < 0) {
            System.out.println("Girilen deger negatif olamaz");
        } else if (maxSayi == 0) {
            fibonacciSerisi.add(0);
        } else if (maxSayi == 1) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            fibonacciSerisi.add(1);
        } else {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            fibonacciSerisi.add(1);


            int sonrakiSayi = 0;
            int sonrakiIndex = 3;

            while (sonrakiSayi <= maxSayi) {

                sonrakiSayi = fibonacciSerisi.get(sonrakiIndex - 2) + fibonacciSerisi.get(sonrakiIndex - 1);

                if (sonrakiSayi <= maxSayi) {
                    fibonacciSerisi.add(sonrakiSayi);
                }
                sonrakiIndex++;

            }

        }
    }


    // ============Method hali olarak soruyu yeniden cozduk==================


    public static List<Integer> fibonacciListesiOLustur(int maxSayi) {


        List<Integer> fibonacciSerisi = new ArrayList<>();

        if (maxSayi < 0) {
            System.out.println("Girilen deger negatif olamaz");
        } else if (maxSayi == 0) {
            fibonacciSerisi.add(0);
        } else if (maxSayi == 1) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            fibonacciSerisi.add(1);
        } else {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            fibonacciSerisi.add(1);


            int sonrakiSayi = 0;
            int sonrakiIndex = 3;

            while (sonrakiSayi <= maxSayi) {

                sonrakiSayi = fibonacciSerisi.get(sonrakiIndex - 2) + fibonacciSerisi.get(sonrakiIndex - 1);

                if (sonrakiSayi <= maxSayi) {
                    fibonacciSerisi.add(sonrakiSayi);
                }
                sonrakiIndex++;

            }

        }

        return fibonacciSerisi;
    }


}
