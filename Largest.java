package statements;
import java.util.*;
public class Largest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number and Digit");
		int number = sc.nextInt();//145
		int digit = sc.nextInt();//4
		// convert digit to char
		char c = Integer.toString(digit).charAt(0);
		int i ;
		for(i = number; i>0; i--)
		{
			if(Integer.toString(i).indexOf(c)== -1)
			{
				System.out.println(i);
				break;
			}
		}
		if(i==0)
			System.out.println("-1");

	}

}
