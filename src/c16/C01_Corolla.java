package c16;

import c14_encapsulation_inheritance.C09_Toyota;

public class C01_Corolla extends C09_Toyota {

    /*
    1- Baslangıc itibariyla parent'i olan Toyota ve grand parent'i olan araba class'larindaki tum ozelliklere sahiptir.

    2- Corolla class'i parent ve grand parent class'larindaki istedigi variable'lari kendisine uyarlayabilir

    3- Corolla class'i butun corolla araclarda olan ama parent class'i Toyota veya grand parent'i olan Araba class'larinda
    olmayan YENİ variable'lar ekleyebilir

     */
   String model = "Corolla";
   String kasa ="Corolla kasasi";
   String motor = "vvdi";
   String lastik = "15 inch pirelli";

   String uretimYeri = "Turkiye";
   String aku = "inci aku";
   String renk = "secilmedi";
   String yakitTuru ="yakit turu secilmedi";


    C01_Corolla(){

        System.out.println(marka);
        System.out.println(motor);
        System.out.println(kasa);

    }


    public static void main(String[] args) {

        C01_Corolla corolla1 = new C01_Corolla();

        System.out.println(corolla1.marka);
        System.out.println(corolla1.sanzuman);
        System.out.println(corolla1.model);
        System.out.println(corolla1.kasa);
        System.out.println(corolla1.motor);
        System.out.println(corolla1.lastik);
        System.out.println(corolla1.aku);
        System.out.println(corolla1.fren);


        corolla1.sanzuman = "Otomatik";
        corolla1.kasa = "Corolla sedan";
        corolla1.renk = "Kirmizi";
        corolla1.yakitTuru ="Hybrit";



    }



}
