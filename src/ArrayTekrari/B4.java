package ArrayTekrari;

public class B4 {
    public static void main(String[] args) {

        // Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        //         sonucu bize donduren bir method yaziniz.

        int[] sayilar={3,7,1,9,-3,-11,-50};
        System.out.println(arraydakiPozitifSayiToplami(sayilar));

    }
    public static int arraydakiPozitifSayiToplami(int[] arr){

        int toplam=0;

        for (int i = 0; i <arr.length; i++) {

            if (arr[i]>0){
               toplam+=arr[i];
            }
        }return toplam;
    }
}
