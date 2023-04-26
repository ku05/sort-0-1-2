import java.math.BigInteger;
import java.util.*;

public class largest_Factorial {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n :");
    int n=sc.nextInt();
      
      BigInteger factorial = BigInteger.valueOf(1);

      for (int i = 2; i <= n; i++) {
         factorial = factorial.multiply(BigInteger.valueOf(i));
      }

      System.out.println("Factorial of " + n + " is: " + factorial);
   }
}
