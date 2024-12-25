package c01_MethodOverloading;

import java.util.Scanner;

public class C07_SayiToplami {

    public static void main(String[] args) {


        // Kullanicidan toplanmak üzere pozitif tamsayilar isteyin
        // Kullancinin girdigi pozitif sayilarin toplami 500 veya daha fazla olduğunda toplam
        // kac adet pozitif tam sayi girdigini ve bunlarin toplaminin kac oldugunu yazdirin
        // kullanici 0 veya negatif sayi girerse "sayi pozitif olmalidir " yazdirin
        // ve girilen uygun olmayan sayiyi sayi adedine ve toplama eklemeyin


        Scanner scanner = new Scanner(System.in);

        int sayi = 0;
        int toplam = 0;
        int sayac = 0;


        while (toplam < 500) {

            System.out.println("Lutfen toplama islemi icin pozitif tamsayi giriniz...");
            sayi = scanner.nextInt();

            if (sayi > 0) {

                toplam += sayi;
                sayac++;

            } else { // sayi 0 veya negatif
                System.out.println("sayi pozitif olmalidir ");
            }

        }
        System.out.println(sayac + "adet sayi girdiniz, sayilarin toplami : " + toplam);


    }
}
