package Polyland;


public class outputClass {
	typeClass tp = new typeClass();
	public void printErrorMassage() {
		System.out.printf("다시 입력해주세요\n");
	}
	public void printTotalPrice() {
		System.out.printf("가격은 %s 원입니다.\n", tp.finalTotalPrice);
		System.out.println("감사합니다\n");
	}
	
	public void printExitMassage() {
		System.out.println("티켓 발권을 종료합니다. 감사합니다.");
		System.out.println();
	}
	
}
