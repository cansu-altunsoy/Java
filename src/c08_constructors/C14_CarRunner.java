package c08_constructors;

public class C14_CarRunner {


    public static void main(String[] args) {


        C13_Car car1 = new C13_Car("Mercedes", "A200");

        System.out.println(car1.marka);//Mercedes

        System.out.println(car1.model); // A200


        C13_Car car2 = new C13_Car("Audi", "A4", 2020);

        System.out.println(car2.marka);
        System.out.println(car2.model);
        System.out.println(car2.yil);


        C13_Car car3 = new C13_Car("BMW", "2024", "Beyaz", 2022, 30000);

        System.out.println(car3.marka);
        System.out.println(car3.model);
        System.out.println(car3.yil);


    }
}
