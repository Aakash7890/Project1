package study;

import java.sql.Date;
import java.util.GregorianCalendar;

public class DateExample {
	
	
	public static void main(String[] args) {
		
		GregorianCalendar gc= new GregorianCalendar();
		long timeissecs = gc.getTimeInMillis();
		
		GregorianCalendar republicDay = new GregorianCalendar(2022, 0, 26);
		
		java.sql.Date date = new Date(republicDay.getTimeInMillis());
		
		
		
	}

}
