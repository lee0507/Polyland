package Polyland;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class filewriterClass {
	typeClass tp = new typeClass();
	private FileWriter fw;
	private boolean isFileExist;
	
	public filewriterClass() {
		try {
			File file = new File("D:\\polyland.csv");
			
			if(file.exists() == false) {
				isFileExist = false;
			} else {
				isFileExist = true;
			}
			fw = new FileWriter("D:\\polyland.csv", true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileClose() {
		try {
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void headerWrite() throws IOException {
		String head = "날짜," + "권종," + "연령구분," + "성별," + "수량," + "가격," + "우대사항" + "\n";
		if (isFileExist == false) {
			fw.write(head);
		}
	}
	
	public void dataWrite() throws IOException {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		String result = sf.format(c.getTime()) + "," + tp.finalDayTicket + "," + tp.finalAge + "," + tp.finalSex 
				+ "," + tp.finalOrderCount + "," + tp.finalTotalPrice + "," + tp.finalDiscountSelect + "\n";
		fw.write(result);
	}
}
