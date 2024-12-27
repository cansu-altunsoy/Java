package c03_scope_arrays;

public class C08_PozitifElementlerinToplami {

    public static void main(String[] args) {


        /*
        Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz
         */


        int[] arr = {-4, -9, 8, 5, 4, 7};


        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {

                toplam += arr[i];

            }

        }
        System.out.println("Pozitif elementlerin toplami :" + toplam);


        System.out.println(pozitifElementlerinToplaminiDondur(arr));


    }


    public static int pozitifElementlerinToplaminiDondur(int[] arr) {

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {

                toplam += arr[i];


            }

        }
        return toplam;


    }

}
