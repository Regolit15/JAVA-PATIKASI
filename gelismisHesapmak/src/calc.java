import java.util.Scanner;

public class calc {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam Sonuc : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Cikarma Sonucu : " + result);
        return result;

    }
    static int times(int a ,int b){
        int result =a*b;
        System.out.println("Carpma Sonucu : "+result);
        return result;
    }
    static int diveded(int a ,int b){
        if(b==0){
            System.out.println("Ikinci Sayi 0'dan Farkli Olmalidir!");
            return 0;
        }
        int result=a/b;
        System.out.println("Bolme Isleminin Sonucu : "+result);
        return result;
    }
    static int power(int a,int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
    static int mod(int a,int b){
        return a%b;

    }
    static void calc(int a ,int b){
        System.out.println("Cevresi : " +2*(a+b));
        System.out.print("Alani : "+ a*b);
    }

    public static void
    main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1)Toplama Islemi\n"
                + "2)Cikarma Islemi\n"
                + "3)Carma Islemi\n"
                + "4)Bolme Islemi\n"
                + "5)Uslu Sayi Hesaplama\n"
                + "6)Mod Alma\n"
                + "7)Dikdortgen Alan ve Cevre Hesabi\n"
                + "0) Cikis Yapma\n";
        System.out.print(menu);
        while(true){
        System.out.print("Bir Islem Tuslayiniz : " );
        select=scan.nextInt();

        if(select==0){
            break;
        }
        System.out.print("Ilk Sayinizi Giriniz : ");
        int a=scan.nextInt();
        System.out.print("Ikinci Sayinizi Giriniz : ");
        int b=scan.nextInt();

        switch(select){
            case 1:
                sum(a,b);
                break;
            case 2:
                minus(a,b);
                break;
            case 3:
                times(a,b);
                break;
            case 4:
                diveded(a,b);
                break;
            case 5:
                System.out.println("Ustlu Sayinizin Hesabi : "+power(a,b));
                break;
            case 6:
                System.out.println("Mod Alma Hesabi : "+ mod(a,b));
                break;
            case 7:
                calc(a,b);
                break;
            default:
                System.out.print("Gecersiz Bir islem Yaptiniz ! ");



        }


    }
        System.out.println("Hocca Gal Ben Gidiyom!");


    }
}
