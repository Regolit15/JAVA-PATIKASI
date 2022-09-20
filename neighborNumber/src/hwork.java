import java.util.Scanner;
import java.util.Arrays;

public class hwork {
    public static void main(String[] args) {
        int[] list = {12, 562, 85, -56, -53, 5,3, 8,6, 234, 32, 14};
        int min = list[0];
        int max = list[0];
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen Rakam/Sayi Giriniz : ");
        int n = scan.nextInt();
        Arrays.sort(list);
        for (int i : list){
            if (i<n) {
                min = i;
            }
            if (i>n) {
                max = i;
                break;
            }
        }
        System.out.println("Sayiniza En Yakin Komsu Deger " + min);
        System.out.println("Sayiniza En Yakin Komsu Deger " + max);
    }
}
