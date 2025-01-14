package c13_stringBuilder;

public class C02_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java'da ne numaralar var");

        // sb'yi terse cevirin

        sb.reverse();  // mutable oldugu icin kalici olarak degisir
        System.out.println(sb);

        // sb'yi yeniden terse cevirip duzgun haline dondure biliriz
        sb.reverse();
        System.out.println(sb);

        // Ismi ayni olsa da method'larin farkli data turlerindeki
        // uygulama bicimleri farkli olabilir

        String str = "Ahmet Hoca";
        sb.replace(0, 4, str);
        System.out.println(sb);

        sb.delete(0, 14);
        System.out.println(sb);

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);

        sb.insert(0, "Bizde");
        System.out.println(sb);

        sb.insert(0, str, 0, 1);
        System.out.println(sb);


    }
}
