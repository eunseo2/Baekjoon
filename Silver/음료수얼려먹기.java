package Silver;

import java.util.Scanner;

public class 음료수얼려먹기 {
        static int N, M;
        static int max = Integer.MIN_VALUE;
        public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        int arr[][] = new int[N][M];

        for(int i = 0; i < N; i++){
            String str = in.next();
            for(int j = 0; j < M; j++){
                arr[i][j] = str.charAt(j) -'0';
            }
        }

        for(int h=1; h<=4; h++){
            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    if(arr[i][j] == h){
                        dfs(arr,i,j, h, 1);
                    }
                }
            }
        }

   
    }

    public static void dfs(int arr[][], int i, int j, int h, int depth){

        if(i < 0 || i >= N || j < 0 || j >= M){
            max = Math.max(depth, max);
            return;
        }else if(arr[i][j] != h){
            max = Math.max(depth, max);
            return; 
        }

        arr[i][j]  = 0;

        dfs(arr,i+1,j,h, depth+1);
        dfs(arr,i-1,j,h,depth+1);
        dfs(arr,i,j+1,h, depth+1);
        dfs(arr,i,j-1,h, depth+1);

        arr[i][j]  = h;
    }
    
}
