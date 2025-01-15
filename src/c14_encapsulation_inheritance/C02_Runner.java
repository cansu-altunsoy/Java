package c14_encapsulation_inheritance;

public class C02_Runner {
    public static void main(String[] args) {


        /*
        Access Modifier kullanarak bir variable'a ulaşabiliyorsak, o variable'i hem kullanabilir
         hem de o variable'a deger atamasi yapabiliriz
         */

        // static variable'larin ulasmak icin obje olusturmaya gerek olmaz.
        // Static variable'larin diger adi class variable'larin diger adi
        //Static variable'larin diger adi class variable'lardir, class ismi ile birlikte kullanilabilirler


        // System.out.println(C01.strPris);,
        // Private ne yaparsianiz yapin class disindan kullanilamaz


        System.out.println(C01.strDefS);
        System.out.println(C01.strProS);
        System.out.println(C01.strPubS);


        C01.strDefS = "Yeni class def";
        C01.strProS = "Yeni class protected";
        C01.strPubS = "Yeni public";


        // Static olmayan variable'lara ulasabilmek icin
        // C01 class'indan obje olusturmaliyiz

        C01 obj = new C01();

        // System.out.println(obj.strPri); private oldugu icin ulasamıyoruz
        System.out.println(obj.strDefS);
        System.out.println(obj.strProS);
        System.out.println(obj.strPubS);

        obj.strDefS = "Yeni class def";
        obj.strProS = "Yeni class protected";
        obj.strPubS = "Yeni public";


    }
}
