import java.util.Scanner;

public class hWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Serinin Eleman Sayinizi Giriniz : ");
        int elemanSayisi = input.nextInt();

        int oncekiSayi = 0, simdikiSayi = 1, sonrakiSayi;
        for (int i =0 ; i <=elemanSayisi ; i++) {
            System.out.print(oncekiSayi + " ");

            sonrakiSayi=oncekiSayi+simdikiSayi;
            oncekiSayi=simdikiSayi;
            simdikiSayi=sonrakiSayi;

        }


    }
}
