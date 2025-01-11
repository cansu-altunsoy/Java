package c12_dateTime_Varargs;

import java.time.LocalDate;
import java.time.Period;

public class C04_Period {

    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(1995,11, 27);
        LocalDate bugun = LocalDate.now();


        System.out.println(Period.between(dogumTarihi,bugun));

        System.out.println(Period.between(dogumTarihi, bugun).getYears()); // 30



    }
}
