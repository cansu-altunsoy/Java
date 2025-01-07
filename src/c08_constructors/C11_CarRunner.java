package c08_constructors;

public class C11_CarRunner {

    public static void main(String[] args) {


        C10_Car car1 = new C10_Car();

        System.out.println(car1);

        car1.marka = "Toyota";
        car1.model = "Corolla";
        car1.renk = "Beyaz";
        car1.yil = 2020;
        car1.fiyat = 8900;

        System.out.println(car1);


        C10_Car araba2 = new C10_Car("Nissan", "Note", "Beyaz", 2017, 3500);

        System.out.println(araba2);


        C10_Car araba3 = new C10_Car("Cns", "Brk", "Beyaz", 2028, 40000);
        System.out.println(araba3);


        C10_Car araba4 = new C10_Car();

    }
}
