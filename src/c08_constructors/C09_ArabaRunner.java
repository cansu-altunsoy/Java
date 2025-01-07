package c08_constructors;

public class C09_ArabaRunner {

    public static void main(String[] args) {


        //Eger default consructor dısında bir consructor kullaniliyorsa her
        // obje için consructor da yapilan ,işlemler kontrol edilmelidir


        C08_Araba araba = new C08_Araba();

        System.out.println(araba.yil); // 2024
        System.out.println(araba.marka); // Opel


    }
}
