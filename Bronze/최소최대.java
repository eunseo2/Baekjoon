package Bronze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 최소최대 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<T; i++){
            list.add(scanner.nextInt());
        }

        Collections.sort(list);
        System.out.print(list.get(0)+" ");
        System.out.print(list.get(list.size()-1));
    }
    
}
