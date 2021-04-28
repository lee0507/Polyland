package PolylandReport;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class filereaderClass {//클래스선언
	static processClass pc = new processClass();
	static typeClass tp = new typeClass();
	public static String[][] filereader() throws IOException {

		File f = new File("d:polyland.csv");
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String readtxt;
		
		if((readtxt = br.readLine()) == null) { 
			System.out.printf("빈 파일입니다\n");
		}
		
		tp.field_name = readtxt.split(",");
		System.out.printf("================================[report.csv]===========================\n");
		System.out.printf("%5s %8s %6s %3s %3s %6s %10s\n", tp.field_name[0], tp.field_name[1], tp.field_name[2], 
				tp.field_name[3], tp.field_name[4], tp.field_name[5], tp.field_name[6]);
		System.out.printf("=======================================================================\n");
		
		tp.datas = new ArrayList<String>();
		int LineCnt = 0;
		while ((readtxt = br.readLine()) != null) {
			tp.field = readtxt.split(",");
			for (int j = 0; j < 1; j++) {
				System.out.printf("%10s %5s   %-3s %4s %3s %10s원 %9s \n", tp.field[0], tp.field[1], tp.field[2], 
						tp.field[3], tp.field[4], tp.field[5], tp.field[6]);
			}
			
			tp.datas.add(readtxt);
			
			if (LineCnt == 100) break;
			LineCnt++;
		}
		System.out.printf("=======================================================================\n");
		
		tp.day1 = new String[tp.datas.size()][7];
		for (int i = 0; i< tp.datas.size(); i++) {
			tp.day1[i] = tp.datas.get(i).split(",");
		}
		
		br.close();
		
		return tp.day1;

	}
}
