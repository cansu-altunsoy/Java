package c11_immutableClasses;

public class C02_StringAtamaYapilirsa {

    public static void main(String[] args) {


        String str = "Java";

        str = str.replace("J", "T");

        System.out.println(str);

        str = "hava";
        System.out.println(str);

        // String immutable oldugundan degeri DEGISTIRILEMEZ
        // Ama kod yazan kisi yeni bir atama yaptiginda java atamanin calismasi icin heap memory'de yeni
        // bir obje olusturur, yeni objeyi pointer'a tanitir

        // Boylece kullanici olarak biz String variable'lara yeni degerler atayabiliriz
        //AAMMAA her yeni deger atamasinda kullanilmayan bir String objesi aciga cikar

        // Java'daki Garbage Collector (cop toplayıcı) mekanizmasi belirli araliklar ile
        // calisip, kullanilmayan bu objeleri toplayip yok eder


        String s = " ";

        for (int i = 1; i <= 100; i++) {
            s += i;

        }
        System.out.println(s + " ");
    }
}
