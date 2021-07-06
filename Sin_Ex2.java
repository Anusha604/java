package Arrays;
import java.util.*;
public class Sin_Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter  "+n+" values: ");
		for(int  i = 0; i<n; i++ )
		{
			a[i] = sc.nextInt();
		}
		System.out.println("index:  even values:");
		for(int i=0 ; i<n; i++)
		{
			if(a[i]%2==0)
			System.out.println(i+"\t"+a[i]);
		}
	} }
