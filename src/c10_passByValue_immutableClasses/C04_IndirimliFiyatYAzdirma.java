package c10_passByValue_immutableClasses;

public class C04_IndirimliFiyatYAzdirma {


    public static void main(String[] args) {

        // 3 farkli method olusturup,
        // verilen fiyat variable'ina %10 , %20, ve %40 indirim yapin, method'larda fiyatin indirimli halini kaydedip
        // "urunun %10 indirimli fiyati : 90" seklinde yazdirin


        double fiyat = 200;

        indirimliFiyatyazdir10(fiyat);
        indirimliFiyatyazdir10(fiyat);
        indirimliFiyatyazdir10(fiyat);

        indirimliFiyatyazdir20(fiyat);
        indirimliFiyatyazdir40(fiyat);

    }

    public static void indirimliFiyatyazdir10(double fiyat) {

        fiyat = 90 * fiyat / 100;

        System.out.println("%10 indirimli hali :" + fiyat);
    }


    public static void indirimliFiyatyazdir20(double fiyat) {

        fiyat = 80 * fiyat / 100;

        System.out.println("%20 indirimli hali :" + fiyat);
    }

    public static void indirimliFiyatyazdir40(double fiyat) {

        fiyat = 60 * fiyat / 100;

        System.out.println("%40 indirimli hali :" + fiyat);
    }


}
