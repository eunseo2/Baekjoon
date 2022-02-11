package Silver;

import java.util.Arrays;
import java.util.Scanner;

public class 수찾기 {
    static int arr[];
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        
        int M = in.nextInt();

        for(int i=0; i<M; i++){
            if(binary(in.nextInt(), arr.length-1)){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }

    }

    public static boolean binary(int num, int end){
        int start =0;
        while(start <= end){
            int mid = (start+end) /2;
             if(arr[mid]==num){
                 return true;
             }else if(arr[mid] < num){
                 start = mid+1;
             }else{
                 end = mid-1;
             }
        }
        return false;
    }
}
