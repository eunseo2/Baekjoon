package Silver;
import java.util.Scanner;

public class N과M4 {
    public static int arr[];
    static StringBuilder sb = new StringBuilder();
    public static int N;
    public static int M;
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        arr = new int[M];

        dfs(0);

        System.out.println(sb);
    }

    public static void dfs(int index){
    
        if(index == M){
            if(check(arr)){
                for(int value : arr){
                    sb.append(value).append(" ");
                }
                sb.append("\n");
            }
            return;
        }

        for(int i=1; i<=N; i++){
            arr[index] = i; 
            dfs(index+1);
        }
    }

    public static boolean check(int[]arr){
        if(arr.length >=2){
            for(int i=0; i<arr.length-1; i++){
                for(int j=i+1; j<arr.length; j++){
                    if(arr[i] > arr[j]) return false;
                }
            }
        }
        return true;
    }
}
