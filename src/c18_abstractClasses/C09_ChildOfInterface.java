package c18_abstractClasses;

public class C09_ChildOfInterface implements I01_Interface {

    /*
    Java'da bir class'i parent edinmek icin extends keyword kullanilir


    Ancakk bir class icin Interface'i parent edinmek istedigimizde extends kullanirsak
    "No interface expected here" uyarisi verir
    Cunku class'dan Interface'i inherit etmek icin extends degil "implements" keyword'u kullanilir

     */


    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    public static void main(String[] args) {


        System.out.println(sayi1);
        System.out.println(sayi2);

        // sayi3 = 30; // final varible'lara sonradan deger atanamaz


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.PI);
        System.out.println(Math.E);

        /*
        Java'da variable isimleri kucuk harfle baslar ve camelCase'e uygun olarak isimlendirilir

        AAAMMMMAAA public static final variable'lar Java'da bu durumlari vurgulamak icin buyuk harflerle
        ve aralarinda _ olacak sekilde ISIMLENDIRILIR
         */

    }


}
