package c15_inheritance;

/*
Java bir variable'in degerini bulmak icin

- once bulundugu scope'a bakar
- scope'da yoksa class level'a bakar
- class level'da da yoksa parent class(lar)' a bakar
 ve ilk buldugu degeri (en guncel degeri) kullanir


 */


public class C02_Child extends C01_Parent {

    String str = "Child class";
    String t = "Burak";
    String k = "Ahmet hoca";

    public static void main(String[] args) {

        C02_Child obj = new C02_Child();
        obj.method1();


    }


    public void  method1(){

        String str = "Child class method";
        String t = "Deniz";
        String z = "Mert";


        System.out.println(k);
        System.out.println(this.k);

        System.out.println(z);
        System.out.println(s);

        System.out.println(t);
        System.out.println(this.t);
        //System.out.println(super.t); ==> CTE verir

        System.out.println(str);
        System.out.println(this.str);
        System.out.println(super.str);
    }

}
