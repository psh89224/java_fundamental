import java.util.Scanner;
public class Test13 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 1 : ");
		int a = sc.nextInt();
		System.out.print("정수입력 2 : ");
		int b = sc.nextInt();
		System.out.print("정수입력 3 : ");
		int c = sc.nextInt();
		
		int max = a , min = a;
		
		// 최대값 구하기  if문은 한번묻고, 또한번 질문, else는 한번묻고 넘기기때문에 여기사용 X
		if (b > max) {
			max = b;
		} 
		if (c > max) {
			max = c;
		}
		
		// 최소값 구하기
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		sc.close();
	}

}
