import java.util.Scanner;
public class hipotenusproject {
    public static void main(String[] args) {
        double a,b,C;
        Scanner input=new Scanner(System.in);

        System.out.print("Lutfen a Kenarinin Uzunlugunu Girin: ");
        a=input.nextDouble();
        System.out.print("Lutfen b Kenarinin Uzunlugunu Girin : ");
        b=input.nextDouble();

        C=(a*a)+(b*b);
        System.out.println("Hipotenus : " +Math.pow(C,1.0/2.0));


    }
}

