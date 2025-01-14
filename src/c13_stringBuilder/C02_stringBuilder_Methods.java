package c13_stringBuilder;

public class C02_stringBuilder_Methods {

    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder("Nice have a day");

        // sb1' de yet alan degeri tesrsten yazdırıyouz
        sb1.reverse();
        System.out.println(sb1);

        //sb1 tersi yazılmıs hali tekrara terstesn yazılıyor ve dogru haline dönüyor
        sb1.reverse();
        // tersin tersi kendisidir
        System.out.println(sb1);

        // isim ayni olsa bile StringBuilder da uygukama farkli olabilir


        //  replace method'u index alarak istenen aralıktaki metni siliğ yerine istedigimiz
        // ilk index dahil ikinci index harictir
        String str = "Wise Quarter";
        sb1.replace(0, 4, str);
        System.out.println(sb1);

        //delete iki index girilerek iki index arasindaki veriyi siler
        sb1.delete(0, 12);
        System.out.println(sb1.delete(0, 4));


        // Herhangi bir indexteki veriyi silmek icin kullanilir
        sb1.deleteCharAt(sb1.length() - 1);
        System.out.println(sb1);


        sb1.insert(sb1.length() - 1, "y");
        System.out.println(sb1);


        sb1.insert(0, "wise have");
        System.out.println(sb1);


    }
}
