import java.util.Scanner;

public class MethodTest04 {
	
	// 메소드 정의
	public static void drawStar(int n) {
		for(int i=1; i<=n; i++) {
				System.out.print("* ");
		}
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- 메소드로 나누어 별표 만들기 ---");
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		// 방법 1 - 메소드 사용 X
		/*for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		// 방법 2 - 메소드로 나누었을 때
		for(int i=1; i<=n; i++) {
			drawStar(i);
			System.out.println();
		}
		sc.close();
	}

}
