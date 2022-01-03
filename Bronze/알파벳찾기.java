package Bronze;
import java.util.Scanner;

public class 알파벳찾기 {
    public static void main(String[] args) {
		 
        char[] arr = new char[26];
        for(int i=0;i<arr.length;i++){
           arr[i] = (char)(97+i);
        }

        Scanner in = new Scanner(System.in);
        
        int cnt = 0; 
        String str = in.next();


       for(int i=0; i< arr.length; i++){
           cnt = 0;
           for(int j=0; j<str.length(); j++){
               if(arr[i] == str.charAt(j)){
                   cnt++;
                   System.out.print(j+" ");
                   break;
               }
           }

           if(cnt == 0){
            System.out.print("-1 ");
           }
        
       }

   }
    
}
