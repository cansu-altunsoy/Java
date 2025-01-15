package c14_encapsulation_inheritance;

public class C05_GetterSetterBirlikteKullanma {


    public int sayiPublic = 10;
    // baska class'lardan deger atama write yetkisi -- write  OK
    // baska class'lardan goruntuleme read yetkisi --  read OK


    private int sayiPrivate =100;
    // baska class'lardan deger atama write yetkisi --  direkt degil ama setter ile write  OK
    // baska class'lardan goruntuleme read yetkisi --  direkt degil ama getter ile read OK



    public int getSayiPrivate() {
        return sayiPrivate;
    }


    public void setSayiPrivate(int sayiPrivate) {
        this.sayiPrivate = sayiPrivate;
    }
}
