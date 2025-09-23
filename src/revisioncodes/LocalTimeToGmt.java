package revisioncodes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class LocalTimeToGmt {

	public static void main(String[] args) {
		Date localtime=new Date();
		DateFormat s= new SimpleDateFormat("dd/mm/yyyy"+" "+"HH:MM:SS");
		s.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println("Localtime : " + localtime);
		System.out.println("Time in GMT : " + s.format(localtime));
		
		
		// TODO Auto-generated method stub

	}

}
