package c02_doWhileLoop_scope;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        //Kullanicidan bir sayi alin, sayidan baslayarak 0'a kadar (0 haric) olan sayilari yazdirin
        //5 : ==> 5 4 3 2 1


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");

        int girilenSayi = scanner.nextInt();


        while (girilenSayi > 0) {
            System.out.println(girilenSayi + " ");
            girilenSayi--;

        }


        // ===================================================================================


        do {
            System.out.println(girilenSayi + " ");
            girilenSayi--;


        } while (girilenSayi > 0);

    }
}
