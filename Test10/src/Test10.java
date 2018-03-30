import java.util.Scanner;

public class Test10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("정수 입력 : ");		// 입력받을때 print쓰자. ln사용하면 줄이 내려감
		
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + "은(는) 짝수입니다.");
		} else if (num % 2 != 0) {
			System.out.println(num + "은(는) 홀수입니다.");
		}
		sc.close();		
	}
	
}
