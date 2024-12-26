package c02_doWhileLoop_scope;

import java.util.Scanner;

public class C03_KullanicidanAlinanSayilarinToplamı {
    public static void main(String[] args) {


        // Kullaniciya istedigi kadar pozitif sayi girmesini soyleyin
        // girilen sayilar pozitif ise sayiyi toplama ekleyin
        // girilen sayi negatif ise uyari verin ve sayiyi isleme almayin
        //girilen sayi 0 oldugunda islemi bitirin
        // ve kac tane pozitif sayi girildigini
        // ve toplamlarinin kac oldugunu yazdirin


        Scanner scanner = new Scanner(System.in);

        int girilenSayi = 1;
        int toplam = 0;
        int sayac = 0;


        //1. negatif durumu: loop body calisma sayisindan daha fazla kontrol var

        // bizim ilk atama yaptiğimiz degeri while  kontrolüne sokmadan kullanıcıdan deger alıyor böylece ilk ataması yaparjen hata yapmamızı engelliyor


       /*

        while (girilenSayi !=0){

            System.out.println("Lutfen toplamak için sayı giriniz");
            girilenSayi = scanner.nextInt();

            if (girilenSayi !=0){
                toplam += girilenSayi;
                sayac++;
            }
        }
        System.out.println("Girilen "+ sayac + " adet sayisinin toplami: "+toplam);

        */

        // bizim ilk atama yaptiğimiz degeri while  kontrolüne sokmadan kullanıcıdan deger alıyor böylece ilk ataması yaparjen hata yapmamızı engelliyor

        do {
            System.out.println("Lutfen toplamak için sayı giriniz");
            girilenSayi = scanner.nextInt();


            if (girilenSayi != 0) {

                toplam += girilenSayi;
                sayac++;
            }


        } while (girilenSayi > 0);
        System.out.println("Girilen " + sayac + " adet sayisinin toplami: " + toplam);


    }
}
