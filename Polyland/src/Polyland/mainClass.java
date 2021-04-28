package Polyland;

import java.io.IOException;

public class mainClass {
	static processClass pc;
	static inputClass ip;
	static outputClass op;
	static typeClass tp;
	static filewriterClass fw;
	
	public static void main(String[] args) throws IOException {
		ip = new inputClass();
		pc = new processClass();
		op = new outputClass();
		fw = new filewriterClass();
		
		fw.headerWrite();
		while(true) {
			
			while(true) {
				int ticketSelect = ip.inputTicketSelect();
				String customerIDNumber = ip.inputCustomerIDNumber();
				int age = pc.calcAge(customerIDNumber);
				int orderCount = ip.inputOrderCount();
				int price = pc.priceAge(age, ticketSelect, orderCount);
				int discountSelect = ip.inputDiscountSelect();
				pc.priceDiscount(price, discountSelect);
				op.printTotalPrice();
				
				pc.saveFinalTicket();
				fw.dataWrite();
				
				int select = ip.printContinue();
				if(select == 1) {
					continue;
				} else if (select == 2) {
					op.printExitMassage();
					pc.printFinalTicket();
					break;
				}
				
			}
			int check = ip.checkNewOrder();
			if(check == 1) {
				pc.resettypeClass();
				continue;
			} else if (check == 2) {
				break;
			}

		}
		fw.fileClose();

	}
	
}
