package Numbers;
import java.util.*;
public class Strong {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = obj.nextInt();
		int fact,rem,sum = 0 , temp = n;
		while(n!=0)
		{
			fact = 1;
			rem = n%10;
			int i = 1;
			while(i<= rem)
			{
				fact = fact*i;
				i++;
			}
			sum = sum+fact;
			n = n/10;
		}
		if (sum == temp)
			System.out.println(temp+ " is a Strong Number ");
		else
			System.out.println(temp+ " is Not a Strong Number ");
	}}
