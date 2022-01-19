package Silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로탐색 {
    static int arr[][];
    static boolean visited[][];
    static int M;
    static int N;
    static int cnt;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();

        arr = new int[N+2][M+2];
        visited = new boolean[N+2][M+2];

        for(int i = 1; i <= N; i++) {
            String str = in.next();

            for(int j = 1; j <= M; j++) {
                arr[i][j] = str.charAt(j-1)-'0';
            }
        }
        System.out.println(bfs(1,1,1));
    }

    public static int bfs(int i , int j, int depth){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {i,j,depth});

        visited[i][j] = true;
        int dx[] = {-1,0,1,0};
        int dy[] = {0,1,0,-1};
        cnt++;


        while(!q.isEmpty()){
            int array[] = q.poll();
            int x = array[0];
            int y = array[1];
            int d = array[2];

            if(x==N && y==M) return d;

            for(int k = 0; k <4; k++){
                int nx = x + dx[k];
                int ny = y + dy[k];

                if(nx<1 || nx>N || ny<1 || ny>M) continue;

                if(!visited[nx][ny] && arr[nx][ny] ==1){
                    q.add(new int[] {nx,ny,d+1});
                    visited[nx][ny] = true;
                    cnt++;
                }
    
            }
        }

        return 0;
    }
    
}
