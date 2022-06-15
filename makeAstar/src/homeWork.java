import java.util.Scanner;

public class homeWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Basamak Sayisini Giriniz : ");
        int n = input.nextInt();
        int i = 0;
        while (i < n) {
            i++;

            int k = 0;
            while(k <= (n - i)) {
                k++;
                System.out.print(" ");
            }
            int j = 1;
            while(j <=(2 * i) - 1) {
                j++;
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

