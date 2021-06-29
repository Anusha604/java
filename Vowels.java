package Strings;

import java.util.Scanner;
import java.util.*;
public class Vowels {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int vowels = 0,consonants=0,digits=0,spaces=0,sp=0;
		str = str.toLowerCase();
		for(int i = 0;i<str.length(); i++)
		{
			char ch= str.charAt(i);
			if(ch == 'a'|| ch=='e'||ch=='i'||ch=='o'||ch == 'u')
				vowels = vowels+1;
			else if ((ch >='a' && ch <='z'))
				consonants = consonants+1;
			else if(ch >= '0' && ch <='9')
				digits= digits+1;
			else if (ch == ' ')
				spaces = spaces+1;
			else
				sp = sp+1;
		}
		System.out.println("vowels = "+vowels);
		System.out.println("consonants = "+consonants);
		System.out.println("digits = "+digits);
		System.out.println("spaces = "+spaces);
		System.out.println("special characters = "+sp);	
	}

}
