package patterns;

public class Pattern36 {
		public static void main(String[] args) {
			for(int i = 1; i <= 5; i++) // 5 rows -> 1 2 3 4 5
			{
				for( int j = 4; j >= i; j--) // 4 3 2 1 0
				{
					System.out.print(" ");
				}
				for(int n=1; n <= i;n++) // 1 2 3 4 5 stars
				{
					System.out.print("*");
				}
				System.out.println();
			}
	} }



