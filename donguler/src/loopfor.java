public class loopfor {
    public static void main(String[] args) {
       /* for(int i=1;i<10;i++){
            System.out.print(i+",");
        }

        */
        /*
        int sum = 0;
        for (int i = 0, j = 0; i &lt; 5 || j &lt; 5; ++i, j = i + 1) {
            sum += i;
        }
        System.out.println(sum);


         */

        for (int i = 1; i <= 2; ++i) {
            for (int j = 1; j < 4; ++j) {
                if (i == 1) continue;
                System.out.print(i);
            }
        }

    }
}
