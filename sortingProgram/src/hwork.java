import java.util.Scanner;
import java.util.Arrays;

public class hwork {
    public static void main(String[] args) {
        System.out.println(" Welcome To Our Sorting Program");
        Scanner scan=new Scanner(System.in);

        System.out.print("Please To Enter Array Size (only Number):");
        int n=scan.nextInt();
        int[] list= new int[n];
        System.out.println("Enter To Elements Of The Array :");
        for(int i =0; i<n;i++){
            System.out.print((i+1)+". Number: ");
            list[i]=scan.nextInt();
        }
        System.out.println("Smallest To Largest Sorting Of Your Array");
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }
}
