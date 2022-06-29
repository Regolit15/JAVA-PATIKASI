import java.util.Scanner;

public class homew {
    static boolean isPrime(int sayi,int i){

        if(sayi<=2){
            return (sayi==2) ? true : false;
        }
        if(sayi%i==0){
            return false;
        }
        if(i*i>sayi){
            return true;

        }
        return isPrime(sayi,i+1);

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Programa Hos Geldiniz!");
        System.out.print("Lutfen Sayi Giriniz : ");
        int sayi=scan.nextInt();
        if(isPrime(sayi,2)){
            System.out.println(sayi+ " Sayisi Asal Sayidir");
        }else{
            System.out.println(sayi+ " Sayisi Asal Sayi Degildir");
        }

    }
}

