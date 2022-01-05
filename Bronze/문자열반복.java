package Bronze;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class 문자열반복 {
    public static void main(String[] args) throws IOException {
 
		Scanner in = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = in.nextInt();
        
        for(int i=0; i<T; i++){
            int n = in.nextInt();
            String str = in.next();
            
            for(int k=0; k<str.length(); k++){
                for(int j=0; j<n; j++){
                    bw.write(str.charAt(k));
                }
            }

            bw.write("\n");
           
        }
        
        bw.flush();
     
	}
    
}
