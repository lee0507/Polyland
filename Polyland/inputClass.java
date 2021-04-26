package Polyland;

import java.util.Scanner;

public class inputClass {
	
	Scanner scanner = new Scanner(System.in);
	outputClass opc; 
	
	public int inputTicketSelect() {
		opc = new outputClass();
		
		int ticketSelect = 0;
		System.out.printf("권종을 선택해주세요.\n");
		System.out.printf("1. 주간권\n");
		System.out.printf("2. 야간권\n");
		ticketSelect = scanner.nextInt();
		
		if (ticketSelect == 1) {
			System.out.println("주간권을 선택하셨습니다.");
		} else if (ticketSelect == 2){
			System.out.println("야간권을 선택하셨습니다.");
		} else {
			opc.printErrorMassage();
			inputTicketSelect();
		}
		
		return ticketSelect;
		
	}
	
	public String inputCustomerIDNumber() {
		opc = new outputClass();
		
		String CustomerIDNumber;
		CustomerIDNumber = scanner.next();
		System.out.printf("주민번호를 입력해주세요.( - 없이 13자리를 입력해주세요)");
		if (CustomerIDNumber.length() == 13) {
			 
		} else {
			opc.printErrorMassage();
			inputCustomerIDNumber();
		}

		return CustomerIDNumber;
	}
	
	public int inputOrderCount() {
		opc = new outputClass();
		
		int orderCount = 0;
		System.out.printf("주문 개수를 입력해주세요.");
		orderCount = scanner.nextInt();

		return orderCount;
	}
	
	public int inputDiscountSelect() {
		opc = new outputClass();
		int discountSelect = 0;
		
		System.out.printf("우대사항을 입력해주세요.");
		System.out.printf("1. 없음 (나이우대는 자동적용됩니다.)");
		System.out.printf("2. 장애인우대.");
		System.out.printf("3. 국가유공자우대.");
		System.out.printf("4. 다자녀우대.");
		System.out.printf("5. 임산부우대.");
		discountSelect = scanner.nextInt();
		
		switch (discountSelect) {
		case '2': 
			System.out.printf("장애인우대를 선택하셨습니다.");
			break;
		case '3':
			System.out.printf("국가유공자우대를 선택하셨습니다.");
			break;
		case '4':
			System.out.printf("다자녀우대를 선택하셨습니다.");
			break;
		case '5':
			System.out.printf("임산부우대를 선택하셨습니다.");
			break;
		default :
			opc.printErrorMassage();
			inputDiscountSelect();
		}
		return discountSelect;
	}

}
