package c04;

public class C01_ElemenArama {
    public static void main(String[] args) {


        //Verilen harf bir array'de istenen bir elemanin var olup olmadıdığını ve varsa kac kere kullanildigini yazdirin


        String[] harfler = {"a", "d", "f", "e", "a", "e", "d", "a", "a", "e", "a"};

        String arananHarf = "a";
        int sayac = 0;


        for (int i = 0; i < harfler.length; i++) {


            if (harfler[i].equals(arananHarf)) {

                sayac++;

            }

        }

        if (sayac == 0) {
            System.out.println("Aradıgınız harf kullanılmamıstır");

        } else {
            System.out.println("Aradıgınız harf array'de " + sayac + " kere kullanılmıstır");
        }

    }


    public static void arraydekiArananElemaninSayisiniYazdir(String[] harfler, String arananHarf) {

        int sayac = 0;


        for (int i = 0; i < harfler.length; i++) {


            if (harfler[i].equals(arananHarf)) {

                sayac++;

            }

        }

        if (sayac == 0) {
            System.out.println("Aradıgınız harf kullanılmamıstır");

        } else {
            System.out.println("Aradıgınız harf array'de " + sayac + " kere kullanılmıstır");
        }


    }


}
