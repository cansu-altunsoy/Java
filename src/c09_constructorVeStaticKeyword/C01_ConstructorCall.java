package c09_constructorVeStaticKeyword;

public class C01_ConstructorCall {


    C01_ConstructorCall(){
        System.out.println("Parametresiz constructor calisti");

    }

    C01_ConstructorCall(int sayi){
        C01_ConstructorCall();
        System.out.println("int parametreli constructor calisti");

    }


    C01_ConstructorCall(String str){

        this(5); // constructor call icin kullanilir this(ilgili parametreli). Her zaman ilk satirda olmali yoksa hata verir kabul etmez

        System.out.println("String parametreli constructor calıstı");


    }

    public static void main(String[] args) {


        C01_ConstructorCall obj1 = new C01_ConstructorCall();

        C01_ConstructorCall obj2 = new C01_ConstructorCall(4);

        C01_ConstructorCall obj3 = new C01_ConstructorCall("Cansu");


    }

    public static void C01_ConstructorCall(){

        System.out.println("method calisti");
    }
}
