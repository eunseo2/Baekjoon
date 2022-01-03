package Bronze;

import java.util.Scanner;
 
public class 아스키코드 {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
        
        int num = in.next().charAt(0);
        
        System.out.println(num);
	}
}