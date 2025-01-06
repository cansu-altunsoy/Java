package c08_constructors;

public class C06_Araba {


    String marka = "Toyota";
    String model = "Corolla";
    String renk = "Kirmizi";

    int yil = 2012;
    int fiyat = 3000;


    @Override
    public String toString() {
        return "Araba Ozellikleri{" +
                "marka:" + marka + '\'' +
                ", model:" + model + '\'' +
                ", renk:" + renk + '\'' +
                ", yil:" + yil +
                ", fiyat:" + fiyat +
                '}';
    }
}
