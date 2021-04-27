package Polyland;

import java.util.ArrayList;
import java.util.Scanner;

public class inputClass {
	
	Scanner scanner = new Scanner(System.in);
	outputClass opc = new outputClass(); 
	static typeClass tp = new typeClass();
	
	public int inputTicketSelect() {
		
		int ticketSelect = 0;
		System.out.println("권종을 선택해주세요.");
		System.out.println("1. 주간권");
		System.out.println("2. 야간권");
		ticketSelect = scanner.nextInt();
		
		if (ticketSelect == 1) {
			System.out.println("주간권을 선택하셨습니다.\n");
			tp.finalDayTicket = "주간권";
		} else if (ticketSelect == 2){
			System.out.println("야간권을 선택하셨습니다.\n");
			tp.finalDayTicket = "야간권";
		} else {
			opc.printErrorMassage();
			inputTicketSelect();
		}
		
		return ticketSelect;
		
	}
	
	public String inputCustomerIDNumber() {

		String CustomerIDNumber;
		System.out.println("주민번호를 입력해주세요.( - 없이 13자리를 입력해주세요)");
		CustomerIDNumber = scanner.next();
		if (CustomerIDNumber.length() == 13) {
			 
		} else {
			opc.printErrorMassage();
			inputCustomerIDNumber();
		}

		return CustomerIDNumber;
	}
	
	public int inputOrderCount() {

		int orderCount = 0;
		System.out.println("\n주문 개수를 입력해주세요.");
		orderCount = scanner.nextInt();
		tp.finalOrderCount = String.valueOf(orderCount);

		return orderCount;
	}
	
	public int inputDiscountSelect() {

		int discountSelect = 0;
		
		System.out.println("\n우대사항을 입력해주세요.");
		System.out.println("1. 없음 (나이우대는 자동적용됩니다.)");
		System.out.println("2. 장애인우대.");
		System.out.println("3. 국가유공자우대.");
		System.out.println("4. 다자녀우대.");
		System.out.println("5. 임산부우대.");
		discountSelect = scanner.nextInt();
		
		switch (discountSelect) {
		case 1:
			tp.finalDiscountSelect = "*선택사항 없음";
			break;
		case 2: 
			System.out.println("장애인우대를 선택하셨습니다.\n");
			tp.finalDiscountSelect = "*장애인 우대";
			break;
		case 3:
			System.out.println("국가유공자우대를 선택하셨습니다.\n");
			tp.finalDiscountSelect = "*국가유공자 우대";
			break;
		case 4:
			System.out.println("다자녀우대를 선택하셨습니다.\n");
			tp.finalDiscountSelect = "*다자녀 우대";
			break;
		case 5:
			System.out.println("임산부우대를 선택하셨습니다.\n");
			tp.finalDiscountSelect = "*임산부 우대";
			break;
		default :
			opc.printErrorMassage();
			inputDiscountSelect();
		}
		return discountSelect;
	}
	
	public int printContinue() {
		System.out.println("계속 발권 하시겠습니까?");
		System.out.println("1. 티켓 발권");
		System.out.println("2. 종료");
		int select = scanner.nextInt();
		
		return select;
	}
	
	public int checkNewOrder() {
		System.out.printf("계속 진행 (1: 새로운 주문, 2: 프로그램 종료) : ");
		int check = scanner.nextInt();
		
		return check;
	}
	


}
