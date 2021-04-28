package Polyland;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class inputClass {
	
	Scanner scanner = new Scanner(System.in);
	outputClass opc = new outputClass(); 
	static typeClass tp = new typeClass();
	static processClass pc = new processClass();
	
	public int inputTicketSelect() throws IOException {
		
		int ticketSelect = 0;
		while(true) {
			System.out.println("권종을 선택해주세요.");
			System.out.println("1. 주간권");
			System.out.println("2. 야간권");
			ticketSelect = scanner.nextInt();
			
			if (ticketSelect == 1) {
				System.out.println("주간권을 선택하셨습니다.\n");
				tp.finalDayTicket = "주간권";
				break;
			} else if (ticketSelect == 2){
				System.out.println("야간권을 선택하셨습니다.\n");
				tp.finalDayTicket = "야간권";
				break;
			} else {
				opc.printErrorMassage();

			}
		}
		return ticketSelect;
	}
	
	public String inputCustomerIDNumber() throws IOException {

		String CustomerIDNumber;
		while(true) {
			System.out.println("주민번호를 입력해주세요.( - 없이 13자리를 입력해주세요)");
			CustomerIDNumber = scanner.next();
			if (CustomerIDNumber.length() == 13) {
				break;
			} else {
				opc.printErrorMassage();
			}
		}
		return CustomerIDNumber;
	}
	
	public int inputOrderCount() {

		int orderCount = 0;
		while(true) {
			System.out.println("\n주문 개수를 입력해주세요.");
			orderCount = scanner.nextInt();
			tp.finalOrderCount = String.valueOf(orderCount);
			if(orderCount > 0) {
				break;
			}
		}

		return orderCount;
	}
	
	public int inputDiscountSelect() throws IOException {

		int discountSelect = 0;
		
		while(true) {
			System.out.println("\n우대사항을 입력해주세요.");
			System.out.println("1. 없음 (나이우대는 자동적용됩니다.)");
			System.out.println("2. 장애인우대.");
			System.out.println("3. 국가유공자우대.");
			System.out.println("4. 다자녀우대.");
			System.out.println("5. 임산부우대.");
			discountSelect = scanner.nextInt();
			
			switch (discountSelect) {
			case 1:
				tp.finalDiscountSelect = "*우대사항 없음";
				break;
			case 2: 
				System.out.println("장애인우대를 선택하셨습니다.\n");
				tp.finalDiscountSelect = "*장애인 우대";
				break;
			case 3:
				System.out.println("국가유공자우대를 선택하셨습니다.\n");
				tp.finalDiscountSelect = "*국가유공 우대";
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
			}
			if (discountSelect > 0 && discountSelect < 6) {
				break;
			}
		}
		return discountSelect;
	}
	
	public int printContinue() {
		int select = 0;
			System.out.println("계속 발권 하시겠습니까?");
			System.out.println("1. 티켓 발권");
			System.out.println("2. 종료");
			select = scanner.nextInt();

		return select;
	}
	
	public int checkNewOrder() {
		int check = 0;
			System.out.printf("계속 진행 (1: 새로운 주문, 2: 프로그램 종료) : ");
			check = scanner.nextInt();
		return check;
	}
	


}
