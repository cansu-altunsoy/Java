package c11_immutableClasses;

import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;

public class C05_FarkliLocasyonIcinSaat {

    public static void main(String[] args) {

        /*
        LocalTime class'i ile

        - herhangi bir andaki local zamani kayedebiliriz,  herhangi bir anda  her hangi bir saat dilimindeki zamani
         kaydedebiliriz
         - Verilen iki localtime arasindaki zaman dilimini bulabiliriz
         - LocalTime'dan
         - get() zamanin istenen bolumunu alabilirim
         - with() zamanin belirli bir bolumunu istedigim degerle degistirebilirim
         - plus() zamani istedigimiz kadar ileri alabiliriz
         - minus() zamani istedigimiz kadar geri alabiliriz
         - farkli zamanlari isAfter veya isBefore ile karsilastirabiliriz

          */


        //  su anda Japonya'daki saati yazdırın

        LocalTime timeJaponya = LocalTime.now(ZoneId.of("Japan"));

        System.out.println("japonya da şuan saat: " + timeJaponya);


        // su anda Londra'daki saati yazdirin

        LocalTime timeLondra = LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println("Londra'da suan saat : " + timeLondra);


        // su anda Newyork'daki saati yazdirin
        LocalTime timeNewYork = LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println("Newyork'ta saat : " + timeNewYork);


        // su anda Texas'daki saati yazdirin   America/Denver
        LocalTime timeTexas = LocalTime.now(ZoneId.of("America/Denver"));
        System.out.println("Texas'ta saat : " + timeTexas);


        // saat 11:25:8:00000 icin local saat olusturun
        LocalTime localTime1 = LocalTime.of(11, 25, 8, 0);

        // saat 2:28:6:00000 icin local saat olusturun
        LocalTime localTime2 = LocalTime.of(2, 28, 6, 1);

        //aralarindaki sure farkini bulalim
        System.out.println(Duration.between(localTime2, localTime1));


        System.out.println(localTime1.isAfter(localTime2)); // localTime1, LocalTime2'den sonra mi diye bakar ===> true yazdirir

        System.out.println(localTime1.isBefore(localTime2));//  sonra mi diye bakti   ====>false


    }
}
