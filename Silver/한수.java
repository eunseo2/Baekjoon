package Silver;
import java.util.Scanner;

public class 한수 {

    public static boolean check(int num){
        
        String s  = Integer.toString(num);
        if(s.length() == 1 || s.length() == 2){
            return true;
        }

        int a = s.charAt(2)- s.charAt(1);
        int b = s.charAt(1)- s.charAt(0);

        if (a == b)  {
            return true;
        }

        return false;
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int cnt =0;

        for(int i=1; i<=num; i++){
            if(check(i)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
    
}
