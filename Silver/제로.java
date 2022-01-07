package Silver;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class 제로 {
    int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();

        ArrayList<Integer> list = new ArrayList<Integer>();

        int T = sc.nextInt();

        for(int i=0; i<T; i++) {
            int num = sc.nextInt();
            if(num !=0 ){
                list.add(num);
            }else{
                list.remove(list.size() - 1);
            }
        }

        제로 zero = new 제로();

        // 배열 -> stream -> addSum  
         list.stream().forEach(num -> {
             zero.sum +=num;
         });

         System.out.println(zero.sum);

    }
    
    
}
