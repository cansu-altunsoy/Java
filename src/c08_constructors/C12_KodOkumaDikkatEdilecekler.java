package c08_constructors;

public class C12_KodOkumaDikkatEdilecekler {

    /*
    Kod okuma sorularinda bizi sasirtmak icin, bekledigimiz atamalar yerine, farkli ve ilgisiz atamalar yapilabilir



    Kod okuma sorularinda biz misafiriz oldugumuz icin ; kod'da ne islem yapildi ise o islemi,
    takip eder, sonucu kabul ederiz

    CTE vermedigi surece kod icin yanlis yazilmis diyemeyiz

     */

    int sayi = 23;
    String isim = "Ali";
    char chr = 'æ';


    C12_KodOkumaDikkatEdilecekler(int sy, String ism) { // 1

        sayi = 34;
        isim = ism.toUpperCase();
    }


    C12_KodOkumaDikkatEdilecekler() { // 2
        chr = '%';
        isim = "Esra";
    }


    C12_KodOkumaDikkatEdilecekler(int sy, String ism, char a) { // 3
        isim = ism;
        sayi = sy;

    }


    public static void main(String[] args) {


        C12_KodOkumaDikkatEdilecekler obj3 = new C12_KodOkumaDikkatEdilecekler(22, "Burak", 'a');
        // 3 numarali consructor calisir
        System.out.println(obj3.isim);
        System.out.println(obj3.sayi);
        System.out.println(obj3.chr);


        C12_KodOkumaDikkatEdilecekler obj2 = new C12_KodOkumaDikkatEdilecekler(5, "Cansu");
        // 1 numarali constructor calisir
        System.out.println(obj2.isim);
        System.out.println(obj2.sayi);
        System.out.println(obj2.chr);

        C12_KodOkumaDikkatEdilecekler obj1 = new C12_KodOkumaDikkatEdilecekler();
        // 2 numarali constructor calisir

        System.out.println(obj1.isim);
        System.out.println(obj1.sayi);
        System.out.println(obj1.chr);
    }


}
