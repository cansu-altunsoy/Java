package c12_dateTime_Varargs;

public class C06_VarargsSoru {

    public static void main(String[] args) {


        //  argument olarak girilen sayilardan ilki garic geriye kalanlari toplayip
        // bulunan toplam degeri ile ilk sayisinin carpimi yazdiran bir method olusturun

        islemYap(1, 2,3); // a ilk sayi array'lerde ona göre ayirdi
        islemYap(2, 2,3,5,6);
        islemYap(0, 2,3,5,3,6,9,2,4);


        islemYap(3,4);
        islemYap(5);


        // Varargs'a hic eleman atamasakta bos bir array olur ve CTE olusmaz


        //islemYap();
        // Varargs bos kalabilir ama a'ya deger atamak zorundayız


    }

    public static void islemYap(int a, int... v){

        int toplam = 0;

        for (int eac : v){

            toplam += eac;

        }
        System.out.println("Islem sonu : "+toplam*a); // a ilk sayi

    }

}
