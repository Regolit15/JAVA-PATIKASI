import javax.print.attribute.standard.PresentationDirection;
import java.sql.SQLOutput;
import java.util.Scanner;
public class hwork {
    static int power(int a,int b){
        int result=1;
        for(int i=1;i<=b;i++){
            result*=a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Us Alma Programina Hos Geldiniz !");
        System.out.print("Taban Sayisi Giriniz : ");
        int a=scan.nextInt();
        System.out.print("Us Sayisini Giriniz : ");
        int b=scan.nextInt();

        System.out.print("Hesaplanan Deger : "+ power(a,b));
    }
}
