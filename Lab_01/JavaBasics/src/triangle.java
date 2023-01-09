import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Input n: ");
		int n = keyboard.nextInt();
		for(int i=1;i<=n;i++)
			{for(int j=1;j<=n-i;j++)
		System.out.print(" ");
			for(int k=n-i+1;k<=n+i-1;k++)
		System.out.print("*");
		    for(int q=1;q<=n-i;q++)
		System.out.print(" ");
		    System.out.println();}		
	}

}
