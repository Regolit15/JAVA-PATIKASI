import java.util.Scanner;

public class homeW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2, ebob = 1, ekok = 0;

        System.out.print("n1 Sayisi Giriniz :");
        n1 = scan.nextInt();
        System.out.print("n2 Sayisini Giriniz :");
        n2 = scan.nextInt();
        if (n1 > n2) {
            int i = 1;
            while (i <= n1) {
                i++;
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;

                }
            }

            ekok = (n1 * n2) / ebob;
            System.out.println("n1 ve n2 Sayilarinin Ekok'u : " + ekok);
            System.out.print("n1 ve n2 Sayilarinin Ebob'u : " + ebob);


        } else if (n2 > n1) {
            int k = 1;
            while (k <= n1) {
                k++;
                if (n1 % k == 0 && n2 % k == 0) {
                    ebob = k;

                }

            }
            ekok = (n1 * n2) / ebob;
            System.out.println("n1 ve n2 Sayilarinin Ekok'u : " + ekok);
            System.out.print("n1 ve n2 Sayilarinin Ebob'u : " + ebob);
        }

    }


}

