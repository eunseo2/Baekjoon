package Silver;

import java.util.Scanner;

public class N과M3 {
    public static int arr[];
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        arr = new int[M];

        dfs(N,M,0);

        System.out.println(sb);
    }

    public static void dfs(int N,int M,int index){
    
        if(index == M){
            for(int value : arr){
                sb.append(value).append(" ");
            }
            sb.append("\n");
            
            return;
        }

        for(int i=1; i<=N; i++){
            arr[index] = i; 
            dfs(N,M,index+1);
        }
    }
}
