package PolylandReport;

public class outputClass {
	static typeClass tp = new typeClass();
	
	public void printdayticket() {
		System.out.printf("�ְ��� �м�\n");
		System.out.printf("�ְ��� ���� : %s��, �ְ��� ���� : %s��, �ְ��� û�ҳ� : %s��, �ְ��� ���� : %s��, �ְ��� ��� : %s��\n",
				tp.baby_day_cnt, tp.child_day_cnt, tp.teen_day_cnt, tp.adult_day_cnt, tp.old_day_cnt);
		System.out.println();
		System.out.printf("�߰��� �м�\n");
		System.out.printf("�߰��� ���� : %s��, �߰��� ���� : %s��, �߰��� û�ҳ� : %s��, �߰��� ���� : %s��, �߰��� ��� : %s��\n",
				tp.baby_night_cnt, tp.child_night_cnt, tp.teen_night_cnt, tp.adult_night_cnt, tp.old_night_cnt);
		System.out.println();
	}
	
	public void printtotalprice() {
		System.out.printf("�ְ��� �� ���� : %d��\n", tp.day_totalprice);
		System.out.printf("�߰��� �� ���� : %d��\n", tp.night_totalprice);
		System.out.println();
	}
	
	public void printrate() {
		double a = tp.woman_rate + tp.man_rate;
		System.out.println("������ ����");
		System.out.printf("�������� : %.2f%s �������� : %s��\n", ((tp.woman_rate) / a) * 100, "%", tp.woman_total_price);
		System.out.printf("�������� : %.2f%s �������� : %s��\n", ((tp.man_rate) / a) * 100, "%", tp.man_total_price);
		System.out.println();
		
		
	}
	
	public void printdateprice() {
		System.out.println("��¥�� ����");
		for (int i = 0; i < tp.dates2.size(); i++) {
			System.out.printf("%s %s��\n", tp.dates2.get(i), tp.dateprice.get(i));
		}
		System.out.println();
	}
	
	public void printdiscount() {
		System.out.println("���� ��Ȳ");
		System.out.printf("������ ���� : %d��\n", tp.normal_cnt);
		System.out.printf("����� ���� : %d��\n", tp.disabled_cnt);
		System.out.printf("�������� ���� : %d��\n", tp.merit_cnt);
		System.out.printf("���ڳ� ���� : %d��\n", tp.multichild_cnt);
		System.out.printf("�ӻ�� ���� : %d��\n", tp.pregnant_cnt);
		System.out.println();
	}
}
