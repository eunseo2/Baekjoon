package Silver;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 최소힙 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        
        for(int i=0; i<N; i++){
            int t = in.nextInt();
            if(t == 0){
                if(minHeap.isEmpty()){
                    sb.append(0+"\n");
                }else{
                    sb.append(minHeap.poll()+"\n");
                }
            }else{
                minHeap.add(t);
            }
        }
        System.out.println(sb);
    }
}
