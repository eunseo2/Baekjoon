package Silver;

import java.util.Scanner;

public class N과M2 {
    static int arr[];
    static boolean visited[];
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        arr = new int[M];
        visited = new boolean[N+1];

        dfs(N,M,0);
    }

    public static void dfs(int N,int M,int index){
        if(index == M){

            if(check(arr)){
                for(int value : arr){
                    System.out.print(value+" ");
                }
                System.out.println();
            }
            return;
        }

        for(int i=1; i<=N; i++){
            if(!visited[i]){
                arr[index] = i;
                visited[i] = true;

                dfs(N,M,index+1);

                visited[i] = false;
            }
        }
    }

    public static boolean check(int arr[]){
        if(arr.length >=2){
            for(int i=0; i<arr.length-1; i++){
                for(int j=i+1; j<arr.length; j++){
                    if(arr[i] > arr[j]){
                        return false;
                    }
                }
            }
        }

        return true;
    } 
    
}
