import java.util.Scanner;

public class Test09 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);	// Scanner 콘솔에 입력(in)하기위한 클래스
		     // sc 참조변수		      // ↑입력(in)스트림			
		System.out.print("정수 입력 : ");
	        // ↑출력(out)스트림
		int num = sc.nextInt();	
		
		if (num > 0) {
			System.out.println("입력하신 숫자는 양수입니다.");
		} else if (num < 0) {
			System.out.println("입력하신 숫자는 음수입니다.");
		} else {		// else if (num == 0)
			System.out.println("입력하신 숫자는 0입니다.");
		}
		
		sc.close();
	}

}
