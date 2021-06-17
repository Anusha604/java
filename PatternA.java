package pattern;

public class PatternA {
	public static void main(String[] args){
		
		for (int i = 1; i<=5; i++)//5 ROWS(RIGHT)
		{
			for (int j = 1; j<=5; j++)// 5 COLOUMS(LINE)
			{
				System.out.print((char)(i+64));
			}
		    System.out.println();
		}

		}}


