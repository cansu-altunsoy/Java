package c12_dateTime_Varargs;

public class C07_DikkatEdilecekler {

    public static void main(String[] args) {

        /*
          argument olarak girilen sayilardan ilki haric geriye kalanlari topplayip
         bulunan toplam degferi ile ilk sayisinin carpimi yazdirin, bir method olusturun

          argument olarak girilen sayilardan
          sonuncusu haric geriye kalanlari toplayip
          bulunan toplam deger ile son sayinin carpimini yazdiran
          bir method olusturun

         */

        islemYap(1, 2, 5, 3, 6, 5);
        islemYap(5, 6, 3);
        islemYap(8, 6, 7);

    }

    // public static void islemYap(int...v , String sayi){
    // vararg parameter must be the last in the list
    // vararg bir parametre varsa, SON PARAMETRE olmak ZORUNDADIR
    // vararg element almada sinir tanimaz, tum elementleri almak ister

    //}

    public static void islemYap(int... v) {

        // vararg array altyapisini kullandigi icin, son elementi vararg icine ayirabiliriz

        // vararg'da son element haric, bastaki elemetleri toplayin

        int toplam = 0;

        for (int i = 0; i < v.length - 1; i++) {
            toplam += v[i];

        }
        System.out.println(toplam + v[v.length - 1]);

    }


}
