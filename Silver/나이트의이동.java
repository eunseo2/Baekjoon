package Silver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class 나이트의이동 {

   static class Pair{
        int first;
        int end;
        int depth;

        Pair(int first, int end, int depth) {
            this.first = first;
            this.end = end;
            this.depth = depth;
        }
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<T; i++){
            int I = in.nextInt();
            boolean visited[][] = new boolean[I][I]; 

            int startI = in.nextInt();
            int startJ = in.nextInt();


            int endI = in.nextInt();
            int endJ = in.nextInt();


            int d[][] = {{-2,1},{-1,2},{1,2},{2,1},{-2,-1},{-1,-2},{1,-2},{2,-1}};
            

            Queue<Pair> q = new LinkedList<>();

            q.offer(new Pair(startI, startJ,0));
            visited[startI][startJ] = true;

            while(!q.isEmpty()){
                Pair now = q.poll();
                if(now.first == endI && now.end == endJ){
                    list.add(now.depth);
                    continue;
                }


                for(int h=0; h<d.length; h++){
                    int nextI = d[h][0] + now.first;
                    int nextJ = d[h][1] + now.end;

                    if(nextI>=0 && nextI<I && nextJ>=0 && nextJ<I && !visited[nextI][nextJ]){
                        q.offer(new Pair(nextI, nextJ, now.depth+1));
                        visited[nextI][nextJ] = true;                       
                    }
         
                }

            }

        }


        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        
    }
    
}
