package c19_İnterfaces_exceptions;

public interface I01 {


    String str = "I01 str";
    int sayi = 42;
    boolean izindeMi = true;

   // void method1(){}
    // Interface abstract methods cannot have body

    void method1();

    void method3();

    //void  method4();





    //void method7();

    // void method7();
    // Bir interface'e sonradan bir abstract method eklediginizde o interface'i implent
    // etmis olan TUM CHILD CLASS'lar bundan etkilenir
    // tum child class'larin bu yeni method'u kendisine uyarlamasi gerekir.
    // bu da bitmis bir proje de negatif etkiler olusturabilir





}
