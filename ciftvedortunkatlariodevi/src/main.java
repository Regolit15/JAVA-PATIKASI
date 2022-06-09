import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int n,total=0;
        Scanner scan=new Scanner(System.in);
        do{
            System.out.print("Lutfen Sayiyi Girin : ");
            n=scan.nextInt();

            if(n%2==0 && n%4==0){
                total+=n;
            }

        }while (n%2==0);
        System.out.print("Toplam :"+total);

    }
}
// Tek olan bir deger girilene kadar girisleri kabul eden ve girilen degerleri 2 ve 4 e bolunebilenleri toplayan program







