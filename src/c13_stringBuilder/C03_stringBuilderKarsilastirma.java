package c13_stringBuilder;

public class C03_stringBuilderKarsilastirma {

    public static void main(String[] args) {

        String str1 = "Cansu";
        String str2 = "Cansu";

        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2)); // true

        StringBuilder sb1 = new StringBuilder("Cansu");
        StringBuilder sb2 = new StringBuilder("Cansu");

        // Ayni metne sahip str1, sb1, sb2'yi karsilastiralim
        System.out.println("=======================================");

        System.out.println(sb1 == sb2); // Java run ederken sorun cıkarmaz ama false sonuc verir

        System.out.println(sb1.equals(sb2));

        // equls'ın tek true verecegi hal sudur
        System.out.println(sb1.equals(sb1));


        // String Builder'ların metinse esitligi compare() method'u ile karsılastırılır
        // karsılastırma sonucu 0 ise 2 SB birbirinin aynidir
        // ikisinin compare() edilmesi sonucu 0 degilse bu bize ikisinin esit olmadigini gosterir


        System.out.println(sb1.compareTo(sb2));

        StringBuilder sb3 = new StringBuilder("Cansu");
        StringBuilder sb4 = new StringBuilder("Java");
        StringBuilder sb5 = new StringBuilder("Hayat");
        StringBuilder sb6 = new StringBuilder("Burak");
        StringBuilder sb7 = new StringBuilder("Guzel");


        System.out.println(sb3.compareTo(sb4)); // -7







    }
}
