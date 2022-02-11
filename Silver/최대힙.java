package Silver;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 최대힙 {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1,o2)->o2-o1);
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        StringBuilder sb = new StringBuilder();
        

        for(int i = 0; i < N; i++){
            int t = in.nextInt();
            if(t == 0){
                if(maxHeap.isEmpty()){
                    sb.append(0+"\n");
                }else{
                    sb.append(maxHeap.poll()+"\n");
                }
            }else{
                maxHeap.add(t);
            }
        }

        System.out.println(sb);
    }
    
}
