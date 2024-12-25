package c01_MethodOverloading;

public class C02_MethodOverLoading {

    public static void main(String[] args) {

        // Bir class'da farkli isimlerde method'lar olmasi da mumkundur
        // sadece bunun overloading olmadigini bilmeliyiz


    }


    public void topla(int a, int b) {
        System.out.println(a + b);
    }


    public void carpim(int a, int b) {
        System.out.println(a * b);
    }
}
