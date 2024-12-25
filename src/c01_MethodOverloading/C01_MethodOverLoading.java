package c01_MethodOverloading;

public class C01_MethodOverLoading {

    public static void main(String[] args) {

        /*
          Bir class'da ayni isimle birden fazla method olusturulabilir.

          Bir class'da ismi ayni ama SIGNATUFE'I farkli method'lar olusturulmasina OVERLOADING denir

          Java'da bir method cagrildiginda, eger ayni isimde birden fazla method varsa
           java argumentler'le parametrelerin uyumuna bakar

           Java'da bir class içerisinde ayni isme sahip birden fazla method olusturululabilir
           ANCAAKK bu method'larin SIGNATURE'lari farkli olmalidir

           Method Signature = method adi + parametreleri data turleri

           Eger method call'daki signature'a UYGUN bir method yoksa CTE oluşur,
           Java kodu kirmizi cizer ve kod çalişmaz

         */


        String str = "Java Candir";

        System.out.println(str.substring(3)); // a Candir

        System.out.println(str.substring(3, 7)); // a Ca


        topla(3, 5);

        topla(5, 4.4);

        topla(1, 5, 8);

    }

    public static void topla(int sayi1, int sayi2) {

        System.out.println("İki sayinin toplami : " + (sayi1 + sayi2));
    }


    public static void topla(int sayi1, double sayi2) {

        System.out.println("İki tamsayinin toplami : " + (sayi1 + sayi2));
    }


    public static void topla(int sayi1, int sayi2, int sayi3) {

        System.out.println("Üç sayinin toplami: " + (sayi1 + sayi2 + sayi3));
    }


}



