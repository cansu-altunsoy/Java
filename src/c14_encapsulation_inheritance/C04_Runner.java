package c14_encapsulation_inheritance;

public class C04_Runner {

    public static void main(String[] args) {

        C03_EncapsuleRapor obj1 = new C03_EncapsuleRapor();

        //System.out.println(obj.satisTutari);
        // private degerleri görüntüleyemeyiz

        //System.out.println(obj1.setSatisTutari(200);); // setSatisTutari() void oldugundan yazdirilamaz, void yazdirilamaz deger dondurur

        obj1.setSatisTutari(100);
        obj1.setSatisTutari(200);
        obj1.setSatisTutari(500);
        obj1.setSatisTutari(500);


        // toplansatistutarina deger atayin
       // obj1.toplamsatisTutari = 500; private oldugu icin deger atamasi yapilamaz

        //obj1.getToplamSatisTutari() = 500; // method bize int bir deger donduruyor, atama yapilamaz
        // variable olmayan bir seye atama yapilamaz


        System.out.println(obj1.getToplamSatisTutari());



    }
}
