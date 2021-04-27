package PolylandReport;

import java.io.IOException;

public class mainClass {
	static filereaderClass fr = new filereaderClass();
	static processClass pc = new processClass();
	static typeClass tp = new typeClass();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		fr.filereader();
		pc.dayTicketReport();
		System.out.println(tp.adult_night_cnt);
		
	}

}
