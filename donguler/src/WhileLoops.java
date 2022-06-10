import java.sql.SQLOutput;
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        int password;
        boolean passwordSuccesfull = false;
        Scanner input = new Scanner(System.in);

        while (!passwordSuccesfull) {
            System.out.print("Hesap Sifrenizi Giriniz : ");
            password = input.nextInt();
            if (password==145) {
                System.out.println("Giris Basarilidir.");
                passwordSuccesfull=true;
            } else {
                System.out.println("Yanlis Girdiniz");
            }

        }

    }
}
