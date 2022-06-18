public class homeWork {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            int sayac = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    sayac++;

                }
            }
            if (sayac == 2) { //Bunun Anlami Boleni 2 tane olanlari var ise i Degerlerini ona gore yazdir demek!
                System.out.print(i + " ");
            }

        }
    }
}
