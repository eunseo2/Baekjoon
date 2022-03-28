package Silver;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 경쟁적전염 {
    static class Pair{
        int i;
        int j;
        int virus;

        public Pair(int i, int j, int virus) {
            this.i = i;
            this.j = j;
            this.virus = virus;
        }
    }
    
    static int S;
    static int N;
    static int K;
    static PriorityQueue<Pair> pq = new PriorityQueue<>((o1,o2)->o1.virus - o2.virus);
    static int arr[][];
    static int dx[] = {-1,0,1,0};
    static int dy[] = {0,-1,0,1};

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        K = in.nextInt();

        arr = new int[N][N];


        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                arr[i][j] = in.nextInt();
            }
        }

        S = in.nextInt();
        int X = in.nextInt();
        int Y = in.nextInt();


        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(arr[i][j] !=0){
                    pq.offer(new Pair(i,j,arr[i][j]));
                }
             }
        }

        int time = 0;

        while(time++ != S)
            BFS();

        System.out.println(arr[X-1][Y-1]);
    }

    public static void BFS(){
        PriorityQueue<Pair> tmpQ =new PriorityQueue<>((o1,o2)->o1.virus - o2.virus);

        while(!pq.isEmpty()){
            Pair now = pq.poll();
            int i = now.i;
            int j = now.j;
            int virus = now.virus;

            for(int d=0; d<4; d++){
                int nx = i + dx[d];
                int ny = j + dy[d];

                if(nx < 0 || ny < 0 || nx >= N || ny >= N || arr[nx][ny] !=0 ) continue;

                arr[nx][ny] = virus;
                tmpQ.offer(new Pair(nx,ny,virus));
            }
        }

        pq = tmpQ;
    }
}
