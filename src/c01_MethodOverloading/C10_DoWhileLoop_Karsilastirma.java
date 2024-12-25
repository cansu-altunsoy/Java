package c01_MethodOverloading;

public class C10_DoWhileLoop_Karsilastirma {

    public static void main(String[] args) {


        /*
        - While loop once sarti kontrol edip, sarti sagliyorsak loop body calisir
        - do-while loop ise once body'yi calistirir, sonra kontrol yapar


        - Do-while loop'un artisida eksiside budur, EGER en az bir kere loop calismasini isterseniz avantaj olur

        EGER sarti saglamiyorsa HIC CALISMASIN derseniz dezavantaj olur
         */


        int sayi = -20;
        // sayi 0'dan buyuk ise, 0 oluncaya kadar birer azaltip yazdirin

        while (sayi > 0) {
            System.out.println(sayi + " ");
            sayi--;
        }


        // ===========================================================================================


        do {
            System.out.println(sayi + " ");
            sayi--;

        } while (sayi > 0);
    }
}
