package c15_inheritance;


public class C05_AvciKuslar extends C04_Kuslar {


    public String hareket = "ucarlar";
    public String beslenme = "et yerler";
    public String pence = "pencelidir";
    public String gaga = "sivri gagali";


    public static void main(String[] args) {


        // Hayvanlar class'indan bir obje olusturun

        C03_Hayvanlar hayvan1 = new C03_Hayvanlar();

        System.out.println(hayvan1.omur); // H yasar ve olur
        System.out.println(hayvan1.solunum); //  K akcigerle nefes alirlar
        System.out.println(hayvan1.cogalma); // K yumurtayla cogalirlar
        // System.out.println(hayvan1.kanat); // K kanatlidir
        System.out.println(hayvan1.hareket); // H hareket ederler
        System.out.println(hayvan1.beslenme); //  H beslenirler
        //System.out.println(hayvan1.gaga); //  Hayvanlar class'inda yok CTE
        //System.out.println(hayvan1.pence); //  Hayvanlar class'inda yok CTE


        // kuslar class'indan bir obje olusturun

        C04_Kuslar kus = new C04_Kuslar();

        System.out.println(kus.omur); // H yasar ve olur
        System.out.println(kus.solunum); //  K akcigerle nefes alirlar
        System.out.println(kus.cogalma); // K yumurtayla cogalirlar
        System.out.println(kus.kanat); // K kanatlidir
        System.out.println(kus.hareket); // H hareket ederler
        System.out.println(kus.beslenme); //  H beslenirler
        System.out.println(kus.gaga); // A si


        C05_AvciKuslar kus1 = new C05_AvciKuslar();


        C03_Hayvanlar kusHayvani = new C04_Kuslar();

        System.out.println(kusHayvani.omur); // H yasar ve olur
        System.out.println(kusHayvani.solunum); //  K akcigerle nefes alirlar
        System.out.println(kusHayvani.cogalma); // K yumurtayla cogalirlar
        // System.out.println(kusHayvani.kanat); // K kanatlidir
        System.out.println(kusHayvani.hareket); // H hareket ederler
        System.out.println(kusHayvani.beslenme); //  H beslenirler
        //System.out.println(kusHayvani.gaga); //  Hayvanlar class'inda yok CTE
        //System.out.println(avciKushayvani.pence); //  Hayvanlar class'inda yok CTE



      /*
        String str = "Java candir";

        // String javanin olusturdugu bir class'dir ve ayni  zamanda class'dan olusturulan objeler icin  DATA TURUDUR
        // Ayni sey Java'daki tum class'lar icin gecerlidir

        C05_AvciKuslar bizim icin olusturdugumuz bir class'dir ama aynı zamanda avci objesi icin data turudur

       */


        /*

        Bir objenin hangi class'dan olusturuldugunu Constructor belirler

        Ammaa istersek data turu olarak parent class secilebilir

        EGEERR ozellikler variable olarak olusturulmus ise DATA TURU belirleyicidir
         */

        C05_AvciKuslar avci = new C05_AvciKuslar();


        System.out.println(avci.omur); // H yasar ve olur
        System.out.println(avci.solunum); //  K akcigerle nefes alirlar
        System.out.println(avci.cogalma); // K yumurtayla cogalirlar
        System.out.println(avci.kanat); // K kanatlidir
        System.out.println(avci.hareket); // A ucarlar
        System.out.println(avci.beslenme); // A et yerler
        System.out.println(avci.gaga); // A sivri gagali
        System.out.println(avci.pence); // A pencelidir


        C04_Kuslar avciKus = new C05_AvciKuslar();

        System.out.println(avciKus.omur); // H yasar ve olur
        System.out.println(avciKus.solunum); //  K akcigerle nefes alirlar
        System.out.println(avciKus.cogalma); // K yumurtayla cogalirlar
        System.out.println(avciKus.kanat); // K kanatlidir
        System.out.println(avciKus.hareket); // H hareket ederler
        System.out.println(avciKus.beslenme); //  H beslenirler
        System.out.println(avciKus.gaga); // A sivri gagali
        // System.out.println(avciKus.pence); // Kuslar ve Hayvanlar class'inda yok CTE


        C03_Hayvanlar avciKushayvani = new C05_AvciKuslar();

        System.out.println(avciKushayvani.omur); // H yasar ve olur
        System.out.println(avciKushayvani.solunum); //  K akcigerle nefes alirlar
        System.out.println(avciKushayvani.cogalma); // K yumurtayla cogalirlar
        //System.out.println(avciKushayvani.kanat); // Hayvanlar class'inda yok CTE
        System.out.println(avciKushayvani.hareket); // A ucarlar
        System.out.println(avciKushayvani.beslenme); // A et yerler
        //System.out.println(avciKushayvani.gaga); // Hayvanlar class'inda yok CTE
        //System.out.println(avciKushayvani.pence); //  Hayvanlar class'inda yok CTE


    }

}