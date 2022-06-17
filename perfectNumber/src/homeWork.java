import java.util.Scanner;

public class homeWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Sayinizi Giriniz : ");
        int a = input.nextInt();
        int toplam = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                toplam += i;
            }
        }
        if (toplam == a) {
            System.out.print(a+" Sayisi Mukemmel Sayidir ");

        } else {
            System.out.print(a+" Sayisi Mukemmel Sayi Degildir!");
        }
    }
}



















