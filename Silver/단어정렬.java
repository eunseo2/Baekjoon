package Silver;

import java.util.Arrays;
import java.util.Scanner;

public class 단어정렬 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String arr[] = new String[N];


        for(int i = 0; i < N; i++){
            String str = in.next();
            arr[i] = str;
        }


         Arrays.sort(arr,(s1,s2)->{
             if(s1.length() == s2.length()){
                return s1.compareTo(s2);
             }else{
                return s1.length() - s2.length();
             }
         });


         for(int i = 0; i <arr.length; i++){
             if(i>=1){
                if(!arr[i-1].equals(arr[i])){
                    System.out.println(arr[i]);
                }
             }else{
                 System.out.println(arr[i]);
             }
         }
    
    }
    
}
