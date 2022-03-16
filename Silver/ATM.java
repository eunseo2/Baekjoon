package Silver;


import java.util.Arrays;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args){
    
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
    
        int arr[] = new int[N];
    
        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        int max = 0;

        for(int i = 0; i < arr.length; i++){
            max+= arr[i];
            arr[i] = max;
        }

        int sum = Arrays.stream(arr).sum();

        System.out.println(sum);

    }

}
