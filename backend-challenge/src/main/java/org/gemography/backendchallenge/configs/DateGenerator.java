package org.gemography.backendchallenge.configs;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateGenerator {

	public static  String convertDate(String date)  {
		Date dateGenerated;
		try {
			dateGenerated = new SimpleDateFormat("yyyy-MM-dd").parse(date);
			Instant before30Days = dateGenerated.toInstant().minus(30,ChronoUnit.DAYS);
			Date myDate = Date.from(before30Days);
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String formattedDate = formatter.format(myDate);
			
			return formattedDate;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		return "null";
		
	}
	
}
