package Gold;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 토마토 {
    static class Pair{
        private int h;
        private int i;
        private int j;

        public Pair(int h, int i, int j){
            this.h = h;
            this.i = i; 
            this.j = j;
        }
    }

    static Queue<Pair> q = new LinkedList<>();
    static int N;
    static int M;
    static int H;
    static int cnt;
    static int arr[][][];
    static int tmpArr[][][];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        M = in.nextInt();
        N = in.nextInt();
        H = in.nextInt();

        arr = new int[H][N][M];
        tmpArr = new int[H][N][M];

        for(int h=0; h<H; h++){
            for(int i = 0; i <N; i++){
                for(int j = 0; j < M; j++){
                    arr[h][i][j] = in.nextInt();
                }   
            }
        }

        for(int h=0; h<H; h++){
            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    if(arr[h][i][j] ==1){
                        q.offer(new Pair(h,i,j));
                    } 
                }   
            }
        }


        while(!isRipe()){
            cnt++;
            bfs();
            if(q.isEmpty()){
                System.out.println(-1);
                System.exit(0);
            }
        }

        System.out.println(cnt);

    }

    public static void bfs(){
        Queue<Pair> temq = new LinkedList<>();
        int dh[] = {-1,1,0,0,0,0};
        int dx[] = {0,0,-1,1,0,0};
        int dy[] ={0,0,0,0,-1,1};

        while(!q.isEmpty()){
            Pair now = q.poll();
            for(int i=0; i<6; i++){
                int nh = now.h + dh[i];
                int nx = now.i + dx[i];
                int ny = now.j + dy[i];

                if(nh<0 ||nh>H - 1 ||nx<0 || ny <0 || nx >=N || ny >=M) continue;

                if(arr[nh][nx][ny] == 0){
                    arr[nh][nx][ny] = 1;
                    temq.offer(new Pair(nh,nx,ny));
                }

            }
        }
        q = temq;
    }

    public static boolean isRipe(){

        for(int h=0; h < H; h++){
            for(int i = 0; i <N; i++){
                for(int j = 0; j < M; j++){
                    if(arr[h][i][j] == 0){
                        return false;
                    } 
                }   
            }
        }

        return true;
    }
    
}
