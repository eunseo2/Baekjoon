package Silver;

import java.util.Scanner;

public class 뒤집기 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();

        int cnt0 = 0;
        int cnt1 = 0;

        if(str.charAt(0)-'0' == 0){
            cnt0++;
        }else{
            cnt1++;
        }


        for(int i=1; i<str.length(); i++){
            if(str.charAt(i-1)!= str.charAt(i)){
                if(str.charAt(i)-'0' == 0){
                    cnt0++;
                }else cnt1++;
            }
        }
        

        System.out.println(Math.min(cnt0, cnt1));
    }
}
