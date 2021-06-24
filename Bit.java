package Numbers;
import java.util.*;
public class Bit {
	public static void main(String[] args) {
		int num = 77;
		int c = 0;
		while(num != 0)
		{
			int r = num%2;
			num = num/2;
			c = c+1;
			if(c==4)
				System.out.println(r);
		}

	}

}
