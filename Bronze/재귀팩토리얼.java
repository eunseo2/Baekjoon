package Bronze;

import java.util.Scanner;

public class 재귀팩토리얼 {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        System.out.println(factorial(in.nextInt()));

    }

    public static int factorial(int num){
        if(num==0) return 1;
        return num * factorial(num-1);
    }
    
}
