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
			System.out.println("������ �������ּ���.");
			System.out.println("1. �ְ���");
			System.out.println("2. �߰���");
			ticketSelect = scanner.nextInt();
			
			if (ticketSelect == 1) {
				System.out.println("�ְ����� �����ϼ̽��ϴ�.\n");
				tp.finalDayTicket = "�ְ���";
				break;
			} else if (ticketSelect == 2){
				System.out.println("�߰����� �����ϼ̽��ϴ�.\n");
				tp.finalDayTicket = "�߰���";
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
			System.out.println("�ֹι�ȣ�� �Է����ּ���.( - ���� 13�ڸ��� �Է����ּ���)");
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
			System.out.println("\n�ֹ� ������ �Է����ּ���.");
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
			}
			if (discountSelect > 0 && discountSelect < 6) {
				break;
			}
		}
		return discountSelect;
	}
	
	public int printContinue() {
		int select = 0;
			System.out.println("��� �߱� �Ͻðڽ��ϱ�?");
			System.out.println("1. Ƽ�� �߱�");
			System.out.println("2. ����");
			select = scanner.nextInt();

		return select;
	}
	
	public int checkNewOrder() {
		int check = 0;
			System.out.printf("��� ���� (1: ���ο� �ֹ�, 2: ���α׷� ����) : ");
			check = scanner.nextInt();
		return check;
	}
	


}
