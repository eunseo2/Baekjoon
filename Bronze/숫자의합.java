package Bronze;
import java.util.Scanner;

public class 숫자의합 {
    public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
        
        int count = in.nextInt();
        int sum=0;
        
        String str = in.next();
        
        for(int i=0; i<count; i++){
            sum += str.charAt(i)-'0';
        }
        
        System.out.println(sum);
	}
    
}
