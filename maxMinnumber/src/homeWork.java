import java.util.Scanner;

public class homeWork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Girmek Istediginiz Sayi Miktarini Giriniz : ");
        int say = scan.nextInt();
        int max = 1, min = 1;
        for (int i = 1; i <= say; i++) {
            System.out.print(i + ".Sayi");
            int num = scan.nextInt();

            if (i == 1) {
                max = num;
                min = num;
            }
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Max Olan Sayi : " + max);
        System.out.print("Min Olan Sayi : " + min);
    }
}
