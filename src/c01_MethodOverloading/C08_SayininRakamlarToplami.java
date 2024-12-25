package c01_MethodOverloading;

import java.util.Scanner;

public class C08_SayininRakamlarToplami {

    public static void main(String[] args) {


        // While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz...");

        int sayi = scanner.nextInt();

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int temp = sayi;


        while (temp != 0) {

            birlerBasamagi = temp % 10;
            rakamlarToplami += birlerBasamagi;
            temp /= 10;

        }

        System.out.println("Girdiginiz " + sayi + " sayisinin rakamlar toplami :" + rakamlarToplami);

    }
}
