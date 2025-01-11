package c12_dateTime_Varargs;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {

    public static void main(String[] args) {


        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);  //  2024-10-23


        LocalDate localDateJapan = LocalDate.now(ZoneId.of("Japan"));
        System.out.println(localDateJapan);  //  2024-10-23


        LocalDate LocalDateHawai = LocalDate.now(ZoneId.of("Pacific/Honolulu"));
        System.out.println(LocalDateHawai);


        LocalDate dogumGunu = LocalDate.of(1995, 9, 9);
        System.out.println(dogumGunu);

        LocalDate baslangic = LocalDate.of(1923, 10, 29);
        System.out.println(baslangic);


    }


}
