package c02_doWhileLoop_scope;

public class C08_Hastane {


    static String hastaneIsmi = "Yildiz Hastanesi";
    static String hastaneAdresi = "Çankaya";
    static String basHeki = "Doktor Burak";


    String perIsmi = " ";
    String perAdresi = " ";
    String perTel = " ";


    public static void main(String[] args) {


        C08_Hastane per1 = new C08_Hastane();

        System.out.println(per1.perIsmi);
        System.out.println(per1.perAdresi);
        System.out.println(per1.perTel);


        per1.perIsmi = "Cansu";
        per1.perTel = "524533";
        per1.perAdresi = "Çankaya";


        System.out.println(per1.perIsmi);// Cansu
        System.out.println(per1.perAdresi);// Çankaya
        System.out.println(per1.perTel);// 524533

        C08_Hastane per2 = new C08_Hastane();

        System.out.println(per2.perIsmi);
        System.out.println(per2.perAdresi);
        System.out.println(per2.perTel);

        per2.perIsmi = "Burak";
        per2.perTel = "452178";
        per2.perAdresi = "Çankaya";


        System.out.println(per2.perIsmi);// Burak
        System.out.println(per2.perAdresi); // Çankaya
        System.out.println(per2.perTel); // 452178

        System.out.println(per1.perAdresi);
        System.out.println(per1.perIsmi);


        C08_Hastane per3 = new C08_Hastane();

        System.out.println(per1.perIsmi); // Cansu
        System.out.println(per2.perIsmi); // Burak
        System.out.println(per3.perIsmi); // hiclik


        //per2'nin adresini Yenimahalle yapin
        per2.perAdresi = "Yenimahalle";

        System.out.println(per1.perAdresi);
        System.out.println(per2.perAdresi);
        System.out.println(per3.perAdresi);


    }


}
