import java.util.Scanner;

public class MethodTest05 {
	
	// �޼ҵ� ����
	public static void count (int x) {
		for(int i=x; i>=0; i--) {
			System.out.println(i);
		}
		return ;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***ī���� ���α׷�***");
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		count(n);
		
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
		sc.close();
	}

}
