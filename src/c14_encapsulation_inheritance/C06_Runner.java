package c14_encapsulation_inheritance;

public class C06_Runner {

    public static void main(String[] args) {

        /*
        Bir variable public yapmak ile private yapip getter ve setter'i birlikte olusturmak arasinda
        islevsel olarak fark kalkmaz

        yapilan isleme VURGU yapildigindan bazi developer'lar public yapmak yerine bu yontemi tercih ederler
         */

        C05_GetterSetterBirlikteKullanma obj = new C05_GetterSetterBirlikteKullanma();

        System.out.println(obj.sayiPublic);
        obj.sayiPublic = 10;


        System.out.println(obj.getSayiPrivate());
        obj.setSayiPrivate(200);

        System.out.println(obj.getSayiPrivate());
    }
}
