package Silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 바이러스 {
    static int[][] arr; 
    static boolean[] visited;
    static int point; 

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        point = in.nextInt();
        int line = in.nextInt();

        arr = new int[101][101];
        visited = new boolean[point+1];

        for(int i=1; i<=line; i++){
            int a = in.nextInt();
            int b = in.nextInt();

            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        System.out.println(bfs(1));
        
    }

    public static int bfs(int start){
        Queue<Integer> q  = new LinkedList<Integer>();

        q.add(start);
        visited[start] = true;

        int cnt = 0 ;

        while(!q.isEmpty()){
            int temp = q.poll();

            for(int i=1; i<=point; i++){
                if(arr[temp][i] == 1 && visited[i] == false){
                    cnt++;
                    q.add(i);
                    visited[i] = true;
                }
            }
        }

        return cnt;
    }

}
