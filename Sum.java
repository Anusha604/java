package Numbers;
import java.util.*;
public class Sum {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = obj.nextInt();
		int sum = 0, rem;
		while(n!=0)// n = 1234
		{//to identify last digit
			rem = n%10;// n = 1234%10 = 4
			// to do a sum
					sum= sum+rem;
			// to eliminate last digit
					n = n/10;
		}
		System.out.println("Sum of Digits is : "+sum);

	}

}
