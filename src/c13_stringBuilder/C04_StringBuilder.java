package c13_stringBuilder;

public class C04_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        // Java 16 karakter alabilecek kapasitede ama BOS bir sb uretir

        System.out.println("sb1 : " + sb1); // hiclik
        System.out.println("sb1'in uzunlugu : " + sb1.length()); // 0
        System.out.println("sb1'in kapasitesi : " + sb1.capacity()); // 16


        StringBuilder sb2 = new StringBuilder(10);
        //Java 10 karakter alabilecek kapasitede ama BOS bir sb uretir

        System.out.println("sb2 : " + sb2); // hiclik
        System.out.println("sb2'in uzunlugu : " + sb1.length()); // 0
        System.out.println("sb2'in kapasitesi : " + sb1.capacity()); // 7

        sb2.append("Burak");
        System.out.println("sb2 : " + sb2); //
        System.out.println("sb2'in uzunlugu : " + sb2.length()); // 5
        System.out.println("sb2'in kapasitesi : " + sb2.capacity()); // 10

        sb2.append(" Cansu");
        System.out.println("sb2 : " + sb2); //
        System.out.println("sb2'in uzunlugu : " + sb2.length()); // 11
        System.out.println("sb2'in kapasitesi : " + sb2.capacity()); // 10*2 + 2 ===> 22


        StringBuilder sb3 = new StringBuilder("Java");
        //Java 16 + 4(length) ===>20 karakter kapasiteli, icinde "Java" bulunduran bir sb olusturur

        System.out.println("sb2 : " + sb3); // Java
        System.out.println("sb2'in uzunlugu : " + sb3.length()); //  4
        System.out.println("sb2'in kapasitesi : " + sb3.capacity()); // 20

        sb3.append(" ogrenen pisman olmaz.");

        System.out.println("sb2 : " + sb3); // Java ogrenen pisman olmaz
        System.out.println("sb2'in uzunlugu : " + sb3.length()); //  26
        System.out.println("sb2'in kapasitesi : " + sb3.capacity()); // 20*2 +2 ====> 42


        sb3.trimToSize();  //  length ile size'i esitler
        System.out.println("sb2 : " + sb3); // Java ogrenen pisman olmaz
        System.out.println("sb2'in uzunlugu : " + sb3.length()); //  26
        System.out.println("sb2'in kapasitesi : " + sb3.capacity()); // 26

        // TC No: 11123456789 her ne kadar sayilardan olussa da matematiksel islemlerde kullanilmayacagi icin
        // String veya StringBuilder olarak tutabiliriz

        String tcNoStr = "11123456789";
        StringBuilder tcNoSb = new StringBuilder(11);
        tcNoSb.append("11123456789");

        StringBuilder sb4 = new StringBuilder();
        sb4.append("Ali");

        System.out.println(sb4);

        String str = "Güzel";

        sb4.append(str, 0, 3);
        System.out.println(sb4);


    }
}
