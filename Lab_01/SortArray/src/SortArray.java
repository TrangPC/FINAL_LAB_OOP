import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		int sum = 0;
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input number of elements: ");
		int n = keyboard.nextInt();
		int array[] = new int[n];
		System.out.println("Input array:");
		for (int i=0;i<n;i++)
			{
			array[i]= keyboard.nextInt();
			sum = sum + array[i];
			}
		System.out.println("Sorted array:");
		Arrays.sort(array);
		for (int i=0;i<n;i++) System.out.print(array[i]+ " ");
		System.out.println("\nSum is: "+ sum);
		System.out.println("Avarage is: "+ (double)((double)sum/n));
			}		
	}

