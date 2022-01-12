package Silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
    static int[][] arr; 
    static boolean[] visited; 
    static int point;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        point = in.nextInt();
        int line = in.nextInt();
        int start = in.nextInt();

        arr = new int[1001][1001];
        
        for(int i=1; i<=line; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1; 
        }

        visited = new boolean[1001];
        bfs(start); 

    }

    public static void bfs(int start){
        Queue<Integer> que = new LinkedList<Integer>();

        que.add(start);
        visited[start] = true;

        while(!que.isEmpty()){
            int temp = que.peek();
            que.poll();
            System.out.print(temp+ " ");

            for(int i=1; i<=point; i++){
                if(arr[temp][i] ==1 && visited[i] == false){
                    que.add(i);
                    visited[i] = true;
                }
            }
        }
    }
    
}
