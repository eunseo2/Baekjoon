package Silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class 특정거리의도시찾기 {
    static int N,M,K,X;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static List<Integer> list= new ArrayList<Integer>();
    static boolean visited[];
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        K = in.nextInt();
        X = in.nextInt();

        for(int i=0; i<= N; i++){
            graph.add(new ArrayList<>());
        }

        visited = new boolean[N+1];


        for(int i=0; i<M; i++){
            int x = in.nextInt();
            int y = in.nextInt();

            graph.get(x).add(y);
        }

        bfs(X,0);

        if(list.isEmpty()){
            System.out.println("-1");
        }else{
            Collections.sort(list);
            for(int idx : list){
                System.out.println(idx);
            }
        }
    }

    public static void bfs(int start, int depth){
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(start, depth)); 
        visited[start] = true;

        while(!q.isEmpty()){
            Pair now = q.poll();
            if(now.depth == K){
                list.add(now.idx);
            }

            for(int i=0; i< graph.get(now.idx).size(); i++){
                int next = graph.get(now.idx).get(i);
                if(!visited[next]){
                    q.offer(new Pair(next, now.depth+1));
                    visited[next] = true;
                }
            }
        }

    }

    static class Pair{
        private int idx;
        private int depth;

        Pair(int idx, int depth){
            this.idx = idx;
            this.depth = depth;
        }
    }
}
