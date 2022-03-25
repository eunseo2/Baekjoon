package Gold;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 연구소 {
    static int N,M;
    static boolean visited[][];
    static int answer = Integer.MIN_VALUE;
    static int dx[] = {-1,0,1,0};
    static int dy[] = {0,1,0,-1};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();

        int arr[][] = new int[N][M];
        visited = new boolean[N][N];


        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        // 벽 세우기
        setUp(arr, 0);

        System.out.println(answer);

    }


    //벽 세우기 
    private static void setUp(int arr[][], int depth){
        if(depth == 3){
            virus(arr);
            return;
         }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(arr[i][j] == 0){
                    arr[i][j] = 1;
                    setUp(arr, depth+1);
                    arr[i][j] = 0;
                }
            }
        }
    }

    //바이러스 퍼진 뒤 
    private static void virus(int arr[][]){
        Queue<Pair> q = new LinkedList<>();

        int virusArr[][] = new int[N][M];

        for(int k=0; k<N; k++){
            for(int l=0; l<M; l++){
                virusArr[k][l] = arr[k][l];
            }
        }


        for(int k=0; k<N; k++){
            for(int l=0; l<M; l++){
              if(virusArr[k][l] == 2){
                q.offer(new Pair(k,l));
              }
            }
        }


        while(!q.isEmpty()){
            Pair now =q.poll();
            
            for(int i=0; i<4; i++){
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if(nx >= 0 && nx < N && ny >= 0 && ny < M ){
                    if(virusArr[nx][ny] == 0){
                        virusArr[nx][ny] = 2;
                        q.offer(new Pair(nx,ny));
                    }
                }
            }

        }

        safe(virusArr);
    }



    private static void safe(int virusArr[][]){
        int cnt = 0;

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(virusArr[i][j] == 0){
                    cnt++;
                }
            }
        }

        answer = Math.max(answer, cnt);
    }


    static class Pair{
        private int x; 
        private int y;

        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
}
