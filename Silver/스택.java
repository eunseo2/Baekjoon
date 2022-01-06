package Silver;

import java.util.Scanner;
import java.util.Stack;

public class 스택 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
    
        for(int i=0; i<t; i++){
            switch(sc.next()){
                case "push" :
                    int num = sc.nextInt();
                    stack.push(num);
                    break;
                case "top" : 
                    int top = stack.isEmpty() ? -1 : stack.peek();
                    sb.append(top+"\n");
                    break;
                case "size":
                    sb.append(stack.size()+"\n");
                    break;
                case "empty":
                    int empty = stack.isEmpty() ? 1: 0;
                    sb.append(empty+"\n");
                    break;
                case "pop":
                    if(stack.isEmpty()){
                        sb.append("-1"+"\n");
                        break;
                    }else{
                        int pop = stack.pop();
                        sb.append(pop+"\n");
                        break;
                    }
            } 
        }

        System.out.println(sb);
    }

}
