package c17_Overriding;

import c15_inheritance.C06_Hayvanlar;
import c15_inheritance.C07_Kuslar;
import c15_inheritance.C08_AvciKuslar;

public class C01_Runner_Overriding {

    public static void main(String[] args) {

        // AvciKuslar class'indan bir obje olusturun

        C08_AvciKuslar kartal1 = new C08_AvciKuslar();

    /*
    Yukardaki 3 obje de AvciKuslar class'inin objeleridir
     AAMAA farkli ozelliklere sahip olurlar

     kartal1 ==> tum avci kuslar ile ayni ozelliklere sahip olur
     kartal2 ==> tum kuslar ile ayni ozelliklere sahip olur ve ozellikler method olarak olusturuldugu icin
                 ozelliklerin daha gunceli varsa o bilgiye sahip olur
     kartal3 ==> tum hayvanlar ile ayni ozelliklere sahip olur ve ozellikler method olarak olusturuldugu icin
                 ozelliklerin daha gunceli varsa o bilgiye sahip olur

     */

        kartal1.beslenme(); // A ucarlar
        kartal1.hareket(); //  k akciger
        kartal1.solunum();
        kartal1.gaga();
        kartal1.kanat();
        kartal1.omur();
        kartal1.pence();


        C07_Kuslar kartal2 = new C08_AvciKuslar();

        kartal2.beslenme(); // A ucarlar
        kartal2.hareket(); //  k akciger
        kartal2.solunum();
        kartal2.gaga();
        kartal2.kanat();
        kartal2.omur();
        //kartal2.pence();

        C06_Hayvanlar kartal3 = new C08_AvciKuslar();

        kartal3.beslenme(); // A ucarlar
        kartal3.hareket(); //  k akciger
        kartal3.solunum();
       //kartal3.gaga();
        //kartal3.kanat();
        kartal3.omur();
        //kartal3.pence();


        // Kuslar class'indan bir obje olusturun
        C07_Kuslar kus1 = new C07_Kuslar();

        kus1.beslenme(); // A ucarlar
        kus1.hareket(); //  k akciger
        kus1.solunum();
        //kus1.gaga();
        //kus1.kanat();
        kus1.omur();
        //kus1.pence();



        C06_Hayvanlar kus2 = new C07_Kuslar();

        kus2.beslenme(); // A ucarlar
        kus2.hareket(); //  k akciger
        kus2.solunum();
        //kus2.gaga();
        //kus2.kanat();
        kus2.omur();
        //kus2.pence();


        // Hayvanlar class'indan bir obje olusturun

        C06_Hayvanlar hayvan1 = new C06_Hayvanlar();

        hayvan1.beslenme(); // A ucarlar
        hayvan1.hareket(); //  k akciger
        hayvan1.solunum();
        //hayvan1.gaga();
        //hayvan1.kanat();
        hayvan1.omur();
        //hayvan1.pence();
        hayvan1.solunum();



    }



}
