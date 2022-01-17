package Silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 유기농배추 {

    static int arr[][];
    static boolean visited[][];
    public static void main(String[] args){

        StringBuilder sb = new StringBuilder();

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            int cnt = 0;

            int M = in.nextInt();
            int N = in.nextInt();
            int Line = in.nextInt();
    
            arr= new int[M+1][N+1];
            visited = new boolean [M+1][N+1];

            for(int j = 0; j < Line; j++){
                int x = in.nextInt();
                int y = in.nextInt();

                arr[x][y] = 1;
            }


            for(int x=0; x<M; x++){
                for(int y=0; y<N; y++){
                    if(arr[x][y] ==1 && visited[x][y] == false){
                        cnt++;
                        bfs(x,y,M,N);
                    } 
                }
            }
            sb.append(cnt+"\n");
        }
        System.out.println(sb);

    }

    public static void bfs(int x, int y, int M, int N){
        int dx[] = {-1,0,1,0};
        int dy[] = {0,1,0,-1};

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x,y});
        visited[x][y] = true;

        while(!q.isEmpty()){
            int [] poll = q.poll();
            int X = poll[0];
            int Y = poll[1];
    
            for(int i=0; i<4; i++){
                int tempX = X + dx[i];
                int tempY = Y + dy[i];

                if(tempX<0 || tempY<0 || tempX >=M || tempY>=N) continue;

                if(arr[tempX][tempY] == 1 && visited[tempX][tempY] == false){
                    q.offer(new int[]{tempX, tempY});
                    visited[tempX][tempY] = true;
                }
            
            }
       }

    }

    
}
