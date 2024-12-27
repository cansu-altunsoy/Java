package c03_scope_arrays;

public class C01_Hastane {


    static String hastaneIsmi = "Yildiz Hastanesi";
    static String hastaneAdresi = "Çankaya";
    static String basHekim = "Doktor Burak";


    String perIsmi = " ";
    String perAdresi = " ";
    String perTel = " ";


    public static void main(String[] args) {

        System.out.println(hastaneAdresi);


        C01_Hastane per1 = new C01_Hastane();

        per1.perIsmi = "Burak";
        per1.perAdresi = "Yenimahalle";
        per1.perTel = "4625893";


        System.out.println(per1.hastaneAdresi);
        /*
        static variable class icinden her yerden kullanılabilir

        AAMMAAA eger obje uzerinden kullanmak isterseniz java  itiraz etmez

         */


        C01_Hastane per2 = new C01_Hastane();

        per2.perIsmi = "Oguzhan";
        per2.perAdresi = "Çankaya";

        per2.hastaneAdresi = "Cankaya";

        // per2'nin yaptıgı atamalar per1'i etkiler mi ? EVETTT
        System.out.println(per1.perIsmi); //Burak
        System.out.println(per1.hastaneAdresi); //CANKAYA


        C01_Hastane per3 = new C01_Hastane();

        per3.perIsmi = "Esra";
        per3.hastaneAdresi = " Eryaman";
        per3.basHekim = "Dr Aysu";

        /*
        per3'un yaptıgı atamalardan kisisel olanlalar diger personelleri etkilemez
        Ancak  ortak olanlar (static ) tum personelleri etkiler
         */

        System.out.println(basHekim);
        System.out.println(per1.basHekim);
        System.out.println(per2.basHekim);


    }


}
