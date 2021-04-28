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
		System.out.printf("주간권 총 매출 : %d원\n", tp.day_totalprice);
		System.out.printf("야간권 총 매출 : %d원\n", tp.night_totalprice);
		System.out.println();
	}
	
	public void printrate() {
		double a = tp.woman_rate + tp.man_rate;
		System.out.println("남여별 비율");
		System.out.printf("여성비율 : %.2f%s 여성매출 : %s원\n", ((tp.woman_rate) / a) * 100, "%", tp.woman_total_price);
		System.out.printf("남성비율 : %.2f%s 남성매출 : %s원\n", ((tp.man_rate) / a) * 100, "%", tp.man_total_price);
		System.out.println();
		
		
	}
	
	public void printdateprice() {
		System.out.println("날짜별 매출");
		for (int i = 0; i < tp.dates2.size(); i++) {
			System.out.printf("%s %s원\n", tp.dates2.get(i), tp.dateprice.get(i));
		}
		System.out.println();
	}
	
	public void printdiscount() {
		System.out.println("우대권 현황");
		System.out.printf("우대사항 없음 : %d개\n", tp.normal_cnt);
		System.out.printf("장애인 우대권 : %d개\n", tp.disabled_cnt);
		System.out.printf("국가유공 우대권 : %d개\n", tp.merit_cnt);
		System.out.printf("다자녀 우대권 : %d개\n", tp.multichild_cnt);
		System.out.printf("임산부 우대권 : %d개\n", tp.pregnant_cnt);
		System.out.println();
	}
}
