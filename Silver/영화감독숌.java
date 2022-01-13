package Silver;

import java.util.Scanner;

public class 영화감독숌 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int cnt = 1;
        int i = 666;

        while(cnt != N){
            i++;
            String str = Integer.toString(i);
            if( str.contains("666")) cnt++;
        }

        System.out.println(i);
    }
}
