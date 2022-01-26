package Silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 소트인사이드 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<str.length(); i++) {
            list.add(str.charAt(i) - '0');
        }

        Collections.sort(list, Collections.reverseOrder());
       
        for(int i=0; i<list.size(); i++) {
           System.out.print(list.get(i));
       }
    }
    
}
