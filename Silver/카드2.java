package Silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 카드2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=N; i++) {
            queue.offer(i);
        }

        while(queue.size() > 1){
            queue.poll();
            int top = queue.poll();
            queue.offer(top);
        }

        System.out.println(queue.peek());

    }
    
}
