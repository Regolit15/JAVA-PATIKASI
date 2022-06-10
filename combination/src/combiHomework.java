import java.util.Scanner;
public class combiHomework {
    public static void main(String[] args) {
        int n,r,combination,ntotal=1,rtotal=1,paydatotal=1,paydafark;
        int gtotal;
        Scanner scan=new Scanner(System.in);
        System.out.println("Kombinasyon Hesaplama Programina Hos Geldiniz!");
        System.out.print("Lutfen n Degerini Giriniz : ");
        n=scan.nextInt();
        System.out.print("Lutfen r Degerini Giriniz : ");
        r=scan.nextInt();
        //Combination formula = C(n,r) = n! / (r! * (n-r)!)\
        //Faktoriyel ifadeler negatif sayilarda tanimli olmadigi icin n degeri r degerinden > yada = olmalidir!
        if(n>=r){
            for(int i=1;i<=n;i++){
                ntotal*=i;
            }
            for(int l=1;l<=r;l++){
                rtotal*=l;
            }
            paydafark=n-r;
            for(int y=1;y<=paydafark;y++){
                paydatotal*=y;

            }
            gtotal=ntotal/(rtotal*paydatotal);

            System.out.print("Kombinasyon : "+ gtotal);

        }else{
            System.out.print("Girdiginiz Degerde Hata Vardir. Kontrol Ediniz.  " +
                    "Dikkat!! Faktoriyel ifadeler negatif sayilarda tanimli olmadigi icin n degeri r degerinden > yada = olmalidir ");
        }

    }

}
