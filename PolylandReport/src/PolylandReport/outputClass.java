package PolylandReport;

public class outputClass {
	static typeClass tp = new typeClass();
	
	public void printdayticket() {
		System.out.printf("주간권 분석\n");
		System.out.printf("주간권 유아 : %s개, 주간권 소인 : %s개, 주간권 청소년 : %s개, 주간권 성인 : %s개, 주간권 경로 : %s개\n",
				tp.baby_day_cnt, tp.child_day_cnt, tp.teen_day_cnt, tp.adult_day_cnt, tp.old_day_cnt);
		System.out.println();
		System.out.printf("야간권 분석\n");
		System.out.printf("야간권 유아 : %s개, 야간권 소인 : %s개, 야간권 청소년 : %s개, 야간권 성인 : %s개, 야간권 경로 : %s개\n",
				tp.baby_night_cnt, tp.child_night_cnt, tp.teen_night_cnt, tp.adult_night_cnt, tp.old_night_cnt);
		System.out.println();
	}
	
	public void printtotalprice() {
		System.out.printf("주간권 총 매출 %d원\n", tp.day_totalprice);
		System.out.printf("야간권 총 매출 %d원\n", tp.night_totalprice);
		System.out.println();
	}
	
	public void printdateprice() {
		for (int i = 0; i < tp.dates2.size(); i++) {
			System.out.printf("%s %s원\n", tp.dates2.get(i), tp.dateprice.get(i));
		}
	}
}
