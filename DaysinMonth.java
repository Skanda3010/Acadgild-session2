import java.util.Scanner;


public class DaysinMonth {

	public static void main(String[] args) {
		
		DaysofMonth();
	}
	
	public static void DaysofMonth () {
		int Month;
		int Year;
			
		System.out.println("Enter the number of the month you wish to get the total number of days: ");
		Scanner sc = new Scanner(System.in);
		Month = sc.nextInt();
		if(Month <= 12)
		{
		System.out.print("Enter the Year:\n");
		System.out.println();
		Year = sc.nextInt();
		
		switch(Month)
		{
			case 1: System.out.println("Number of days in Jan is 31!");
						  break;
			case 2: 
				if((Year%4) == 0)
					System.out.println("Number of days in Feb is 29");
				else
					System.out.println("Number of days in Feb is 28");
				
				break;
				
			case 3: System.out.println("Number of days in Mar is 31");
			  		break;
			 
			case 4: System.out.println("Number of days in Apr is 30");
	  		  		break;
	  		
			case 5: System.out.println("Number of days in May is 31");
	  		  		break;
	  		
			case 6: System.out.println("Number of days in Jun is 30");
	  		  		break;
	  		
			case 7: System.out.println("Number of days in Jul is 31");
	  		  		break;
	  		
			case 8: System.out.println("Number of days in Aug is 31");
	  		  		break;
	  		
			case 9: System.out.println("Number of days in Sep is 30");
	  		  		break;
	  		
			case 10: System.out.println("Number of days in Oct is 31");
	  		  		break;
	  		
			case 11: System.out.println("Number of days in Nov is 30");
	  		  		break;
	  		
			case 12: System.out.println("Number of days in Dec is 31");
	  		  		break;
		}
		}
		else
			System.out.println("Enter a valid month number");
	}

}
