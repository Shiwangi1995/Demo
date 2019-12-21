package Interview;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatetoString {

	public static void main(String[] args) {
		Date date=Calendar.getInstance().getTime();
		DateFormat dateFormat=new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
		String strdate=dateFormat.format(date);
		System.out.println(strdate);
		
	}

}
