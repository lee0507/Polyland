package Polyland;

import java.util.Calendar;
import java.util.Date;

public class processClass {
	
	public int calcAge(String CustomerIDNumber) {
		int customeryear = Integer.parseInt(CustomerIDNumber.substring(0, 2));
		int customermonth= Integer.parseInt(CustomerIDNumber.substring(2, 4));
		int customerday = Integer.parseInt(CustomerIDNumber.substring(4, 6));
		int age = 0;
		
		Calendar cl = Calendar.getInstance();
		int year = cl.get(Calendar.YEAR);
		int month = cl.get(Calendar.MONTH);
		int day = cl.get(Calendar.DATE);
		
		if (customeryear > year - 2000) {
			customeryear += 1900;
			age = year - customeryear;
		} else {
			age = year - customeryear;
		}
		
		if (customermonth > month && customerday > day) {
			age -= 1;
		}
		
		return age;
	}
	
	public void priceAge(int age) {
		age >
	}
}
