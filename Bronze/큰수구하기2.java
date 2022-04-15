package Bronze;

import java.util.Scanner;

public class 큰수구하기2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String strA = in.next();
    String strB = in.next();

    int len = Math.max(strA.length(), strB.length());

    int a[] = new int[len+1];
    for(int i = strA.length()-1, idx =0; i>=0; i--,idx++){
      a[idx] = strA.charAt(i)-'0';
    }

    int b[] = new int[len+1];
    for(int i = strB.length()-1, idx =0; i>=0; i--,idx++){
      b[idx] = strB.charAt(i)-'0';
    }

    for(int i=0; i< len; i++){
      int value = a[i] + b[i];
      a[i] = value%10;
      a[i+1] += (value / 10);
    }

    StringBuilder sb = new StringBuilder();
    if(a[len] != 0) {
      sb.append(a[len]);
    }
    for(int i = len - 1; i >= 0; i--) {
      sb.append(a[i]);
    }

    System.out.println(sb);
  }
}
