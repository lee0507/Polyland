package PolylandReport;

public class processClass {
	static typeClass tp = new typeClass();
	
	public void dayTicketReport() {
		if(tp.field[1].equals("주간권") && tp.field[2].equals("유  아")) {
			tp.baby_day_cnt++;
		} else if (tp.field[1].equals("주간권") && tp.field[2].equals("유  아")) {
			tp.child_day_cnt++;
		} else if (tp.field[1].equals("주간권") && tp.field[2].equals("소  인")) {
			tp.teen_day_cnt++;
		} else if (tp.field[1].equals("주간권") && tp.field[2].equals("소  인")) {
			tp.adult_day_cnt++;
		} else if (tp.field[1].equals("주간권") && tp.field[2].equals("청소년")) {
			tp.old_day_cnt++;
		} else if (tp.field[1].equals("야간권") && tp.field[2].equals("청소년")) {
			tp.baby_night_cnt++;
		} else if (tp.field[1].equals("야간권") && tp.field[2].equals("성  인")) {
			tp.child_night_cnt++;
		} else if (tp.field[1].equals("야간권") && tp.field[2].equals("성  인")) {
			tp.teen_night_cnt++;
		} else if (tp.field[1].equals("야간권") && tp.field[2].equals("경  로")) {
			tp.adult_night_cnt++;
		} else if (tp.field[1].equals("야간권") && tp.field[2].equals("경  로")) {
			tp.old_night_cnt++;
		}
	}
}
