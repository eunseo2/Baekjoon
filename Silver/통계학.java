package Silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class 통계학 {
    static int T;

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int[] check = new int[8001];
        
        T = in.nextInt();

        for(int i=0; i<T; i++) {
            list.add(in.nextInt());
            check[list.get(i)+4000]++;
        }

        double average = list.stream().mapToInt(x -> x).average().orElse(0.0);
        System.out.println(Math.round(average));

    
        Collections.sort(list);
        System.out.println(list.get(T/2));

        System.out.println(mode(list));


        int min = list.stream().mapToInt(x -> x).min().orElse(0);
        int max = list.stream().mapToInt(x -> x).max().orElse(0);
        System.out.println(max-min);


    }

    public static int mode(List<Integer> list){
        Map<Integer, Integer> map = new HashMap<>();

        if(T ==1){
            return list.get(0);
        }
        for(int i = 0; i < list.size(); i++){
            if(map.containsKey(list.get(i))){
                map.put(list.get(i), map.get(list.get(i))+1);
            }else{
                map.put(list.get(i),1);
            }
        }

        int maxValue = Collections.max(map.values());
        ArrayList<Integer> array = new ArrayList<>();

        for(Integer key : map.keySet()){
            Integer value = map.get(key);
            if(value == maxValue){
                array.add(key);
            }
        }

        Collections.sort(array);

        if(array.size()>1) return array.get(1);


        return array.get(0);
    }
    
}
