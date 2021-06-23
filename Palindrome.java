package Numbers;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = obj.nextInt();
		int rev = 0,rem;
		int x = num;
		while(num !=0)
		{
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		if(x==rev)
			System.out.println(x+ " is a Palindrome Number ");
		else
			System.out.println(x+ " is not a Palindrome Number ");
	}

}
