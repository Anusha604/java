package Strings;
import java.util.*;
public class Reverse_str {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			char ch[] = str.toCharArray();
			String rev = "";
			for(int i = ch.length-1;i>=0;i--)
			{
				rev = rev+ch[i];
			}
			System.out.println("reversed string = "+rev);
		
	}

}
