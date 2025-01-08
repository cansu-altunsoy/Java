package c09_constructorVeStaticKeyword;

public class C03_HastaneRunner {

    public static void main(String[] args) {

        C02_Hastane hem1 = new C02_Hastane();

        System.out.println(hem1.perAdres);
        hem1.perIsim = "Burak";
        hem1.perAdres = "Balgat";
        hem1.hastaneAdresi = "Balgat";


        C02_Hastane hem2 = new C02_Hastane();

        System.out.println(hem2.perAdres);
        System.out.println(hem2.hastaneAdresi);
        hem2.perIsim = "Cansu";
        hem2.perAdres = "Yenimahalle";
        hem2.hastaneAdresi = "Yenimahalle";


        C02_Hastane hem3 = new C02_Hastane();
        System.out.println(hem3.perAdres);
        System.out.println(hem3.hastaneAdresi);
        System.out.println(hem2.hastaneAdresi);
        System.out.println(hem1.hastaneAdresi);
        System.out.println(C02_Hastane.hastaneAdresi);


    }



}
