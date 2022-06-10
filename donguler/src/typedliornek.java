import java.util.Scanner;
public class typedliornek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String customerPassword = "1111";
        boolean passwordSuccessfull = false;

        while(!passwordSuccessfull) {

            System.out.print(" Hesap şifrenizi giriniz : ");
            String typedPassword = scanner.next();


            if(customerPassword.contentEquals(typedPassword)) {
                passwordSuccessfull = true;
                System.out.println("Sisteme başarılı giriş yaptınız!");
            }else{
                System.out.print(" Hatali Giris");

            }
        }


    }
}
