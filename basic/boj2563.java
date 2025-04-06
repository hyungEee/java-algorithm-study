import java.util.Scanner;

public class boj2563 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        boolean [][] bg=new boolean[100][100]; // 도화지
        int n=sc.nextInt(); // 색종이의 수
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            for(int j=x;j<x+10;j++){
                for (int k=y;k<y+10;k++){
                    bg[j][k]=true; // 색종이 붙은 부분 표시하기
                }
            }
        }
        int area=0;
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(bg[i][j]) {
                    area++;
                }
            }
        }
        System.out.print(area);

    }
}
