import java.util.Scanner;

public class Test10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("���� �Է� : ");		// �Է¹����� print����. ln����ϸ� ���� ������
		
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + "��(��) ¦���Դϴ�.");
		} else if (num % 2 != 0) {
			System.out.println(num + "��(��) Ȧ���Դϴ�.");
		}
		sc.close();		
	}
	
}
