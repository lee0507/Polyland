package Polyland;


public class outputClass {
	typeClass tp = new typeClass();
	public void printErrorMassage() {
		System.out.printf("���߸� �Է��ϼ̽��ϴ�.\n��ó������ �ٽ� �Է����ּ���\n");
		System.out.println();
	}
	public void printTotalPrice() {
		System.out.printf("������ %s ���Դϴ�.\n", tp.finalTotalPrice);
		System.out.println("�����մϴ�\n");
	}
	
	public void printExitMassage() {
		System.out.println("Ƽ�� �߱��� �����մϴ�. �����մϴ�.");
		System.out.println();
	}
	
}
