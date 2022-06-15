import java.util.Scanner;

public class homeWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, passWord;
        int right = 3;
        int balance = 3000;
        int select;

        System.out.print("Kullanici Adiniz :");
        userName = input.nextLine();
        System.out.print("Sifreniz :");
        passWord = input.nextLine();
        while (right > 0) {
            if (userName.equals("Regolit15") && passWord.equals("pati123")) {
                System.out.println("Merhaba, Java Bankasina Hos Geldiniz!");
                System.out.println("Lutfen Yapacaginiz Islemi Rakamlar ile Belirtiniz :\n" +
                        "1-Para Yatirma\n" +
                        "2-Para Cekme\n" +
                        "3-Bakiye Sorgulama\n" +
                        "4-Cikis Yap\n");

                System.out.print("Seciminiz :");
                select = input.nextInt();
                switch (select) {
                    case 1:
                        System.out.print("Yatirma Istediginiz Tutari Giriniz :");
                        int price = input.nextInt();
                        balance += price;
                        break;
                    case 2:
                        System.out.print("Cekmek istediginiz Tutari Giriniz :");
                        int pric = input.nextInt();

                        if (pric > balance) {
                            System.out.println("Hesabiniz Yeterli Bakiye Bulunmamaktadir!");
                        } else {
                            balance -= pric;
                        }
                        break;
                    case 3:
                        System.out.print("Hesabinizin Bakiyesi :" + balance);
                        break;
                    case 4:
                        System.out.println("Gule Gule");
                        break;

                    default:
                        System.out.print("Seciminiz Hatali Tekrar Deneyiniz!");

                }

            } else {
                right--;
                System.out.println("Kullanici Adi/Parola Hatali! Tekrar Deneyiniz.");
                if (right == 0) {
                    System.out.print("Guvenlik Nedeniyle Hesabiniz Blokelenmistir. Musteri Hizmelerini Arayiniz!");

                } else {
                    System.out.println("Kalan Deneme Sayiniz :" + right);
                }
            }

        }

    }
}
