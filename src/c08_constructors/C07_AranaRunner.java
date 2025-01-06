package c08_constructors;

public class C07_AranaRunner {

    public static void main(String[] args) {


        // Bir class'da default constructor kullaniliyorsa
        //olusturulan TUM objeler, class'da atanmis olan ilk degerlerine sahip olur


        C06_Araba araba1 = new C06_Araba();

        System.out.println(araba1.marka);//Toyota
        System.out.println(araba1.fiyat);//3000

        System.out.println(araba1.toString());

        System.out.println(araba1);

        araba1.marka = "Opel";
        System.out.println(araba1);


        C06_Araba araba2 = new C06_Araba();

        System.out.println(araba2);


    }
}
