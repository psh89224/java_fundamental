import java.util.Scanner;
public class DoWhile02 {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		int menu;
		
		do {
			System.out.println("1 : ���� ����");
			System.out.println("2 : ���� �ۼ�");
			System.out.println("3 : ���� ����");
			System.out.println("4 : ���� �ݱ�");
			System.out.print("�޴��� �����ϼ���.(1~4) : ");
			menu = sc.nextInt();
		} while(!(menu>=1 && menu<=4)); // while(menu<1 || menu>4)
		
		// System.out.println(menu + "�� �޴��� ���� �Ǿ����ϴ�.");
		switch(menu) {
		case 1:
			System.out.println("������ ���� �ϼ̽��ϴ�.");
			break;
		case 2:
			System.out.println("������ �ۼ� �ϼ̽��ϴ�.");
			break;
		case 3:
			System.out.println("������ ���� �ϼ̽��ϴ�.");
			break;
		case 4:
			System.out.println("������ �����̽��ϴ�.");
			break;
		}
				
		sc.close();
	}
}