package Arrays;
import java.util.*;
public class Mat_Add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size: ");
		int r = sc.nextInt();
		System.out.println("Enter col size:");
		int c = sc.nextInt();
		int a[][] = new int[r][c];
		int b[][] = new int[r][c];
		int sum[][] = new int [r][c];
		System.out.println("Enter elements in Maatrix-A:");
		for(int i=0; i<r; i++)
		{
			for(int j = 0; j<c; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Elements in Matrix-B:");
		for(int i = 0; i<r; i++)
		{
			for(int j=0; j<c ; j++)
			{
				b[i][j]= sc.nextInt();
				}
		}
		System.out.println("Sum of 2 matrices is :");
		for(int i = 0; i<r; i++)
		{
			for(int j = 0 ;j<c; j++)
			{
				sum[i][j]= a[i][j]+b[i][j];
				System.out.printf("%2d ",sum[i][j]);
			}
			System.out.println();
		}
	}

}
