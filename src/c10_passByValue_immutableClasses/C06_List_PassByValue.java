package c10_passByValue_immutableClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C06_List_PassByValue {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>(Arrays.asList("Cansu", "Bahadir", "Maya"));

        birIsimEkle(isimler);
        System.out.println(isimler);

        yeniLİsteOlustur(isimler);

        System.out.println(isimler);
    }


    //Verilen isimler listesine kullanicidan bir isim isteyip ekleyin ve yeni halini yazdirin


    public static void birIsimEkle(List<String> isimler) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("isim giriniz...");

        isimler.add(scanner.nextLine());

        System.out.println("Listenin yeni hali :" + isimler);
    }


    //==================================================================================


    //Verilen isimler listesine yeni bos bir liste atayin, sonra kullanicidan bir isim alıp listeye ekleyin ve
    // listenin son halini yazdiran  bir method olusturun


    public static void yeniLİsteOlustur(List<String> isimler) {

        isimler = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("listeye eklenecek isim giriniz...");

        isimler.add(scanner.nextLine());

        System.out.println("2. method'da Listenin yeni hali :" + isimler);

    }


}
