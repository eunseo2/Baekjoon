package Silver;

import java.util.Scanner;

public class 스타트와링크 {
    static int N;
    static int arr[][];
    static boolean visited[];
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        N = in.nextInt();

        arr = new int[N][N];
        visited = new boolean[N];

        for(int i = 0; i < N; i++){
            for(int j=0; j < N; j++){
                arr[i][j] = in.nextInt();
            }
        }


        dfs(0,0);
        System.out.println(min);
    }

    public static void dfs(int idx, int depth){
        if(depth == N/2){
            int start = 0;
            int link = 0;

            for(int i=0; i < N-1; i++){
                for(int j=i+1; j < N; j++){
                    if(visited[i] && visited[j]){
                        start += arr[i][j] + arr[j][i];
                    }
                    else if(!visited[i] && !visited[j]){
                        link += arr[i][j] + arr[j][i];
                    }
                }
            }

            int abs = Math.abs(start-link);

 
            min = Math.min(min,abs);

            return;

        }

        for(int i=idx; i < N; i++){
            if(!visited[i]){
                visited[i] = true; 
                dfs(i+1, depth+1);
                visited[i] = false;
            }
        }
    }
    
}
