package Polyland;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class processClass {
	typeClass tp;
	static ArrayList<String> ArrayOneRec = new ArrayList <String>();
	
	public int calcAge(String CustomerIDNumber) {
		int customerYear = Integer.parseInt(CustomerIDNumber.substring(0, 2));
		int customerMonth= Integer.parseInt(CustomerIDNumber.substring(2, 4));
		int customerDay = Integer.parseInt(CustomerIDNumber.substring(4, 6));
		String customerSex = CustomerIDNumber.substring(6, 7);
		int age = 0;
		
		Calendar cl = Calendar.getInstance();
		int year = cl.get(Calendar.YEAR);
		int month = cl.get(Calendar.MONTH);
		int day = cl.get(Calendar.DATE);
		
		if (customerYear >= year - 2000) {
			customerYear += 1900;
			age = year - customerYear;
		} else if (customerYear < year - 2000){
			customerYear += 2000;
			age = year - customerYear;
		}
		
		if (customerMonth > month && customerDay > day) {
			age -= 1;
		}
		
		if(customerSex.equals("1") && customerSex.equals("3")) {
			tp.finalSex = "남성";
		} else if(customerSex.equals("2") && customerSex.equals("4")) {
			tp.finalSex = "여성";
			
		}
		System.out.println(age);
		return age;
	}
	
	public int priceAge(int age, int ticketSelect, int orderCount) {

		int price = 0;
		if (age >= 19 && age <= 64 && ticketSelect == 1) {
			price = valueClass.ADULT_DAY_PRICE;
			tp.finalAge = "성인";
		} else if (age >= 19 && age <= 64 && ticketSelect == 2) {
			price = valueClass.ADULT_NIGHT_PRICE;
			tp.finalAge = "성인";
		} else if (age >= 13 && age <= 18 && ticketSelect == 1) {
			price = valueClass.TEEN_DAY_PRICE;
			tp.finalAge = "청소년";
		} else if (age >= 13 && age <= 18 && ticketSelect == 2) {
			price = valueClass.TEEN_NIGHT_PRICE;
			tp.finalAge = "청소년";
		} else if (age >= 3 && age <= 12 && ticketSelect == 1) {
			price = valueClass.CHILD_DAY_PRICE;
			tp.finalAge = "소인";
		} else if (age >= 3 && age <= 12 && ticketSelect == 2) {
			price = valueClass.CHILD_NIGHT_PRICE;
			tp.finalAge = "소인";
		} else if (age <= 65 && ticketSelect == 1) {
			price = valueClass.OLD_DAY_PRICE;
			tp.finalAge = "경로";
		} else if (age <= 65 && ticketSelect == 2) {
			price = valueClass.OLD_NIGHT_PRICE;
			tp.finalAge = "경로";
		} else {
			price = 0;
			tp.finalAge = "유아";
		}
		System.out.println(price * orderCount);
		return price * orderCount;
	}
	
	public double priceDiscount(int price, int discountSelect) {

		double totalprice = 0;
		
		if (discountSelect == 1) {
			totalprice = price;
		} else if (discountSelect == 2) {
			totalprice = price * valueClass.DISABLED_DISCOUNT_RATE;
		} else if (discountSelect == 3) {
			totalprice = price * valueClass.MERIT_DISCOUNT_RATE;
		} else if (discountSelect == 4) {
			totalprice = price * valueClass.MULTICHILD_DISCOUNT_RATE;
		} else if (discountSelect == 5) {
			totalprice = price * valueClass.PREGNANT_DISCOUNT_RATE;
		}
		tp.finalTotalPrice = String.valueOf(totalprice);
		System.out.println(totalprice);
		return totalprice;
	}

	
	public void saveFinalTicket() {
		ArrayOneRec.add(tp.finalDayTicket);
		ArrayOneRec.add(tp.finalAge);
		ArrayOneRec.add(tp.finalOrderCount);
		ArrayOneRec.add(tp.finalTotalPrice);
		ArrayOneRec.add(tp.finalDiscountSelect);
	}
	
	public void printFinalTicket() {
		typeClass tp;
		for(int i = 0; i < ArrayOneRec.size(); i += 5) {
			for(int j = i; j < i + 5; j++) {
				System.out.println(ArrayOneRec.get(j));
			}
		}

		
	}

}
