
import java.util.Scanner;

public class boj10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = i + 1;
        }
        for(int k=0;k<m;k++){
            int i=sc.nextInt()-1;
            int j=sc.nextInt()-1;
            while(i<j){
                int tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
                i++;
                j--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}