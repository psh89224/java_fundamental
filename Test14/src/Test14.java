import java.util.Scanner;

public class Test14 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 1 : ");
		int a = sc.nextInt();
		System.out.print("정수입력 2 : ");
		int b = sc.nextInt();
				
		int temp;		// swap		
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		System.out.println("작은수 : " + a);
		System.out.println("큰 수 : " + b);

		sc.close();
	}

}
