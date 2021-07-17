package patterns;

public class Pattern47 {
	public static void main(String[] args) {
		for(int i = 5; i >= 1; i--)
		{
			for( int j = 5; j > i; j--) 
			{
				System.out.print(" ");
			}
			for(int n=1; n <= i;n++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
} }



