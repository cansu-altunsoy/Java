package c06_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C08_kullaniciyaListeOlusturtma {

    public static void main(String[] args) {

        //Kullanicidan istedigi kadar isim alip, Q'ya bastiginda
        // girdigi isimleri bize liste olarak dondurecek
        // bir method olusturun


        System.out.println(stringListesiOlustur());


    }


    public static List<String> stringListesiOlustur() {

        List<String> isimler = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String girilenIsim = "";

        do {
            System.out.println("Listeye eklemek için isim giriniz.\n Bitirmek icin Q'ya basiniz");

            girilenIsim = scanner.nextLine();


            if (!girilenIsim.equalsIgnoreCase("q")) {

                isimler.add(girilenIsim);
            }

        } while (!girilenIsim.equalsIgnoreCase("q"));
        return isimler;


    }


}
