package c18_abstractClasses;

public abstract class C07_Toyota extends C06_Araba{

    /*
    Bir class olusturdugumuzda abstract olup olmayacagini o class'dan
    obje olusturulup-olusturulmayacagina gore karar veririz


    Toyota markasina sahip ama modeli olmayan bir obje olmayacagı icin
    bu class'in abstract olmasi daha dogru olacaktir

    Abstract bir parent'in abstract olan child'i  parent class'daki abstract method'lari
    implement etmek ZORUNDA DEGİLDİR
    AAMMMAA istersek klasik inheritance kurallari cercevesinde parent
    class'daki abstract method'lari override edebilir
     */

   // public abstract void motor();
    //parent class'daki abstract method'u tekrar yazmaya gerek yok
    // ya yeni kurallar koyar veya var olan kurallari concrete yapip kendisine uyalar

    public void motor(){
        System.out.println("Toyota motor kullanir");

    }

    public void guvenlik(){

        System.out.println("Toyota araclar NCPA kullanir");
    }

    public abstract void sesSistemi();
    // Butun Toyota'larda olması gereken ve parent class'da olmayan ozellikleri bu sekilde ekleye biliriz child class'a

    public abstract void direksiyon();

    public void sunroof(){

        System.out.println("Toyota araclara ozel sunroof kullanir");
    }




}
