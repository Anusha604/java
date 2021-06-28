package Numbers;
import java.util.*;
public class Nearest_fiboNo {
	      
	static boolean fibo(int n)//5
	{
		int t1 = 0,t2 = 1, sum = 0;
		while(sum < n)// 0,1,1,2,3 ->t
		{
			sum = t1+t2;//2
			t1 = t2;
			t2 = sum;
		}
		if(sum  ==  n)
		   return true;// 5
		else
			return false;// 6
		}
	static int beforeFibo(int n)
	{
		int c =  0;
		while (true)
		{
			if(fibo(n))
				return c;
			else
			{
				n = n-1;
				c++;
			}
		}
	}
	static int afterFibo(int n)
	{
		int c = 0;
		while(true)
		{
			if(fibo(n))
				return c;
			else
			{
				n = n+1;
			    c++;
		   }
	   }
	}  
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :" );
		int n = sc.nextInt();
		int m1 = beforeFibo(n);
		int m2 = afterFibo(n);
		if(m1>m2)
			System.out.println("Nearest fibo= " +(n+m2));
		else if (m2>m1)
			System.out.println("Nearest fibo= " +(n-m1));
		else if ((n-m1)==(n+m2))
			System.out.println("Nearest fibo= " +n);
		else if (m1 ==m2)
			System.out.println("Nearest fibo= "+(n-m1)+" " +(n+m2));
		
	}

}
