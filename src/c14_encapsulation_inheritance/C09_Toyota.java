package c14_encapsulation_inheritance;

public class C09_Toyota extends C08_Araba{


        // Dunyada toyota olarak adlandilirip, modeli olmayan bir arac yok
        // O zaman bu Toyota Class'i kendisinden obje olusturmak icin degil, alt class'lari
        // bir cati altinda toplamak icin olusturulmustur

      // bu class baslangic itibariyle parent'i olan C08_Araba class'indaki tum ozelliklere sahiptir
      // bu class'da parent class'daki(C08_Araba) variablle'larikullanabiliriz


    // Toyota class isterse parent class'da olan özellikleri kendine gore guncelleye bilir
     protected String marka = "Toyota";
     protected String motor = "Cevreye duyarli motor";


    // 3- Toyota class'i isterse parent class'da olmayan yeni ozellikleri ekleyebilir
   protected String lastik = "Pirelli";
    protected String guvenlik = "DGS101";
    protected String fren = "ABS";

    // bu durumda toyota class'inda olusturulacak obje olsa, Araba class'indan 3 adet ve
    // guncelledigi 2 adet ve yeni ekledigi 3 adet , toplam 8 adet ozellige sahip olur

    protected C09_Toyota(){

    }



}
