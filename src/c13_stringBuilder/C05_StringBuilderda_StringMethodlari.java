package c13_stringBuilder;

public class C05_StringBuilderda_StringMethodlari {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java candir");


        // sb a harfi icerir mi ?
        // StringBuilder'da olmayan ama String'de olan method'lari kullanmak isterseniz

        System.out.println(sb.toString().contains("a")); // true

        // StringBuilder method'larindan return type'i StringBuilder olanlar
        // kalici degisiklik yaparlar AAMMAA return type'i StringBuilder OLMAYANLAR kalici degisiklik YAPMAZ

        System.out.println(sb.substring(5));
        System.out.println(sb);

        System.out.println(sb.substring(5));

        System.out.println(sb);

        // sb = sb.substring(5); // return type String oldugundan StringBuilder'i DEGISTIREMEZ

        System.out.println(sb.indexOf("a"));

        System.out.println(sb);


    }
}
