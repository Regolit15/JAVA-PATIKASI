import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hwork {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number =(int) (Math.random()*100);
        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isMistake = false;
        //System.out.println(number);

        while (right < 5) {
            System.out.print("Lutfen Tahmininizi Giriniz: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lutfen 0 ile 100 Arasinda Bir Deger Giriniz!");
                if (isMistake) {

                    System.out.println("Cok Fazla Hatali Giris Yaptiniz. Kalan Hak: " + (5 - (++right)));

                } else {
                    isMistake = true;
                    System.out.println("Tekrar Hatali Girisinizde Hakkinizdan dusulecektir");

                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler Dogru Tahmin ! Tahmin Ettiginiz Sayi : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatali Bir Sayi Girdiniz !");
                if (selected > number) {
                    System.out.println(selected + " sayisi, gizli sayidan buyuktur.");
                } else {
                    System.out.println(selected + " Sayisi, Gizli Sayidan kucuktur !");
                }
                wrong[right] = selected;
                right++;
                System.out.println("Kalan Hakki : " + (5 - right));


            }
        }


        if (!isWin) {
            System.out.println("You Lose!");
            if (!isMistake) {
                System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
            }
        }
    }
}
