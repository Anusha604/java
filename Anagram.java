package Strings;
import java.util.*;
public class Anagram {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 2 Strings: ");
		String str1 = sc.next();
		String str2 = sc.next();
		boolean f = true;
		
		if(str1.length()!= str2.length())
			f= false;
		else
		{
			char s1[] = str1.toCharArray();
			char s2[] = str2.toCharArray();
			Arrays.sort(s1);
			Arrays.sort(s2);	
			f = Arrays.equals(s1 ,  s2);
		}
		if(f)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}

}
