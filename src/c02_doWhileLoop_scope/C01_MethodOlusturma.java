package c02_doWhileLoop_scope;

public class C01_MethodOlusturma {
    public static void main(String[] args) {


        //Verilen bir metini alip, metnin tersini donduren bir method olusturun


        System.out.println(getReverseTExt("Ali gel"));
        System.out.println(getReverseTExt("Java herseyi cöze"));

    }

    public static String getReverseTExt(String metin) {

        String tersMetin = "";

        for (int i = metin.length() - 1; i >= 0; i--) {
            tersMetin += metin.charAt(i);
        }

        return tersMetin;
    }


}
