package c02_doWhileLoop_scope;

public class C07_Scope_ClassLevelVariables {

    /*

    Class level'da olusturulan variable'larin scope'u tum class'dir
    yanii her yerden kullanilabilir olmaliii

    AMMAAA direkt kullanilabilir olmasi static keyword'e baglidir

    - Static variable'lar her yerde direkt kullanilabilir

    - instance variable'lar static olmayan method'lardan direkt kullanilabilir
    amaaa static method'lardan direkt KULLANILMAZLAR, obje olusturup kullanmamiz gerekir



    AMMAA direk kullanılmasi static keyword'e baglıdır

    - static variable'lar
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
        System.out.println(karakter);

        C07_Scope_ClassLevelVariables obj = new C07_Scope_ClassLevelVariables();

        System.out.println(obj.str);
        System.out.println(obj.emekliMi);
        System.out.println(obj.numara);
        System.out.println(obj.ilkHarf);


    }


}
