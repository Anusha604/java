package Numbers;
import java.util.*;
public class Prime {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = obj.nextInt();
		int flag = 1;
		if(n==0|| n ==1)
			System.out.println(n+" is not prime number");
		else
		{
			for(int i = 2; i < n/2; i++ )
			{
				if (n%i==0)
				{
					System.out.println(n+" is not prime number");
					flag = 0;
					break;
				}
			}
			if (flag == 1)
				System.out.println(n+" is prime number");				
		}
} }