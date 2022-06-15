import java.util.Scanner;

public class homeWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, passWord;
        int right = 3;
        int balance = 3000;
        int select;


        while (right > 0) {
            System.out.print("Kullanici Adiniz :");
            userName = input.nextLine();
            System.out.print("Sifreniz :");
            passWord = input.nextLine();

            if (userName.equals("Regolit15") && passWord.equals("pati123")) {
                System.out.println("Merhaba, Java Bankasina Hos Geldiniz!");
                System.out.println("""
                        Lutfen Yapacaginiz Islemi Rakamlar ile Belirtiniz :
                        1-Para Yatirma
                        2-Para Cekme
                        3-Bakiye Sorgulama
                        4-Cikis Yap
                        """);
                System.out.print("Seciminiz :");
                select = input.nextInt();

                switch (select) {
                    case 1 -> {
                        System.out.print("Yatirma Istediginiz Tutari Giriniz :");
                        int price = input.nextInt();
                        balance += price;
                    }
                    case 2 -> {
                        System.out.print("Cekmek istediginiz Tutari Giriniz :");
                        int pric = input.nextInt();
                        if (pric > balance) {
                            System.out.println("Hesabiniz Yeterli Bakiye Bulunmamaktadir!");
                        } else {
                            balance -= pric;
                        }
                    }
                    case 3 -> System.out.print("Hesabinizin Bakiyesi :" + balance);
                    case 4 -> System.out.println("Gule Gule");
                    default -> System.out.print("Secim Hatasi Tekrar Deneyiniz!");

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
