package Silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 요세푸스문제 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();
        int K = in.nextInt();

        Queue<Integer> q  = new LinkedList<>();


        for(int i=1; i<=N; i++){
            q.offer(i);
        }


        sb.append("<");

        while(q.size() > 1){
            for(int i=0; i<K-1; i++){
                q.offer(q.poll());
            }
            sb.append(q.poll()+", ");
        }

        sb.append(q.poll()+ ">");
        

        System.out.println(sb);
    }
}
