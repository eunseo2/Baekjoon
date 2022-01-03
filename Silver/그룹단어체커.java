package Silver;

import java.util.Scanner;

public class 그룹단어체커 {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int cnt = 0; 
		
		for (int i = 0; i < T; i++) {
			String str = sc.next();
			boolean check[] = new boolean[26]; 
			boolean group = true; 
			
			for (int j = 0; j < str.length(); j++) {
				int index = str.charAt(j)-'a';

				if(check[index]) { 
					if(str.charAt(j) != str.charAt(j-1)) { 
						group = false; 
						break;
					}
				}else { 
					check[index] = true; 
				}
                
			}
			if(group) cnt++;
		}
		
		System.out.println(cnt);
	}
}