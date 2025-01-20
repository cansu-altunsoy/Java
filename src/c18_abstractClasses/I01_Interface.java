package c18_abstractClasses;

public interface I01_Interface {

    /*
    Interface icin abstract diye tanimlamaya ihtiyac olmaz, Interface zaten full
    abstraction saglayan ozel bir abstract yapidir

    Interface'lerde tum method'lar public ve abstrac'tir
    public ve abstract keyword'lerini yazsak da yazmasak da fark etmez

    Interface'lerde tum variable'lar da public static ve final'dir
    yazsak da yazmasak da fark etmez
     */

    public abstract void method1();

    public void method2();

    void method3();


    public static final int sayi1 = 10;
    public final int sayi2 = 20;
    public static int sayi3 = 30;
    static final int sayi4 = 40;
    int sayi5 = 50;


}
