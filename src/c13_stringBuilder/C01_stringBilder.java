package c13_stringBuilder;

public class C01_stringBilder {

    public static void main(String[] args) {

        StringBuilder sb2 = new StringBuilder(7);


        System.out.println("sb2 = " + sb2);
        System.out.println("sb2'nin uzunluğu =" + sb2.length());
        System.out.println("sb2'nin kapasitesi = " +sb2.capacity());


        System.out.println("===================================");

        sb2.append("Cansu");

        System.out.println("sb2 = " + sb2);
        System.out.println("sb2'nin uzunluğu =" + sb2.length());
        System.out.println("sb2'nin kapasitesi = " +sb2.capacity());

        System.out.println("======================================");

        sb2.append("BurakCansu");

        System.out.println("sb2 = " + sb2);
        System.out.println("sb2'nin uzunluğu =" + sb2.length());
        System.out.println("sb2'nin kapasitesi = " +sb2.capacity());

        System.out.println("========================================");


        StringBuilder sb3 = new StringBuilder("Java hep dogrucudur");

        System.out.println("sb2 = " + sb3);
        System.out.println("sb2'nin uzunluğu =" + sb3.length());
        System.out.println("sb2'nin kapasitesi = " +sb3.capacity());
        //Java bu sekilde olusturulan StringBuilder'larda 16+ length kadarlik bir SB olusturur

        System.out.println("===================================================");

        StringBuilder sb4 = new StringBuilder("Javacıyızzz");

        System.out.println("sb2 = " + sb4);
        System.out.println("sb2'nin uzunluğu =" + sb4.length());
        System.out.println("sb2'nin kapasitesi = " +sb4.capacity());

        System.out.println("...............................................");

        sb4.append("ogrenen pisman olmazzz");
        System.out.println("sb2 = " + sb4);
        System.out.println("sb2'nin uzunluğu =" + sb4.length());
        System.out.println("sb2'nin kapasitesi = " +sb4.capacity());











    }
}
