package c01_MethodOverloading;

public class C09_RakamlarToplamiMethodu {

    public static void main(String[] args) {

        // While loop kullanarak verilen bir sayinin rakamlar toplamini
        // hesaplayip bize donduren bir method olusturun


        System.out.println(sayininRakamlarToplami(526));


    }

    public static int sayininRakamlarToplami(int sayi) {

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int temp = sayi;


        while (temp != 0) {

            birlerBasamagi = temp % 10;
            rakamlarToplami += birlerBasamagi;
            temp /= 10;

        }

        return rakamlarToplami;

    }


}
