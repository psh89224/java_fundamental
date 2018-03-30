import java.util.Scanner;

public class MethodTest05 {
	
	// 메소드 정의
	public static void count (int x) {
		for(int i=x; i>=0; i--) {
			System.out.println(i);
		}
		return ;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***카운팅 프로그램***");
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		count(n);
		
		System.out.println("카운트가 종료되었습니다.");
		sc.close();
	}

}
