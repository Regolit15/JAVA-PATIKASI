import java.util.Arrays;

public class hwork {
    static boolean newlist(int[] dizi, int kere, int a) {
        for (int i = 0; i < a; i++) {
            if (kere == dizi[i]) {
                return false;
            }
        }
        return true;
    }

    static int Ccount(int[] dizi, int kere) {
        int count = 0;
        for (int i : dizi) {
            if (i == kere)
                count++;

        }
        return count;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi : " + Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            if (newlist(list, list[i], i)) {
                System.out.println(list[i] + " sayisi " + Ccount(list, list[i]) + " kez tekrar edildi.");
            }
        }
    }

}



