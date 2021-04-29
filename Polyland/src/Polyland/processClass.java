package Polyland;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class processClass {
	typeClass tp = new typeClass();
	static ArrayList<String> ArrayOneRec = new ArrayList <String>();
	
	public int calcAge(typeClass tp) {
		int customerYear = Integer.parseInt(tp.CustomerIDNumber.substring(0, 2));
		int customerMonth= Integer.parseInt(tp.CustomerIDNumber.substring(2, 4));
		int customerDay = Integer.parseInt(tp.CustomerIDNumber.substring(4, 6));
		String customerSex = tp.CustomerIDNumber.substring(6, 7);
		
		Calendar cl = Calendar.getInstance();
		int year = cl.get(Calendar.YEAR);
		int month = cl.get(Calendar.MONTH);
		int day = cl.get(Calendar.DATE);
		
		if (customerYear >= year - 2000) {
			customerYear += 1900;
			tp.age = year - customerYear;
		} else if (customerYear < year - 2000){
			customerYear += 2000;
			tp.age = year - customerYear;
		}

		if (customerMonth > month && customerDay > day) {
			tp.age -= 1;
		}
		
		if(customerSex.equals("1") || customerSex.equals("3")) {
			tp.finalSex = "남성";
		} else if(customerSex.equals("2") || customerSex.equals("4")) {
			tp.finalSex = "여성";
			
		}
		return tp.age;
	}
	
	public int priceAge(typeClass tp) {

		if (tp.age >= 19 && tp.age <= 64 && tp.ticketSelect == 1) {
			tp.price = valueClass.ADULT_DAY_PRICE;
			tp.finalAge = "성  인";
		} else if (tp.age >= 19 && tp.age <= 64 && tp.ticketSelect == 2) {
			tp.price = valueClass.ADULT_NIGHT_PRICE;
			tp.finalAge = "성  인";
		} else if (tp.age >= 13 && tp.age <= 18 && tp.ticketSelect == 1) {
			tp.price = valueClass.TEEN_DAY_PRICE;
			tp.finalAge = "청소년";
		} else if (tp.age >= 13 && tp.age <= 18 && tp.ticketSelect == 2) {
			tp.price = valueClass.TEEN_NIGHT_PRICE;
			tp.finalAge = "청소년";
		} else if (tp.age >= 3 && tp.age <= 12 && tp.ticketSelect == 1) {
			tp.price = valueClass.CHILD_DAY_PRICE;
			tp.finalAge = "소  인";
		} else if (tp.age >= 3 && tp.age <= 12 && tp.ticketSelect == 2) {
			tp.price = valueClass.CHILD_NIGHT_PRICE;
			tp.finalAge = "소  인";
		} else if (tp.age >= 65 && tp.ticketSelect == 1) {
			tp.price = valueClass.OLD_DAY_PRICE;
			tp.finalAge = "경  로";
		} else if (tp.age >= 65 && tp.ticketSelect == 2) {
			tp.price = valueClass.OLD_NIGHT_PRICE;
			tp.finalAge = "경  로";
		} else if(tp.age <= 2){
			tp.price = valueClass.BABY_PRICE;
			tp.finalAge = "유  아";
		}
		tp.priceorderCount = tp.price * tp.orderCount;
		return tp.priceorderCount;
	}
	
	public double priceDiscount(typeClass tp) {

		if (tp.discountSelect == 1) {
			tp.totalprice = tp.priceorderCount;
		} else if (tp.discountSelect == 2) {
			tp.totalprice = tp.priceorderCount * valueClass.DISABLED_DISCOUNT_RATE;
		} else if (tp.discountSelect == 3) {
			tp.totalprice = tp.priceorderCount * valueClass.MERIT_DISCOUNT_RATE;
		} else if (tp.discountSelect == 4) {
			tp.totalprice = tp.priceorderCount * valueClass.MULTICHILD_DISCOUNT_RATE;
		} else if (tp.discountSelect == 5) {
			tp.totalprice = tp.priceorderCount * valueClass.PREGNANT_DISCOUNT_RATE;
		}
		tp.finalTotalPrice = String.valueOf((int)tp.totalprice);
		tp.sumFinalTotalPrice += tp.totalprice;
		return tp.totalprice;
	}

	
	public void saveFinalTicket() {
		ArrayOneRec.add(tp.finalDayTicket);
		ArrayOneRec.add(tp.finalAge);
		ArrayOneRec.add(tp.finalOrderCount);
		ArrayOneRec.add(tp.finalTotalPrice);
		ArrayOneRec.add(tp.finalDiscountSelect);
	}
	
	public void printFinalTicket() {
		
		System.out.println("==================폴리랜드==================");
		for(int i = 0; i < ArrayOneRec.size(); i += 5) {
			System.out.printf("%3s %3s X%2s %5s원 %7s\n", ArrayOneRec.get(i), ArrayOneRec.get(i + 1), 
					ArrayOneRec.get(i + 2), ArrayOneRec.get(i + 3), ArrayOneRec.get(i + 4));

		}System.out.println("===========================================");
		System.out.printf("입장료 총액은 %s원 입니다.\n", tp.sumFinalTotalPrice);

	}
	
	public void resettypeClass() {
		ArrayOneRec.clear();
	}
	

}
