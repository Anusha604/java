package Numbers;
import java.util.*;
public class Fibonacci_series {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		int t1 = 0, t2 = 1 ;
		  System.out.println("Fibonacci Series: ");
		  System.out.print(t1+" "+ t2);
		  for(int i = 3; i<= n; i++)
		  {
			  int sum = t1+t2;
			  System.out.print(" " +sum);
			  t1= t2;
			  t2 = sum;
		  }
	}

}
