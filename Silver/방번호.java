package Silver;

import java.util.Arrays;
import java.util.Scanner;

public class 방번호 {
    public static void main(String[] args) {
        boolean set[] = new boolean[10];
        int setCount[] = new int[10];

        Scanner in = new Scanner(System.in);
        int cnt = 0;

        String roomNum = in.next();
        for(int i=0; i<roomNum.length(); i++) {
            int idx = roomNum.charAt(i)-'0';

            if(set[idx]){
                if(idx == 6 && !set[9]){
                    set[9] = true;
                    setCount[9] +=1;
                    continue;
                }else if(idx == 9 && !set[6]){
                    set[6] = true;
                    setCount[6] +=1;
                    continue;
                }

                set = new boolean[10];
                set[idx] = true;
                setCount[idx] +=1;

            }else{
                set[idx] = true;
                setCount[idx] +=1;
            }
        }

        System.out.println(Arrays.stream(setCount).max().getAsInt());
    }
}
