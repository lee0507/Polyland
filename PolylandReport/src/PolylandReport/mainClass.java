package PolylandReport;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class mainClass {


	static typeClass tp;
	static outputClass op;
	public static void main(String[] args) throws IOException {
		processClass pc = new processClass();
		filereaderClass fr = new filereaderClass();
		tp = new typeClass();
		op = new outputClass();
		
		tp.datas = new ArrayList<String>();
		tp.day1 = new String[tp.datas.size()][7];
		tp.dates = new HashSet<String>();
		tp.dates2 = new ArrayList<String>();

		tp.dateprice = new ArrayList<Integer>();
		
		
		fr.filereader();
		pc.dayTicketReport(tp);
		pc.dayTotalPrice(tp);
		pc.dateTotalPrice(tp);
		pc.totalgender();
		pc.totaldiscount();
		op.printdayticket();
		op.printtotalprice();
		op.printdateprice();
		op.printrate();
		op.printdiscount();




		
	}

}
