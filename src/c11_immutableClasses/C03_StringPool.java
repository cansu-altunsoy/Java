package c11_immutableClasses;

public class C03_StringPool {

    public static void main(String[] args) {


        String str1 = "Ali";
        String str2 = "Ali";
        String str3 = new String("Ali");
        String str4 = "A" + "li";
        String s = "A";
        String t = "li";
        String str5 = s + t ;
        String r = "ali";
        String str6 = r.substring(0,1).toUpperCase()+ r.substring(1);


        /*
        Java'da temel olarak 2 turlu String olustura biliriz ,

        1- en basit yontem olan " " icinde yazarak veya " " lari  + ile birlestirerek
        2- new keyword veya methodlar kullanilarak

        Java obje olusturmada tassarruf etmek icin

        1.yontemle olusturulan String'leri ayri bir String Pool'da tutar

        EEGGERRR 1.yontemle bir String olusturdugumuzda String pool'da daha once ayni degere  bir String varsa
        Java yeni String'i eski String ile eslestirir ayni referans ve ayni degeri kullanmalarini saglar

         */


        System.out.println(str1.equals(str2)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str3)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str4)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str5)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str6)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals("Ali")); // Ali <==> Ali  ==> true

        /*
        String ifadelerin esitligini kontrol etmek icin  == kullanirsak metni ayni olan
        ifadeler icin her zaman true vermez


        == sadece metne bakmaz, metne ve referansa birlikte bakar yani true olmasi icin hem metinin, hem de referansinin ayni olmasi gerekir
        bu da ancak String pool'da olup metni ayni olan String'ler icin MUMKUNDUR

        equals() ise SADECE metne bakar, metin ayni ise true verir
         */

        System.out.println("================================================");

        System.out.println(str1 ==str2); // Ali  h<==>h  Ali  ==> true
        System.out.println(str1 == str3); // Ali  h<==>-  Ali  ==> false
        System.out.println(str1 == str4); // Ali  h<==>h  Ali  ==> true
        System.out.println(str1 == str5); // Ali  h<==>-  Ali  ==> false
        System.out.println(str1.equals(str6)); // Ali  h<==>-  Ali  ==> true
        System.out.println(str1.equals("Ali")); // Ali  h<==>h  Ali  ==> true




    }
}
