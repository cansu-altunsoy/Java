package c14_encapsulation_inheritance;

public class C03_EncapsuleRapor {

    private int satisTutari = 0;
    // baska class'lardan deger atamasi yapilabilsin    - write yetkisi OK
    // ama atanmis degerleri kimse göremesin            - read yetkisi yasak


    public void setSatisTutari(int satisTutari) {

        this.satisTutari = satisTutari;

        toplamSatisTutari += satisTutari;

    }


    private int toplamSatisTutari = 0;
    // baska clas'lardan deger atamasi yapilamasin     - write yetkisi   yok
    // ama atanmis degeri GOREBILSIN                   - read yetkisi  OK


    public int getToplamSatisTutari() {

        return toplamSatisTutari;

    }
}
