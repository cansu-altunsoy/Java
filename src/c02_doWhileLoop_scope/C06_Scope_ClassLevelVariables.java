package c02_doWhileLoop_scope;

public class C06_Scope_ClassLevelVariables {

    /*
    1- Class level'da olusturulan variable'larin scope'u tum class'dir, yani tum class'tan kullanilabilirler

    2- Class level'da olusturulan variable'lar icin java 2 alternatif sunar
    - static variable: deklarasyonunda static keyword kullanilan variable'lar
    - instance variable: deklarasyonunda static keyword kullanilmayan variable'lar

    3- AANCAAKK class level variable'larin kullanim seklinde
      - eger variable static ise her yerden direkt olarak kullanilabilir
      - veriable instance ise ( static degil), secim hakkı method'a gecer
      *** static methodlar sinirlarindan iceri static olmayan hicbir sey girmesine izin vermezler
      *** method static degilse

      4- Local variable'lar deger atanmadan deklare edilebilir
      AMMAA deger atanmadan kullanilamaz

      Class Level variable'lar DEGER ATANMADAN DA kullanilabilir
      Biz deger atamamissak Java Class level variable'lar icin belirlemis oldugu default degerleri atama yapar

      non-primitive'ler icin ==> null
      sayisal primitive'ler ==> 0
      boolean               ==> false
      char                  ==> hiclik

     */

    public String str = "Java candir";
    static String isim;
    static int sayi1 = 10;
    public int numara;
    public boolean emekliMi = true;
    public static boolean aktifMi;
    public char ilkHarf = 'a';
    static char karakter;


    public static void main(String[] args) {

        System.out.println(isim);
        System.out.println(sayi1);
        System.out.println(aktifMi);
        System.out.println(aktifMi);
        System.out.println(karakter);
        //System.out.println(str);    static method icerisine static olmayan hic bir şeyi kendi icine almaz
        //System.out.println(ilkHarf);

        method1();
        //method2(); static method olmadigi icin cagirilamaz


    }


    static void method1() {

        System.out.println(isim);
        System.out.println(sayi1);
        System.out.println(aktifMi);
        System.out.println(aktifMi);
        System.out.println(karakter);

        // System.out.println(str); // static method icerisine static olmayan hic bir şeyi kendi icine almaz
        //System.out.println(ilkHarf);


    }


    public void method2() {

        System.out.println(str);
        System.out.println(ilkHarf);


    }


}




