import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class DateTime 
{
	public static void main(String[] args)
	{
		System.out.println("1. LocalDateTime is best to be used to store date and seconds");
		getLastThursday(LocalDate.now());
		System.out.println("3. ZoneOffset inhereits ZoneID and it only tracks offset for UTC, ZoneID does it "
				+ "for a particular region");
		ZonedDateTime time = ZonedDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
		Instant time2 = ZonedDateTime.now().toInstant();
		
		monthsLengthInYear();
		mondaysInMonth();
		fridayTheThriteen();
		
		
		
	}
	
	private static void getLastThursday(LocalDate d)
	{
		System.out.println( "Last Thursday: "+d.with( TemporalAdjusters.previous(DayOfWeek.THURSDAY)) );
	}
	
	private static void monthsLengthInYear()
	{
		int year = 0;
		
		Scanner scan = new Scanner(System.in);
		
		try 
		{
			System.out.print("\nPlease enter Year:");
			year = scan.nextInt();
			Year yearCheck = Year.of(year);
			for(Month month: Month.values())
			{
				System.out.println("Month: "+month+" Length: "+
				YearMonth.of(year, month).lengthOfMonth());
			}
		}
		catch(Exception e)
		{
			System.out.print("Invalid Year Entry");
			monthsLengthInYear();
		}
	}
	
	private static void mondaysInMonth()
	{
		int month = 0;
		
		Scanner scan = new Scanner(System.in);
		
		try 
		{
			System.out.print("\nPlease enter Month:");
			month = scan.nextInt();
			Month monthCheck = Month.of(month);
			LocalDate date = Year.now().atMonth(month).atDay(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
			Month currentMonth = date.getMonth();
			System.out.println("Mondays in " + monthCheck.name());
			while(currentMonth.equals(monthCheck))
			{
				System.out.println(monthCheck.getValue()+"/"+date.getDayOfMonth());
				date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
				currentMonth = date.getMonth();
			}
		}
		catch(Exception e)
		{
			System.out.print("Invalid Month Entry");
			mondaysInMonth();
		}
		
		
	}
	
	private static void fridayTheThriteen()
	{
		int month = 0,date = 0, year = 0;
		
		Scanner scan = new Scanner(System.in);
		
		try 
		{
			System.out.print("\nPlease enter Year:");
			year = scan.nextInt();
			Year yearCheck = Year.of(year);
			System.out.print("\nPlease enter Month:");
			month = scan.nextInt();
			Month monthCheck = Month.of(month);
			System.out.print("\nPlease enter Date:");
			date = scan.nextInt();
			LocalDate dateCheck = LocalDate.of(year, month, date);
			
			if(dateCheck.getDayOfWeek() == DayOfWeek.FRIDAY && date == 13)
				System.out.print("\nDate:"+dateCheck.toString() + "\nIs Friday the 13th");
			else
				System.out.print("\nDate:"+dateCheck.toString() + "\nIs NOT Friday the 13th");
		}
		catch(Exception e)
		{
			System.out.print("Invalid Date Entry");
			fridayTheThriteen();
		}
		
		
	}

}
