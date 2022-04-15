package Bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class 큰수구하기1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    BigInteger A = in.nextBigInteger();
    BigInteger B = in.nextBigInteger();

    System.out.println(A.add(B));
  }
}
