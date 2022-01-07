package Bronze;

import java.util.Scanner;

public class 재귀피보나치 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(fibonacci(sc.nextInt()));
    }

    public static int fibonacci(int num){
        if(num == 0) return 0; 
        if(num == 1) return 1; 
        return fibonacci(num-1) + fibonacci(num-2);
    }
    
}
