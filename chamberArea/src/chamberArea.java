import java.util.Scanner;
public class chamberArea {
    public static void main(String[] args) {
        double r,Area,pi=3.14;
        //Buradaki math sinifini ogrenirem yari capi sabit yapmaktan kurtulabilirim!
        Scanner input= new Scanner(System.in);

        System.out.print("Lutfen Dairenin Yari Capini Giriniz(m) : ");
        r=input.nextDouble();
        Area=r*r*pi;
        System.out.print("Dairenin Alani(m2) : " + Area);
    }
}
    