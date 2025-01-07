package c08_constructors;

public class C10_Car {


    /*
    Eger obje olustururken istedigimiz degerlere sahip olmasini istersek Constructor icinde atama yapabiliriz
     */

    String marka = "atanmadi";
    String model = "atanmadi";
    String renk = "atanmadi";

    int yil = 2012;
    int fiyat = 3000;


    @Override
    public String toString() {
        return "Araba Özellikleri{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }

    C10_Car() {
        // Biz gorunur bir consructor olusturunca java kendi olusturdugu default constructor'i sildi
        //daha once yazdıgımız ve defaault constructor'u kullanan objeler  CTE vermesin diye default constructor yerine olusturduk
    }

    C10_Car(String mrk, String mdl, String rkn, int yl, int fyt) {

        marka = mrk;
        model = mdl;
        renk = rkn;
        yil = yl;
        fiyat = fyt;
    }

    C10_Car(String mrk, String mdl, int yl, int fyt) {

        marka = mrk;
        model = mdl;
        yil = yl;
        fiyat = fyt;
    }

    C10_Car(String mrk, String mdl, String rnk, int fyt) { // singature farkli oldugu surece istedigim kadar constructor olustura bilirim

        marka = mrk;
        model = mdl;
        renk = rnk;
        fiyat = fyt;
    }


}



