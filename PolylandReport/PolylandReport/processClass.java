package PolylandReport;

public class processClass {
	static typeClass tp = new typeClass();
	
	public void dayTicketReport() {
		if(tp.field[1].equals("�ְ���") && tp.field[2].equals("��  ��")) {
			tp.baby_day_cnt++;
		} else if (tp.field[1].equals("�ְ���") && tp.field[2].equals("��  ��")) {
			tp.child_day_cnt++;
		} else if (tp.field[1].equals("�ְ���") && tp.field[2].equals("��  ��")) {
			tp.teen_day_cnt++;
		} else if (tp.field[1].equals("�ְ���") && tp.field[2].equals("��  ��")) {
			tp.adult_day_cnt++;
		} else if (tp.field[1].equals("�ְ���") && tp.field[2].equals("û�ҳ�")) {
			tp.old_day_cnt++;
		} else if (tp.field[1].equals("�߰���") && tp.field[2].equals("û�ҳ�")) {
			tp.baby_night_cnt++;
		} else if (tp.field[1].equals("�߰���") && tp.field[2].equals("��  ��")) {
			tp.child_night_cnt++;
		} else if (tp.field[1].equals("�߰���") && tp.field[2].equals("��  ��")) {
			tp.teen_night_cnt++;
		} else if (tp.field[1].equals("�߰���") && tp.field[2].equals("��  ��")) {
			tp.adult_night_cnt++;
		} else if (tp.field[1].equals("�߰���") && tp.field[2].equals("��  ��")) {
			tp.old_night_cnt++;
		}
	}
}
