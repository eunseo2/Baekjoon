package Silver;

import java.util.Arrays;
import java.util.Scanner;

public class 좌표정렬하기 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        int[][] arr = new int[T][2];


        for(int i=0; i<arr.length; i++){
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        //첫번째 기준 오름차순 >  두번째 기준 오름차순
        Arrays.sort(arr, (num1, num2) -> {
			return num1[0]!=num2[0] ? num1[0]-num2[0] : num1[1]-num2[1];
		});


        for(int i=0; i<arr.length; i++){
            for(int j=0; j<2; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
