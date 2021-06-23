package Numbers;
import java.util.*;
public class FULL_NUMBER {
public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	System.out.println("enter number: ");
	int num = obj.nextInt();
	int n = num;
	int f = 1,d;
	while(num != 0)
	{
		d = num%10;
		num=num/10;
		if (n%2==0 && d%2==1)
		{
			f = 2;
			break;
		}
		else if (n%2==1 && d%2==0)
		{
			f = 2;
			break;
		}}
	if(f==1 && n%2==0)
		System.out.println("FULL EVEN NUMBER");
	else if (f==1 && n%2==1)
		System.out.println("FULL ODD NUMBER");
	else
		System.out.println("MIXED NUMBER");
}
		

	}

