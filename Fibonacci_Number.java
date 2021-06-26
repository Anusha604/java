package Numbers;
import java.util.*;
public class Fibonacci_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		int t1 = 0, t2 = 1, sum =0;
		while(sum < n)
		{
			sum = t1+t2;
			t1 = t2;
			t2 = sum ;
		}
   if(sum == n)
	   System.out.println("Fibonacci Number ");
   else
	   System.out.println("Not Fibonacci Number ");
	}

}
