import java.util.Scanner;

public class boj1193 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        int line=1;
        while(x>line){ // 몇번째 (대각)라인인지 구하기
            x-=line; // while문을 다 돌고나면 line번째 줄의 x번째 요소가 됨
            line++;
        }
        int top=1;
        int bottom=line;
        for(int i=1;i<x;i++){ // 라인의 첫번째 요소는 계산이 필요없기 때문에 i=1부터 시작
            top+=1;
            bottom-=1;
        }
        if(line%2==0){
            System.out.print(top+"/"+bottom);
        }else{
            System.out.print(bottom+"/"+top); // 홀수번째 줄은 반대방향(밑에서 위로)이기 때문에 분자 분모 바꿔줌.
        }

    }
}