package c13_stringBuilder;

public class C06_Karsilastirma {

    public static void main(String[] args) {

        String str = "Cansu";
        StringBuilder sb1 = new StringBuilder("Cansu");
        StringBuilder sb2 = new StringBuilder("Cansu");

        // ayni metne sahip olan str, sb1 ve sb2'yi karsilastiralim


        //System.out.println(str == sb1);

        //     ==
        System.out.println(sb1 == sb2); // Java bu karsilastirmaya itiraz etmez ama sonuc her zaman false'dur ==> false

        //  equals()
        System.out.println(str.equals(sb1));
        System.out.println(sb2.equals(str));
        // Java bu karsilastirmaya itiraz etmez ama sonuc her zaman false'dur ==> false

        System.out.println(sb1.equals(sb2)); // false
        // İkiside StringBuilde ve ikisinin de metin ayni olmasina ragmen false degeri verir


        // equals() SADECE bir durumda true verir
        System.out.println(sb1.equals(sb1));


        // StringBuilder'larin metinsel esitligi compare() kontrol edilir
        // compareTo() ile 2 StringBuilder karsilastirildiginda sonuc 0 ise
        // bu iki StringBuilder metinsel olarak AYNI demektir
        // sonuc sıfır degilse metinler ayni degil

        StringBuilder sb3 = new StringBuilder("Java");
        StringBuilder sb4 = new StringBuilder("Tava");
        StringBuilder sb5 = new StringBuilder("java");
        StringBuilder sb6 = new StringBuilder("Tele");
        StringBuilder sb7 = new StringBuilder("Tema");

        System.out.println(sb3.compareTo(sb4)); // -10

        System.out.println(sb3.compareTo(sb5)); // -32
        // farkli olan ilk karakter l == m ve l bir karakter geride

        System.out.println(sb4.compareTo(sb6)); // -4
        // farkli olan ilk karakter a  == e ve a bir karakter geride -4

        System.out.println(sb6.compareTo(sb7)); // -1 Tele <==> Tema
        // farkli olan ilk karakter l == m ve l bir karakter geride -1

        System.out.println(sb1.compareTo(sb2));  // 0 yani bu iki metin ayni demek


    }
}
