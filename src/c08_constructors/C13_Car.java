package c08_constructors;

public class C13_Car {

    String marka = "atanmadi";
    String model = "atanmadi";
    String renk = "atanmadi";

    int yil=2012;
    int fiyat = 3000;


    //parametre olarak marka ve model degerleri ALAN BİR constructor olusturalim

    /*
    Parametre ismlerinin daha anlasilir olmasi icin, instace variable isimleri ile ayni olmasi tercih edilir
     */
    C13_Car (String mrk, String mdl){
        marka = mrk;
        model = mdl;


    }

    C13_Car(String marka, String model,int yil){
        //EEGGEERR  bir scop'da var olan veriabel'i degilde
        // class level'daki variable'i kullanmak isterseniz basina this. yazin

        this.marka = marka;
        this.model = model;
        this.yil = yil;

    }

    public C13_Car(String marka, String model, String renk, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.yil = yil;
        this.fiyat = fiyat;
    }
}
