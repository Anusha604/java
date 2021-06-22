package Numbers;
import java.util.*;
public class Min_Max {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		int rem = 0 ,min = 9, max = 0;
		while(n != 0)// 43853
		{
			rem = n%10;// 4
			if(rem > max)
				max = rem;
			if (rem  < min)
				min = rem ;
			n = n/10;
		}
		System.out.println("Maximum digit = " +max);
		System.out.println("Minimum digit = " +min);

	}

}
