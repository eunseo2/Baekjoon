package Silver;

import java.util.Scanner;

public class 주유소 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N =in.nextInt();
        long len[] = new long[N-1];
        long price[]= new long[N];
        
        long sum = 0;

        for(int i=0; i<N-1; i++){
            len[i] = in.nextInt();
        }

        for(int i=0; i<N; i++){
            price[i] = in.nextInt();
        }  

        for(int i=0; i<N-1; i++){
            if(price[i] < price[i+1]){
                price[i+1] = price[i];
            }
        }

        for(int i=0; i<price.length-1; i++){
            sum += price[i] * len[i];
        }   

        System.out.println(sum);
    }
}
