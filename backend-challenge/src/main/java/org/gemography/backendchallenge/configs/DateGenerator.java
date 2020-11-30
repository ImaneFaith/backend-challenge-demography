package org.gemography.backendchallenge.configs;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

//convert date to give the client the 30 repositories from the date given
public class DateGenerator {

	public static String convertDate(String date) {
		Date dateGenerated;
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			dateGenerated = formatter.parse(date);
			Instant before30Days = dateGenerated.toInstant().minus(30, ChronoUnit.DAYS);
			Date requestedDate = Date.from(before30Days);
			String formattedDateRequested = formatter.format(requestedDate);

			return formattedDateRequested;
		}catch (ParseException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
		return "null";

	}

}
