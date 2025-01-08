package c09_constructorVeStaticKeyword;

public class C04_StaticBlocks {

    /*
     static bloklar class calismaya baslarken herseyden (hatta main method'dan bile) once calisirlar

     static block'larin yeri onemli degildir, en altta da olsa onlar calisir

     birden fazla static block varsa kendi iclerinde once ustteki calisir

     */


    C04_StaticBlocks() {
        System.out.println("Constructor calisti");

    }


    public static void main(String[] args) {

        System.out.println("Main method calisti");

        C04_StaticBlocks obj1 = new C04_StaticBlocks();
    }


    public static void method1() {

        System.out.println("Method calisti");
    }


    static {
        // class calismaya baslamadan once ihtiyac duyulan ayarlamalar icin kullanilir
        System.out.println("static block1 calisti");
    }


    static {

        System.out.println("static blok2 calisti");
    }


    {
        // obje olusturulmadan once yapilacak ayarlamalar icin kullanilir
        // her constructor calismasindan onde (obje olusmadan once) static olmayan block calisir
        System.out.println("static olmayan kod blogu calisti");
    }


}
