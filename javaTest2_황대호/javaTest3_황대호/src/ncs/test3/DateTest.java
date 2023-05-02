package ncs.test3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTest {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		LocalDate date2 = LocalDate.of(1987, 5, 27);
		
		Period period = Period.between(date2, date);
		
		System.out.println("생일 : " + date2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL))); 
		System.out.println("현재 : " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG))); 
		System.out.printf("나이 : %d세\n",period.getYears());

			
	}
}