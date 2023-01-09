import java.util.Scanner;

public class Add2matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Suppose size of matric is m*n.");
		System.out.println("Input m: ");
		int m = keyboard.nextInt();
		System.out.println("Input n: ");
		int n = keyboard.nextInt();
		int [][]matric1 = new int[m][n];
		System.out.println("Input matric 1: ");
		for (int i= 0;i<m;i++)
			{for (int j= 0; j<n;j++)
				matric1[i][j] = keyboard.nextInt();
			}
		int [][]matric2 = new int[m][n];
		System.out.println("Input matric 2: ");
		for (int i= 0;i<m;i++)
		{for (int j= 0; j<n;j++)
			matric2[i][j] = keyboard.nextInt();
		}
		
		int[][] sum = new int[m][n];
		System.out.println("Add 2 matrices: ");
		for (int i= 0;i<m;i++)
		{for (int j= 0; j<n;j++)
			sum[i][j]= matric1[i][j]+matric2[i][j];
		}
		
		for (int i= 0;i<m;i++)
		{for (int j= 0; j<n;j++)
			System.out.print(sum[i][j]+" ");
		System.out.println();
		}
		
		
				
		
	}

}
