package Silver;

public class 셀프넘버 {

    public static int check(int num){
        int sum=0;
        sum += num; 

        while(true){
            if(num == 0 || sum >= 10000) break; 

            sum += num %10; 
            num /= 10;
        }

        return sum;
    }
 
    public static void main(String[] args){

        boolean [] arr = new boolean[10001];


        for(int i=1; i<=10000; i++){
            if(check(i) <= 10000 ){
                arr[check(i)] = true;  
            }
        }

        for(int i=1; i<=10000; i++){
            if(!arr[i]) System.out.println(i);
        }

    }
    
}
