package Silver;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 절댓값힙 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2)->{
            int a = Math.abs(o1);
            int b = Math.abs(o2);

            if(a == b){
                return o1-o2;
            }else{
                return a-b;
            }
        });

        for(int i=0; i<N; i++){
            int T = in.nextInt();
            if(T ==0){
                if(!pq.isEmpty()){
                    int x = pq.poll();
                    sb.append(x+"\n");
                }else{
                    sb.append(0+"\n");
                }
            }else{
                pq.offer(T);
            }
        }

        System.out.println(sb);
    }
    
}
