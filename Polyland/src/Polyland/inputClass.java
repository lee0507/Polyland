package Polyland;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class inputClass {
	
	Scanner scanner = new Scanner(System.in);
	outputClass opc = new outputClass(); 
	typeClass tp = new typeClass();
	processClass pc = new processClass();
	
	public int inputTicketSelect(typeClass tp) throws IOException {

		while(true) {
			System.out.println("������ �������ּ���.");
			System.out.println("1. �ְ���");
			System.out.println("2. �߰���");
			tp.ticketSelect = scanner.nextInt();
			
			if (tp.ticketSelect == 1) {
				System.out.println("�ְ����� �����ϼ̽��ϴ�.\n");
				tp.finalDayTicket = "�ְ���";
				break;
			} else if (tp.ticketSelect == 2){
				System.out.println("�߰����� �����ϼ̽��ϴ�.\n");
				tp.finalDayTicket = "�߰���";
				break;
			} else {
				opc.printErrorMassage();

			}
		}
		return tp.ticketSelect;
	}
	
	public String inputCustomerIDNumber(typeClass tp) throws IOException {

		while(true) {
			System.out.println("�ֹι�ȣ�� �Է����ּ���.( - ���� 13�ڸ��� �Է����ּ���)");
			tp.CustomerIDNumber = scanner.next();
			if (tp.CustomerIDNumber.length() == 13) {
				break;
			} else {
				opc.printErrorMassage();
			}
		}
		return tp.CustomerIDNumber;
	}
	
	public int inputOrderCount(typeClass tp) {

		while(true) {
			System.out.println("\n�ֹ� ������ �Է����ּ���.");
			tp.orderCount = scanner.nextInt();
			tp.finalOrderCount = String.valueOf(tp.orderCount);
			if(tp.orderCount > 0) {
				break;
			}
		}

		return tp.orderCount;
	}
	
	public int inputDiscountSelect(typeClass tp) throws IOException {
		
		while(true) {
			System.out.println("\n�������� �Է����ּ���.");
			System.out.println("1. ���� (���̿��� �ڵ�����˴ϴ�.)");
			System.out.println("2. ����� ���");
			System.out.println("3. ���������� ���");
			System.out.println("4. ���ڳ� ���");
			System.out.println("5. �ӻ�� ���");
			tp.discountSelect = scanner.nextInt();
			
			switch (tp.discountSelect) {
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
			if (tp.discountSelect > 0 && tp.discountSelect < 6) {
				break;
			}
		}
		return tp.discountSelect;
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
