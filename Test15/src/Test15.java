import java.util.Scanner;

public class Test15 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴선택 (1~3) : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("파일 읽기");
			break;
		case 2:
			System.out.println("파일 저장");
			break;
		case 3:
		case 4:	// 3,4 둘다 파일닫기 출력
			System.out.println("파일 닫기");
			break;
		default:
			System.out.println("파일 읽기 실패");
			break;
		}
		// Test 11번에도 예문 있음
		sc.close();
	}

}
