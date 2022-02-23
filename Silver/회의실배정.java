package Silver;

import java.util.Arrays;
import java.util.Scanner;

public class 회의실배정 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();


        int time[][] = new int[N][2];


        for(int i=0; i<N; i++){
            time[i][0] = in.nextInt();
            time[i][1] = in.nextInt();
        }

        Arrays.sort(time, (o1,o2)->{
            if(o1[1] == o2[1]){
                return o1[0] - o2[0];
            }

            return o1[1] - o2[1];
        });

        int prev_end_time = 0;
        int cnt = 0;

        for(int now[] : time){
            if(prev_end_time <= now[0]){
                prev_end_time = now[1];
                cnt++;
            }
        }

        System.out.println(cnt);

    }
    
}
