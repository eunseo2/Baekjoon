package Silver;

import java.util.LinkedList;
import java.util.Scanner;

public class 큐2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        LinkedList<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
    
        for(int i=0; i<t; i++){
            switch(sc.next()){
                case "push" :
                    int num = sc.nextInt();
                    queue.offer(num);
                    break;
                case "front" : 
                    int front = queue.isEmpty() ? -1 : queue.peek();
                    sb.append(front+"\n");
                    break;
                case "back" : 
                    int back = queue.isEmpty() ? -1 : queue.peekLast();
                    sb.append(back+"\n");
                    break;
                case "size":
                    sb.append(queue.size()+"\n");
                    break;
                case "empty":
                    int empty = queue.isEmpty() ? 1: 0;
                    sb.append(empty+"\n");
                    break;
                case "pop":
                    Integer item = queue.poll();
                    if(item == null){
                        sb.append("-1"+"\n");
                    }else{
                        sb.append(item+"\n");
                    }
                    break;
            } 
        }

        System.out.println(sb);
    }

}
