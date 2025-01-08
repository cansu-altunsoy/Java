package c10_passByValue_immutableClasses;

import java.util.Scanner;

public class C03_DegisikligiKaliciYapma {

    public static void main(String[] args) {

        // verilen bir metin kac kelimeden olusursa olussun her kelimenin ilk harfini buyuk
        // diger harflerini kucuk olarak duzenleyip metnin son halini bize donduren bir method olusturun


        System.out.println(metinDuzenle("cansu okula yuruyerek gidiyor"));

        //Kullanicidan ismini ve soyismini isteyin, girilen isim ve soyismi metinDuzenle() ile duzenleyip
        // isim ve soyisimi bu haliyle kaydedin


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();


        isim = metinDuzenle(isim);
        soyisim = metinDuzenle(soyisim);

        System.out.println("Duzenli hali : " + isim + " " + soyisim);


    }


    public static String metinDuzenle(String metin) {

        String[] kelimeler = metin.split(" ");

        String yeniMetin = "";

        for (int i = 0; i < kelimeler.length - 1; i++) {

            yeniMetin += (kelimeler[i].substring(0, 1).toUpperCase() +
                    kelimeler[i].substring(1).toLowerCase() +
                    " ");

            if (i < kelimeler.length - 1) {
                yeniMetin += " ";
            }

        }

        yeniMetin += (kelimeler[kelimeler.length - 1].substring(0, 1).toUpperCase() +
                kelimeler[kelimeler.length - 1].substring(1).toLowerCase());

        return yeniMetin;
    }
}
