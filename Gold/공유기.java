package Gold;

import java.util.Arrays;
import java.util.Scanner;

public class 공유기 {
  static long result;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int C = in.nextInt();

    long[] houses = new long[N];
    for(int i=0; i<N; i++){
      houses[i] = in.nextLong();
    }

    Arrays.sort(houses);

    long start = 1;
    long end = houses[N-1] - start;

    while(start <= end){
      int cnt = 1;
      long mid = (start + end) / 2;
      long value = houses[0];

      for(long house : houses){
        if(house >= value+mid){
          value = house;
          cnt++;
        }
      }

      if(cnt >= C) {
        start = mid+1;
        result = mid;
      }
      else end = mid-1;
    }

    System.out.println(result);
  }
}
