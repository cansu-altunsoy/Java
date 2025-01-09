package c11_immutableClasses;

import java.time.Duration;
import java.time.LocalTime;

public class C04_LocalTime {

    public static void main(String[] args) {

        LocalTime localTimeBaslangic = LocalTime.now();


        // LocalTime class'i obje olusturdugumuz satir calistiginda
        //calistigi sistemdeki zaman bilgisini alir

        // Olusturulan LocalTime objesini bir kronometre degil olusturuldugu andaki degeri saklayan basit bir variable'dir

        System.out.println("Loop'dan once localTime : " + localTimeBaslangic);


        for (int i = 0; i < 500000; i++) {

            String str = "" + i + 1;

        }

        LocalTime localTimeBitis = LocalTime.now();

        System.out.println("Loop'dan sonra localtime : " + localTimeBitis);


        System.out.println(localTimeBitis.getSecond() - localTimeBaslangic.getSecond());

        //...get...LocalTime degerindeki saat, dakika, saniye veya nannosaniyeyi bize getirir


        System.out.println(Duration.between(localTimeBaslangic, localTimeBitis));

        System.out.println(localTimeBitis.withHour(20));
        System.out.println(localTimeBitis.withMinute(00));
        System.out.println(localTimeBitis.withSecond(0).withNano(0));
        // ...with...LocalTime degerindeki saat, dakika, saniye veya nannosaniyeyi istedigimiz deger olarak ayarlarlar


        // ..plus veya .minus...LocalTime degerindeki saat, dakika, saniye veya nannosaniyeyi
        // istedigimiz deger kadar ileri veya geri alir
        System.out.println(localTimeBitis.plusHours(29).plusMinutes(10)); // ileriye goturur bizi

        System.out.println(localTimeBitis.minusHours(210));


        // gunun baslangıcı olan 00:00'dan LocalTimeBaslangic zamanina kadar gecen toplam saniye
        System.out.println(localTimeBaslangic.toSecondOfDay());

        // gunun baslangıcı olan 00:00'dan LocalTimeBaslangic zamanina kadar gecen toplam nanosaniye
        System.out.println(localTimeBaslangic.toNanoOfDay());


        // yukaridaki loop islem suresini baslangic ve bitis nanosaniyeleri ile bulalim
        System.out.println("nanosaniye degeri");

        System.out.println(localTimeBitis.toNanoOfDay() - localTimeBaslangic.toNanoOfDay());


    }
}
