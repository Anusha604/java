package Numbers;
import java.util.*;
public class NthFibonacci_No {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		int t1 = 0, t2 = 1 , sum = t1+t2;
		for(int i = 4; i<=n ; i++)
		{
			t1 = t2;
			t2 = sum;
			sum = t1+t2;
			
		}
		System.out.print(sum);
		}

}
