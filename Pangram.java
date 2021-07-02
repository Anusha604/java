package Strings;
import java.util.*;
public class Pangram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence : ");
		String str = sc.nextLine();
		 int f = 1;
		 if(str.length() < 26)
			 f = 0 ;
		 else
		 {
			for(char ch = 'a' ; ch <='z'; ch++)
			{
				if(str.indexOf(ch)<0)
				{
				f = 0;
				break;
			}
		 }
      }
	
	if (f==1)
		System.out.println("pangram");
		else
			System.out.println(" Not a pangram");
		 }

}

