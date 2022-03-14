package Silver;

import java.util.Scanner;

public class 동전 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int K = in.nextInt();

        int sum = 0;

        int arr[] = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }

        for(int i = N-1; i >= 0; i--){
            if(arr[i] <= K){
                int cnt = K/arr[i];
                sum +=cnt;
                K -= arr[i] * cnt;
            }

        }

        System.out.println(sum);
    }
    
}
