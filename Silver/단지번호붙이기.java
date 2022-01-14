package Silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class 단지번호붙이기 {

    static int arr[][];
    static boolean visited [][];
    static int cnt;
    static int N;
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       N = in.nextInt();
       arr = new int[N+1][N+1];


       for(int i=0; i<N; i++) {
           String s = in.next();
           for(int j=0; j<N; j++) {
                arr[i][j] = s.charAt(j) -'0';
           }
       }

       visited = new boolean [N+1][N+1];
       List<Integer> list = new ArrayList<>();

       for(int i=0; i<N; i++) {
           for(int j=0; j<N; j++) {
               if(arr[i][j] ==1 && visited[i][j] == false) {
                   list.add(bfs(i,j));
               }
           }
       }

       Collections.sort(list);
       System.out.println(list.size());
       for(int i=0; i<list.size(); i++) {
         System.out.println(list.get(i));
       }
   }

   public static int bfs(int i, int j){
       cnt = 0;
       Queue<Integer> q = new LinkedList<>();
       q.offer(i);
       q.offer(j);
       visited[i][j] = true;
       cnt++;
       
       while(!q.isEmpty()){
           int x = q.poll();
           int y = q.poll();

           // 북동남서
           int dx[] = {-1,0,1,0};
           int dy[] = {0,1,0,-1};

           for(int h=0; h<4; h++){
               int nx = x + dx[h];
               int ny = y + dy[h];

               if(nx >=0 && nx <=N  && ny>=0 && ny <=N){
                if(arr[nx][ny] ==1 && visited[nx][ny] ==false){
                   q.offer(nx);
                   q.offer(ny);
                   cnt++;
                   visited[nx][ny] = true;
                    }    

                }
            }

        }
        return cnt;
    }

}
