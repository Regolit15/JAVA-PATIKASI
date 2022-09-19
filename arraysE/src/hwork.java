public class hwork {
    public static void main(String[] args) {
        int[] list = {12, 34, 6, 3, 2, 73, 745, 12, 74};

        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum =sum+ 1.0/list[i];
        }
        double havarage = list.length / sum;
        System.out.println(havarage);
    }
}
