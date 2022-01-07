package Silver;

import java.util.Scanner;


public class 하노이탑 {

    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sb.append((int) (Math.pow(2, n) - 1)).append('\n');

        hanoi(n,1,2,3);
        System.out.println(sb);
       
    }

    public static void hanoi(int n,int start, int mid, int end){
        if(n==1) {
            sb.append(start + " " + end + "\n");
            return;
        }
        
        //1->3 (2를 거쳐서 )
        hanoi(n-1,start,end,mid);

        sb.append(start + " " + end + "\n");

        //2->3 (1을 거쳐서)
        hanoi(n-1,mid,start,end);
    }

}
