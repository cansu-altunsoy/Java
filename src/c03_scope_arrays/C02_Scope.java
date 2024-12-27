package c03_scope_arrays;

public class C02_Scope {


    public static void main(String[] args) {


        /*
        static variable'ların EN BUYUK AVANTAJI erisim kolaylıgıdır
        -Class icerisinden her yerden direk ulasilabilir
        -Baska class'lardan da CassIssmi.staticVariableIsmi seklinde kolayca ulasilir

        static variable'larin EN BUYUK DEZAVANTAJI ulasan herkesin DEGISTIREBILMESIDIR
         */

        System.out.println(C01_Hastane.hastaneIsmi);
        System.out.println(C01_Hastane.hastaneAdresi);
        System.out.println(C01_Hastane.basHekim);

        C01_Hastane.hastaneIsmi = "Dr.Burak";

        System.out.println(C01_Hastane.hastaneIsmi); // Dr.Burak


    }


}
