import java.util.Scanner;

public class DoWhile03 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int month;
		String retry;
		
		do {
			
			do {
				System.out.print("������ ǥ���մϴ�. �� �Է�(1~12) : ");
				month=sc.nextInt();
			} while(month<1 || month>12);
			
			switch(month) {
			case 3: case 4: case 5:
				System.out.println(month + "���� ���Դϴ�.");
				break;
			case 6: case 7: case 8:
				System.out.println(month + "���� �����Դϴ�.");
				break;
			case 9: case 10: case 11:
				System.out.println(month + "���� �����Դϴ�.");
				break;
			case 1: case 2: case 12:
				System.out.println(month + "���� �ܿ��Դϴ�.");
				break;
			}
			System.out.print("�� �� �� �Ͻðڽ��ϱ�?(Y/N) : ");
			retry=sc.next();
		
		} while(retry.equalsIgnoreCase("y"));	//  .equal�޼ҵ� ����ؼ� ����y�� �����Ѵ�.
			System.out.print("���α׷��� ����Ǿ����ϴ�.");
		sc.close();
	}

}
