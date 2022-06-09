import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayinizi Giriniz : ");
        n = scan.nextInt();
        for(int i=1;i<=n;i*=4){
            System.out.println("Girdiginiz Sayiya Kadar Olan 4'un Kuvvetleri : "+i);
        }
        System.out.println("----------------------------------------------------------");   //Ayrac olmasi icin eklenilmistir!
        for(int j=1;j<=n;j*=5){
            System.out.println("Girdiginiz Sayiya Kadar Olan 5'in Kuvvetleri : "+j);
        }

//4 ve 5'in kuvvetlerini ekrana yazdiran program.


    }
}
