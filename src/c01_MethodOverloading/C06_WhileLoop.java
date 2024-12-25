package c01_MethodOverloading;

import java.util.Scanner;

public class C06_WhileLoop {

    public static void main(String[] args) {

        //  Asagidaki görevi yapan bir method olusturun


        // Kullanicidan istedigi kadar isim girmesini isteyin
        // kullanici islemi bitirmek icin Q'ya basmalidir
        //girilen her ismin uzunlugunu kontrol edin ve
        // islem bitirildiginde en cok harfe sahip olan (en uzun ) ismi yazdirin


        enUzunKelimeYazdir();

        System.out.println(enUzunKElimeDondur());


    }


    public static void enUzunKelimeYazdir() {


        Scanner scanner = new Scanner(System.in);

        String enUzunKelime = "";
        String girilenKelime = "";

        while (!girilenKelime.equalsIgnoreCase("q")) {

            System.out.println("Lutfen bir kelime giriniz...\n Bitirmek icin Q'ya basiniz...");
            girilenKelime = scanner.nextLine();

            if (girilenKelime.length() > enUzunKelime.length()) {

                enUzunKelime = girilenKelime;
            }

        }
        System.out.println(enUzunKelime);


    }


    public static String enUzunKElimeDondur() {

        Scanner scanner = new Scanner(System.in);

        String enUzunKelime = "";
        String girilenKelime = "";

        while (!girilenKelime.equalsIgnoreCase("q")) {

            System.out.println("Lutfen bir kelime giriniz...\n Bitirmek icin Q'ya basiniz...");
            girilenKelime = scanner.nextLine();

            if (girilenKelime.length() > enUzunKelime.length()) {

                enUzunKelime = girilenKelime;
            }

        }
        return enUzunKelime;

    }


}
