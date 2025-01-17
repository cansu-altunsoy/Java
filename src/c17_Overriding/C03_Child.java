package c17_Overriding;

public class C03_Child extends C02_Parent{



    public void method1(){

        // Overriding olmasi icin signature ayni olmalidir
        // signature farkli ise o method'lar farkli method'lar olacaktir

    }

    @Override
    public void method2() {

       // Java'daki notasyonlar kendine ozgu bilgiler tasiyan yapilardir
        //@Override notasyonu parent class'daki overriden methodu surekli kontrol eder ve
        // override etmeye engel olacak bir degisiklik yapilirsa  CTE verir
    }


    public void method3(){

        // @Override notasyonu kullanilmazsa overridden method degistirilse de
        // method3 yoluna bagimsiz bir method olarak devam eder

    }

   /* public int method4(){
        return 5;
    }*/ // Final  method overriding edilemez

    public static void method5(){  // overriding isareti cikmadi static method overriding edilemez,
                                  // CTE vermez farkli methodlar olarak gorur java

    }


    public short method9(){
        // Overriding method'un return type'i void veya primitive ise
        // overriding method'un return type'i AYNI olmalidir

        return 3;
    }

    public String method10(){
        // Eger overridden method'un return type'i non-primitive ise,
        // overriding  method'un return type'i YA ayni olmalidir, ya da
        // overridden method'un return type'nin child class'i olmalidir
        // buna Covariant denir

        return null;
    }


    public void method11(){
        super.method11();
        // overriddein ve overriding method'larin ikisi birden calismaz
        // ikisini de calistirmak isterseniz child class'da super.  kullanabilirsiniz
    }









}
