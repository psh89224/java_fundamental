import java.util.Scanner;

public class Test11 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("월을 입력하세요 : ");
		
		int month = sc.nextInt();
		
		/*// 1번 방법
		if (2 < month && month < 6) {		// 2번 방법(month==3 || month==4 || month==5)
			System.out.println("봄입니다.");
		} else if (5 < month && month < 9) {	// 1번 방법(month>=6 && month<=8)
			System.out.println("여름입니다.");
		} else if (8 < month && month < 12) {
			System.out.println("가을입니다.");
		} else if (month == 12 || month == 1 || month ==2) {
			System.out.println("겨울입니다.");
	    }		
		*/
		
		// 3번 방법
		switch(month) {
		case 1:	case 2:	case 12:
			System.out.println("겨울 입니다.");
			break;
		case 3:	case 4:	case 5:
			System.out.println("봄 입니다.");
			break;
		case 6:	case 7:	case 8:
			System.out.println("여름 입니다.");
			break;
		case 9:	case 10: case 11:
			System.out.println("가을 입니다.");
			break;
		default:
			System.out.println("없는 날짜 입니다.");
		}
		sc.close();
	}

}