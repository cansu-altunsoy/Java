package c18_abstractClasses;

import c12_dateTime_Varargs.C05_Varargs;
import c15_inheritance.C04_Kuslar;

public class C05_Runner {

    public static void main(String[] args) {

        C04_Kuslar kus = new C04_Kuslar();
        System.out.println(kus.beslenme);



        C05_Varargs obj = new C05_Varargs();



        C01_KuralciOlmayanParent kop1 = new C01_KuralciOlmayanParent();
        kop1.method1();

        System.out.println(kop1.s);

        /*
        Abstract class'lar claass olduklari icin Constructor'a sahiptirler

        ANCCAAKK  abstract class'lar abstract method'lar barindirdigi icin Java abstract
        class'lardan obje olusturulmasina izin vermez

        Cunku bu obje olusturulursa obje ile asagidaki gibi abstract method'lar cagrilabilir
        AAMMAA abstract method'larin body'si olmadigindan calismazlar
         */

        //C03_KuralaciParent kp1 = new C03_KuralaciParent();

            //kp1.method1();


        C03_KuralaciParent kp1 = new C04_ChildOfKuralciParent();

        kp1.method1(); // C04 method1
        kp1.method2(); // C04 method2
        kp1.method5(); // C04 method5




    }
}
