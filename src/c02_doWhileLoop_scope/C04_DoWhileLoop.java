package c02_doWhileLoop_scope;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        // Kullanicidan sayilar alin, sayidan baslayarak 0'a kadar olan tamsayilari yazdirin

        /*
        Do While Loop İçin

        Arti Ozellikleri
        - kontrolden once loop body'si bir kere calisir, boylece ilk atamada hata yapma riskini giderir
        - loop body calisma sayisi ile kontrol sayisi ayni

        Eksi Ozellikleri
        - kontrolden once loop body'si bir kere calisir, eger kullanici istenmeyen bir deger girmisse
        o deger bir defa loop'da calistirilir

         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();

        do {

            System.out.println(girilenSayi + " ");
            girilenSayi--;


        } while (girilenSayi > 0);


    }
}
