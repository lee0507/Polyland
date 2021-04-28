package PolylandReport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class processClass {
	static typeClass tp = new typeClass();
	
	public void dayTicketReport(typeClass tp) {
		
		for (int i = 0; i < tp.day1.length; i++) {
			if(tp.day1[i][1].equals("주간권") && tp.day1[i][2].equals("유  아")) {
				tp.baby_day_cnt++;
			} else if (tp.day1[i][1].equals("주간권") && tp.day1[i][2].equals("소  인")) {
				tp.child_day_cnt++;
			} else if (tp.day1[i][1].equals("주간권") && tp.day1[i][2].equals("청소년")) {
				tp.teen_day_cnt++;
			} else if (tp.day1[i][1].equals("주간권") && tp.day1[i][2].equals("성  인")) {
				tp.adult_day_cnt++;
			} else if (tp.day1[i][1].equals("주간권") && tp.day1[i][2].equals("경  로")) {
				tp.old_day_cnt++;
			} else if (tp.day1[i][1].equals("야간권") && tp.day1[i][2].equals("유  아")) {
				tp.baby_night_cnt++;
			} else if (tp.day1[i][1].equals("야간권") && tp.day1[i][2].equals("소  인")) {
				tp.child_night_cnt++;
			} else if (tp.day1[i][1].equals("야간권") && tp.day1[i][2].equals("청소년")) {
				tp.teen_night_cnt++;
			} else if (tp.day1[i][1].equals("야간권") && tp.day1[i][2].equals("성  인")) {
				tp.adult_night_cnt++;
			} else if (tp.day1[i][1].equals("야간권") && tp.day1[i][2].equals("경  로")) {
				tp.old_night_cnt++;
			}
		}
	}

	public void dayTotalPrice(typeClass tp) {
		for (int i = 0; i < tp.day1.length; i++) {
			if(tp.day1[i][1].equals("주간권")) {
				tp.day_totalprice += Integer.parseInt(tp.day1[i][5]);
			} else if (tp.day1[i][1].equals("야간권")) {
				tp.night_totalprice += Integer.parseInt( tp.day1[i][5]);
			}
		}
	}
	public void dateTotalPrice(typeClass tp) {

		for (int i = 0; i < tp.day1.length; i++) {
			tp.dates.add(tp.day1[i][0]);
		}
		Object[] a = tp.dates.toArray();
		
		for (int i = 0; i < a.length; i++) {
			tp.dates2.add((String) a[i]);
		}
		Collections.sort(tp.dates2);
		for (int j = 0; j < tp.dates2.size(); j++) {
			for (int i = 0; i < tp.day1.length; i++) {
				if(tp.dates2.get(j).equals(tp.day1[i][0])) {
					tp.plus_dateprice += Integer.parseInt(tp.day1[i][5]);
				}
			}
			tp.dateprice.add(j, tp.plus_dateprice);
			tp.plus_dateprice = 0;
		}
	}
	
	public void totalgender() {
		
		for (int i = 0; i < tp.day1.length; i++) {
			if(tp.day1[i][3].equals("남성")) {
				tp.man_rate++;
				tp.man_total_price += Integer.parseInt(tp.day1[i][5]);
			} else if (tp.day1[i][3].equals("여성")) {
				tp.woman_rate++;
				tp.woman_total_price += Integer.parseInt(tp.day1[i][5]);
			}
		}
		
	}
	
}
