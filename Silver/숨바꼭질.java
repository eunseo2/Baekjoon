package Silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 숨바꼭질 {

    static int[] check = new int[100001];
    static int K;
    static int[] arr = {-1,1,2};

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        K = in.nextInt();

        if(N == K) {
            System.out.println(0);
            System.exit(0);
        }

        Queue<Integer> q = new LinkedList<>();
        q.offer(N);
        check[N] = 1;

        while(!q.isEmpty()) {
            int now = q.poll();

            for(int i = 0; i <3; i++){
                int next;

                if(i==2) {
                    next = now * arr[i];
                }else{
                    next = now + arr[i];
                }

                if(next == K){
                    System.out.println(check[now]);
                    System.exit(0);
                }

                if(next >=0 && next < 100001 && check[next] == 0){
                    check[next] = check[now] + 1;
                    q.offer(next);      
                }
            }
        }
    }
    
}
