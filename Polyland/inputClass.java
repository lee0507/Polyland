package Polyland;

import java.util.Scanner;

public class inputClass {
	
	Scanner scanner = new Scanner(System.in);
	outputClass opc; 
	
	public int inputTicketSelect() {
		opc = new outputClass();
		
		int ticketSelect = 0;
		System.out.printf("������ �������ּ���.\n");
		System.out.printf("1. �ְ���\n");
		System.out.printf("2. �߰���\n");
		ticketSelect = scanner.nextInt();
		
		if (ticketSelect == 1) {
			System.out.println("�ְ����� �����ϼ̽��ϴ�.");
		} else if (ticketSelect == 2){
			System.out.println("�߰����� �����ϼ̽��ϴ�.");
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
		System.out.printf("�ֹι�ȣ�� �Է����ּ���.( - ���� 13�ڸ��� �Է����ּ���)");
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
		System.out.printf("�ֹ� ������ �Է����ּ���.");
		orderCount = scanner.nextInt();

		return orderCount;
	}
	
	public int inputDiscountSelect() {
		opc = new outputClass();
		int discountSelect = 0;
		
		System.out.printf("�������� �Է����ּ���.");
		System.out.printf("1. ���� (���̿��� �ڵ�����˴ϴ�.)");
		System.out.printf("2. ����ο��.");
		System.out.printf("3. ���������ڿ��.");
		System.out.printf("4. ���ڳ���.");
		System.out.printf("5. �ӻ�ο��.");
		discountSelect = scanner.nextInt();
		
		switch (discountSelect) {
		case '2': 
			System.out.printf("����ο�븦 �����ϼ̽��ϴ�.");
			break;
		case '3':
			System.out.printf("���������ڿ�븦 �����ϼ̽��ϴ�.");
			break;
		case '4':
			System.out.printf("���ڳ��븦 �����ϼ̽��ϴ�.");
			break;
		case '5':
			System.out.printf("�ӻ�ο�븦 �����ϼ̽��ϴ�.");
			break;
		default :
			opc.printErrorMassage();
			inputDiscountSelect();
		}
		return discountSelect;
	}

}
