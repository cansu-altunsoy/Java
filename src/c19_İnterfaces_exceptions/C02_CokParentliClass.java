package c19_İnterfaces_exceptions;

public class C02_CokParentliClass extends  C01_Interfaces implements I01,I02{


    @Override
    public void method3() {

    }

    @Override
    public int method4() {
        return 1;

    }


    public static void main(String[] args) {

        C02_CokParentliClass obj = new C02_CokParentliClass();

        System.out.println(I01.str);
        System.out.println(I02.str);
        System.out.println(C01_Interfaces.str); // obj ile ulasmaya calisirsa ınterface ve normal class'da ayni degerler oldugu icin
                                               // karisir ve hangi degeri kullanilacagini bilmez Java o yuzden class adi ile ulasiyoruz
                                               // static referans ile ulasiyoruz

        C01_Interfaces.str = "Veli";

        /*
        Interface'de tum variable'lar public static ve final olur

        Hangi variable'i kullanmak istersek static referans ile ulasabiliriz


        Dikkat edecegimiz 2. Konu;
        Interface'de tum variable'lar final oldugundan yeni deger atamasi YAPILMAZ...

         */


        // Method'lari kullanalim

        obj.method1();
        obj.method2();
        obj.method3();
        System.out.println(obj.method4());

        /*

        birden fazla parent'da  ayni isimde abstract method olabilir

        Abstract method'lar bize emir veren cumleler oldugundan ayni isimde birden fazla
        abstract method olmasi sorun olusturmaz, biz o isimdeki method'u kendi class'imiza implement
        ettigimizde herkes mutlu olur


        AAANCCAAKK ayni isimdeki abstract method'larin return type'lari ayni olmalidir
        aksi durumda, imlement ettigimiz method'un return type'i olarak hangisini secsek oteki itiraz eder
        ve projemiz CALISTIRILAMAZ

        EGER 2 interface'i implement etmek istedigimizde bu interface'lerde ismi ayni
        ama return type'i farkli olan bir method varsa
        birinden vazgecmek ZORUNDASINIZ

         */



















    }
}
