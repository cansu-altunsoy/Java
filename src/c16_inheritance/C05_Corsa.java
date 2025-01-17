package c16_inheritance;

public class C05_Corsa extends C04_opel{


    public C05_Corsa(){

        System.out.println("C05 Corsa icin parametresiz constructor calisti");
    }


    String model = "Corsa";
    String kasa ="Corsa kasasi";
    String motor = "vvdi";
    String lastik = "15 inc pirelli";

    String uretimYeri = "Almanya";
    String aku = "volta aku";


    public static void main(String[] args) {

        C05_Corsa corsa1 = new C05_Corsa();

        System.out.println(corsa1.marka); // Opel
        System.out.println(corsa1.model); // Corsa
        System.out.println(corsa1.sanzuman); // Sanzuman secilmedi
        System.out.println(corsa1.kasa); // Corsa kasasi
        System.out.println(corsa1.uretimYeri); // Almanya

    }
}
