package c12_dateTime_Varargs;

import java.time.LocalDate;

public class C02_LocalDate {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);


        // get() methodları ile istedigimiz tarihi getire biliriz
        System.out.println(localDate.getDayOfYear());// Yılın kacıncı gunu

        System.out.println(localDate.getDayOfWeek());//

        System.out.println(localDate.getChronology()); // ISO


        // with() tarihin belirki bir bolumunu degistirebilir

        System.out.println(localDate.withMonth(7));

        // plus() ve minus()

        System.out.println(localDate.plusWeeks(34).plusDays(11));// bebek dogum hesapları

        System.out.println(localDate.minusMonths(15).minusDays(12));

        System.out.println(localDate.isLeapYear()); //ture

        // 1905 artık yıl mi ?

        LocalDate tarih = LocalDate.of(1905, 11, 27);

        System.out.println(tarih.isLeapYear());// false


    }
}
