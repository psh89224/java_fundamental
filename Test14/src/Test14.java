import java.util.Scanner;

public class Test14 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Է� 1 : ");
		int a = sc.nextInt();
		System.out.print("�����Է� 2 : ");
		int b = sc.nextInt();
				
		int temp;		// swap		
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		System.out.println("������ : " + a);
		System.out.println("ū �� : " + b);

		sc.close();
	}

}
