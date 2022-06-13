import java.util.Scanner;

public class odev1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int say = inp.nextInt();
        int rakam, total = 0;
        int tempnumber;

        tempnumber = say;
        while (tempnumber != 0) {
            rakam = tempnumber % 10;
            tempnumber /= 10;
            System.out.print(rakam);

            if (tempnumber != 0) {
                System.out.print("+");
            }
            total += rakam;
        }


        System.out.print("= " + total+ "----"+say+" Sayisinin Rakamlarinin Toplamidir!");
    }

}


