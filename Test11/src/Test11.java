import java.util.Scanner;

public class Test11 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("���� �Է��ϼ��� : ");
		
		int month = sc.nextInt();
		
		/*// 1�� ���
		if (2 < month && month < 6) {		// 2�� ���(month==3 || month==4 || month==5)
			System.out.println("���Դϴ�.");
		} else if (5 < month && month < 9) {	// 1�� ���(month>=6 && month<=8)
			System.out.println("�����Դϴ�.");
		} else if (8 < month && month < 12) {
			System.out.println("�����Դϴ�.");
		} else if (month == 12 || month == 1 || month ==2) {
			System.out.println("�ܿ��Դϴ�.");
	    }		
		*/
		
		// 3�� ���
		switch(month) {
		case 1:	case 2:	case 12:
			System.out.println("�ܿ� �Դϴ�.");
			break;
		case 3:	case 4:	case 5:
			System.out.println("�� �Դϴ�.");
			break;
		case 6:	case 7:	case 8:
			System.out.println("���� �Դϴ�.");
			break;
		case 9:	case 10: case 11:
			System.out.println("���� �Դϴ�.");
			break;
		default:
			System.out.println("���� ��¥ �Դϴ�.");
		}
		sc.close();
	}

}