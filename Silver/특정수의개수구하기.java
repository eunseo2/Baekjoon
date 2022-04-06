package Silver;
import java.util.Scanner;

public class 특정수의개수구하기 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int x = in.nextInt();
        int arr[] = new int[N];
    
        for (int i = 0; i < N; i++) {
          arr[i] = in.nextInt();
        }
    
        //스트림 이용
        // long cnt = Arrays.stream(arr).filter(a -> a == x).count();

        //이진 탐색 이용 
        int cnt = countByRange(arr, x);
    
        if (cnt == 0) {
          System.out.println("-1");
        } else {
          System.out.println(cnt);
        }
    }

    public static int countByRange(int[] arr, int value){

        int left = leftIndex(arr, value, 0, arr.length-1);

        int right = rightIndex(arr, value, 0, arr.length-1);

        return right - left;
    }

    public static int leftIndex(int[] arr, int value, int start, int end){
        while(start < end){
            int mid = (start + end) / 2; 
            if(arr[mid] >= value) end = mid;
            else start = mid+1;
        }

        return end;
    }

    public static int rightIndex(int[] arr, int value, int start, int end){
        while(start < end){
            int mid = (start + end) / 2; 
            if(arr[mid] > value) end = mid;
            else start = mid+1;
        }

        return end;
    }
}
