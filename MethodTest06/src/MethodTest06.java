import java.util.Scanner;

public class MethodTest06 {
	
	// 메소드 정의
	public static void drawChars (char c, int n) {
		for (int i=1; i<=n; i++) {
			System.out.print(c);
		}
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***문자를 직삼각형으로 만드는 프로그램***");
		System.out.print("문자 입력 : ");
		char c = sc.next().charAt(0);
		
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			drawChars(' ', i-1);
			drawChars(c, n-i+1);
			System.out.println();
		}
		sc.close();
	}
}
