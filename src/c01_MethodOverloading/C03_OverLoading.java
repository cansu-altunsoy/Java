package c01_MethodOverloading;

public class C03_OverLoading {

    public static void main(String[] args) {

        // Java method call'daki bir signature'a %100 uyumlu bir method bulamazsa
        // auto-widening kullanarak calistira bilecegi method var mi diye kontrol eder.
        // varsa calistirir.


        topla(4, 5); // double buyuk integer
        topla(3.4f, 8);

    }


    public static void topla(double a, double b) {
        System.out.println("İki sayinin toplami :" + (a + b));
    }


}
