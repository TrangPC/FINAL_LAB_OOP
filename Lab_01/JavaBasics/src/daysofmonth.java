import java.util.Scanner;

public class daysofmonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input month: ");
		String month = keyboard.nextLine();
		System.out.println("Input year: ");
		int year = keyboard.nextInt();
		switch (month)
		{
		case "1":case "Jan":case "Jan.":case "January": System.out.println("31 days"); break;
		case "3":case "Mar":case "Mar.":case "March": System.out.println("31 days"); break;
		case "4":case "Apr":case "Apr.":case "April": System.out.println("30 days"); break;
		case "5":case "May":case "May.": System.out.println("31 days"); break;
		case "6":case "Jun":case "Jun.":case "June": System.out.println("30 days"); break;
		case "7":case "Jul":case "Jul.":case "July": System.out.println("31 days"); break;
		case "8":case "Aug":case "Aug.":case "August": System.out.println("31 days"); break;
		case "9":case "Sep":case "Sep.":case "September": System.out.println("30 days"); break;
		case "10":case "Oct":case "Oct.":case "October": System.out.println("31 days"); break;
		case "11":case "Nov":case "Nov.":case "November": System.out.println("30 days"); break;
		case "12":case "Dec":case "Dec.":case "December": System.out.println("31 days"); break;
		case "2":case "Feb":case"Feb.":case"February":
			if(year %400==0) System.out.println("29 days");
		else if (year %100 ==0) System.out.println("28 days");
		else if (year %4 ==0) System.out.println("29 days");
		else System.out.println("28 days");
			break;
		}
		
	}

}
