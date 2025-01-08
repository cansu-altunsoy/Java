package c10_passByValue_immutableClasses;

public class C01_PassByValue {


    public static void main(String[] args) {

        /*
        Bir variable'ı argument olarak kullanıp baska bir method'a gonderdigimizde java variable'in kendisini degil
        degerini(value'sunu) gönderir
         */

        String cumle = "Java her gun daha da guzelleşiyor";


        uzunlukYazdir(cumle);
        buyukHarfeCevir(cumle);

        System.out.println("main method'da cumlenin son hali " + cumle);


    }

    public static void uzunlukYazdir(String str) {
        // cumle'nin uzunlugunu yazdirin

        System.out.println("Verilen cumlenin uzunlugu : " + str.length());

          /*
        cumle variable'i main method icerisinde olusturuldugu icin local bir variable'dir.
        scope main method'dur, ve main method disinda KULLANILAMAZ

        Eger cumle variable'inin degerini baski bir method'da kullanmak istersek parametre olarak yollayabiliriz
         */

    }


    public static void buyukHarfeCevir(String cumle) {

        cumle = cumle.toUpperCase();
        System.out.println("Method'da cümle " + cumle);


    }


}
