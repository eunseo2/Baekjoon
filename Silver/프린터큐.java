package Silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 프린터큐 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        Queue<Docs> q = new LinkedList<>();

        for(int i = 0; i<T; i++){
            int cnt =1;
            int N = in.nextInt();
            int M = in.nextInt();

            for(int j = 0; j < N; j++){
                int H = in.nextInt();
                q.offer(new Docs(j, H));
            }

            while(!q.isEmpty()){
                Docs now = q.poll();
                boolean check = true;

                for(Docs d : q){
                    if(now.value < d.value){
                        check = false;
                        break;
                    }
                }

                if(check){
                    if(now.index == M){
                        System.out.println(cnt);
                    }else{
                        cnt++;
                    }
                }else{
                    q.offer(now);
                }
            }

        }
    }

    static class Docs{
        int index;
        int value;
    
        Docs(int index, int value){
            this.index = index;
            this.value = value;
        }
    }
    
}
