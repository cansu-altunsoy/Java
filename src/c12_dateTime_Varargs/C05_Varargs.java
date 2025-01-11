package c12_dateTime_Varargs;

public class C05_Varargs {

    public static void main(String[] args) {

        topla(5,3);
        topla(4, 5,2);
        topla(1,2,6);
        topla(1,2,6,3);
        topla(1,2,6,7,1);
        topla();

         // int... c = {1,2,3}; kabul etmez varargs
        // varargs parametre olarak kullanilmak icin tasarlanmistir,
        // method'larin icinde zaten array kullanabiliyoruz

    }


    public static void topla(int... a){  // int ... icine istedigimiz kadar int koyabilecegimiz bir varags'i ifade eder
        // var args  ==> variety of arguments (argumet sayilarinin farkli olabilmesidir)


        // a tum elementleri icine alan bir array olduguna gore tum elementleri toplamak icin loop kullanilabilir
        int toplam = 0;

        for (int each : a){
            toplam +=each;
        }

        System.out.println("tum sayilarin toplami : " + toplam);

    }



    public  static  void  topla(int a, int  b){
        System.out.println(a+b);

    }

    public static void topla(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
