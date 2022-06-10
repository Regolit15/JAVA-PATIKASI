import java.util.Scanner;

public class CiftSayilar {
    public static void main(String[] args) {
        /*int say;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Sayiyi Giriniz : ");
        say = input.nextInt();
        for (int i = 1; i <= say; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ",");
            }
        }

         */
        int say, i = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Sayiyi Giriniz : ");
        say = input.nextInt();
        while(i<say){
            if(say%2==0){
                i++;
                System.out.print(i + " ");
            }
        }


    }
}
