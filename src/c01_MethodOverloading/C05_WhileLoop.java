package c01_MethodOverloading;

import java.util.Scanner;

public class C05_WhileLoop {

    public static void main(String[] args) {

        // Kullaniciya istedigi kadar pozitif sayi girmesini soyleyin
        // girilen sayilar pozitif ise sayiyi toplama ekleyin
        // girilen sayi negatif ise uyari verin ve sayiyi isleme almayin
        //girilen sayi 0 oldugunda islemi bitirin
        // ve kac tane pozitif sayi girildigini
        // ve toplamlarinin kac oldugunu yazdirin


        Scanner scanner = new Scanner(System.in);


        int sayi = 1;
        int toplam = 0;
        int sayac = 0;

        while (sayi != 0) {

            System.out.println("Lutfen pozitif sayilarin giriniz, bitirmek icin 0'a basiniz");
            sayi = scanner.nextInt();


            if (sayi > 0) {
                toplam += sayi;
                sayac++;

            } else if (sayi < 0) {
                System.out.println("Negatif sayilar toplama eklenmez");

            }

        }

        System.out.println("Toplam " + sayac + " adet girdiginiz sayinin toplami :" + toplam);


    }
}
