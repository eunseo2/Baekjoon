package Silver;

import java.util.Scanner;

public class 연산자끼워넣기 {

    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int arr[];
    static int operator[];
    static int N;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        N = in.nextInt();

        arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = in.nextInt();
        }

        operator = new int[4];
        for(int i=0; i<operator.length; i++){
            operator[i] = in.nextInt();
        }

        dfs(arr[0],1);

        System.out.println(max);
        System.out.println(min);
    }

    public static void dfs(int num, int index){
        if(index == N){
            min = Math.min(num,min);
            max = Math.max(num,max);
            return;
        }

        for(int i=0; i<4; i++){
            if(operator[i] >0){
                operator[i]--; 
                switch(i){
                    case 0 : dfs(num+arr[index], index+1); break;
                    case 1 : dfs(num-arr[index], index+1); break;
                    case 2 : dfs(num*arr[index], index+1); break;
                    case 3 : dfs(num/arr[index], index+1); break;
                }
                operator[i]++;
            }
        }
    }
    
}
