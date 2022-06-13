import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Sayinizi Giriniz : ");
        int number = input.nextInt();
        int basnumber = 0, basvalue, baspow, result = 0;
        int tempnumber = number;

        while (tempnumber != 0) {
            tempnumber /= 10;
            basnumber++;
        }
        tempnumber = number;
        while (tempnumber != 0) {
            basvalue = tempnumber % 10;
            baspow = 1;
            for (int i = 1; i <= basnumber; i++) {
                baspow = baspow * basvalue;
            }
            result = result + baspow;
            tempnumber /= 10;


        }
        if (result == number) {
            System.out.print(number + " Sayisi Armstrong Sayisidir");
        } else {
            System.out.print(number + " Sayisi Armstrong Sayisi Degildir!");
        }


    }
}





