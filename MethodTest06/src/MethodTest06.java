import java.util.Scanner;

public class MethodTest06 {
	
	// �޼ҵ� ����
	public static void drawChars (char c, int n) {
		for (int i=1; i<=n; i++) {
			System.out.print(c);
		}
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***���ڸ� ���ﰢ������ ����� ���α׷�***");
		System.out.print("���� �Է� : ");
		char c = sc.next().charAt(0);
		
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			drawChars(' ', i-1);
			drawChars(c, n-i+1);
			System.out.println();
		}
		sc.close();
	}
}
