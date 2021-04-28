package Polyland;

import java.util.ArrayList;
import java.util.Scanner;

public class inputClass {
	
	Scanner scanner = new Scanner(System.in);
	outputClass opc = new outputClass(); 
	static typeClass tp = new typeClass();
	
	public int inputTicketSelect() {
		
		int ticketSelect = 0;
		System.out.println("������ �������ּ���.");
		System.out.println("1. �ְ���");
		System.out.println("2. �߰���");
		ticketSelect = scanner.nextInt();
		
		if (ticketSelect == 1) {
			System.out.println("�ְ����� �����ϼ̽��ϴ�.\n");
			tp.finalDayTicket = "�ְ���";
		} else if (ticketSelect == 2){
			System.out.println("�߰����� �����ϼ̽��ϴ�.\n");
			tp.finalDayTicket = "�߰���";
		} else {
			opc.printErrorMassage();
			inputTicketSelect();
		}
		
		return ticketSelect;
		
	}
	
	public String inputCustomerIDNumber() {

		String CustomerIDNumber;
		System.out.println("�ֹι�ȣ�� �Է����ּ���.( - ���� 13�ڸ��� �Է����ּ���)");
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
		System.out.println("\n�ֹ� ������ �Է����ּ���.");
		orderCount = scanner.nextInt();
		tp.finalOrderCount = String.valueOf(orderCount);

		return orderCount;
	}
	
	public int inputDiscountSelect() {

		int discountSelect = 0;
		
		System.out.println("\n�������� �Է����ּ���.");
		System.out.println("1. ���� (���̿��� �ڵ�����˴ϴ�.)");
		System.out.println("2. ����ο��.");
		System.out.println("3. ���������ڿ��.");
		System.out.println("4. ���ڳ���.");
		System.out.println("5. �ӻ�ο��.");
		discountSelect = scanner.nextInt();
		
		switch (discountSelect) {
		case 1:
			tp.finalDiscountSelect = "*������ ����";
			break;
		case 2: 
			System.out.println("����ο�븦 �����ϼ̽��ϴ�.\n");
			tp.finalDiscountSelect = "*����� ���";
			break;
		case 3:
			System.out.println("���������ڿ�븦 �����ϼ̽��ϴ�.\n");
			tp.finalDiscountSelect = "*�������� ���";
			break;
		case 4:
			System.out.println("���ڳ��븦 �����ϼ̽��ϴ�.\n");
			tp.finalDiscountSelect = "*���ڳ� ���";
			break;
		case 5:
			System.out.println("�ӻ�ο�븦 �����ϼ̽��ϴ�.\n");
			tp.finalDiscountSelect = "*�ӻ�� ���";
			break;
		default :
			opc.printErrorMassage();
			inputDiscountSelect();
		}
		return discountSelect;
	}
	
	public int printContinue() {
		System.out.println("��� �߱� �Ͻðڽ��ϱ�?");
		System.out.println("1. Ƽ�� �߱�");
		System.out.println("2. ����");
		int select = scanner.nextInt();
		
		return select;
	}
	
	public int checkNewOrder() {
		System.out.printf("��� ���� (1: ���ο� �ֹ�, 2: ���α׷� ����) : ");
		int check = scanner.nextInt();
		
		return check;
	}
	


}
