import java.util.Scanner;

public class hwork {
    static void sekil(int a, int b, int c) {
        if (a > 0) {
            System.out.print(a + " ");
            a -= 5;
            c = a;
            sekil(a, b, c);
        } else if (a <= 0) {
            System.out.print(c + " ");
            c += 5;
            if (c == b) {
                System.out.print(b);
            } else {
                sekil(a, b, c);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen n Sayisini Giriniz : ");
        int n = scan.nextInt();
        sekil(n,n,n);
    }
}
