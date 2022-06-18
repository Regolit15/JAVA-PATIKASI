import java.util.Scanner;
public class hwork {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Lutfen Basamak Sayisini Giriniz : ");
        int n=input.nextInt();

        for(int i=n;i>0;i--){
            for(int k=n-i;k>0;k--) {
                System.out.print(" ");
            }for(int l=2*i-1;l>0;l--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
