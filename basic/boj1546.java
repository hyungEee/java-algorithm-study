
import java.util.Scanner;

public class boj1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        for (int item : arr) {
            if (item > max) {
                max = item;
            }
        }
        float sum=0;
        for(int i=0;i<n;i++){
            sum+=(float)arr[i]/max*100;
        }
        System.out.println(sum/n);
    }

}
